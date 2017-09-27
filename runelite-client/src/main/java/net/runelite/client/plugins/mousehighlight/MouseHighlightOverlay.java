/*
 * Copyright (c) 2017, Aria <aria@ar1as.space>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.mousehighlight;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Point;
import net.runelite.client.RuneLite;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;

class MouseHighlightOverlay extends Overlay
{
	// Grabs the colour and name from a target string
	// <col=ffffff>Player1
	private final Pattern p = Pattern.compile("^<col=([^>]+)>([^<]*)");
	private final MouseHighlightConfig config;

	MouseHighlightOverlay(MouseHighlight plugin)
	{
		super(OverlayPosition.DYNAMIC);
		this.config = plugin.getConfig();
	}
	@Override
	public Dimension render(Graphics2D graphics)
	{
		Client client = RuneLite.getClient();

		if (client.getGameState() != GameState.LOGGED_IN || !config.enabled())
		{
			return null;
		}

		if (client.isMenuOpen())
		{
			return null;
		}

		String[] targets = client.getMenuTargets();
		String[] options = client.getMenuOptions();
		int count = client.getMenuOptionCount() - 1;

		if (count < 0 || count >= targets.length || count >= options.length)
		{
			return null;
		}

		String target = targets[count];
		String option = options[count];

		if (target.isEmpty())
		{
			return null;
		}

		// Trivial options that don't need to be highlighted, add more as they appear.
		switch (option)
		{
			case "Walk here":
			case "Cancel":
			case "Continue":
			case "Message":
				return null;
		}

		Matcher m = p.matcher(target);
		if (!m.find())
		{
			return null;
		}

		String colour = m.group(1);
		String matchedTarget = m.group(2);

		// Remove colour text from option
		option = option.replaceAll("<col=([^>]+)>", "");

		Point mouse = client.getMouseCanvasPosition();
		int x = mouse.getX();
		int y = mouse.getY();

		FontMetrics fm = graphics.getFontMetrics();
		// Gets the widths of the various strings we will be displaying
		int option_width = fm.stringWidth(option + " ");
		int total_width = option_width + fm.stringWidth(matchedTarget);
		int height = fm.getHeight();

		x -= total_width + 6; // Draw to the left of the mouse
		y -= height / 2; // Draw slightly above the mouse

		// Don't draw off of the screen
		if (x < 0)
		{
			x = 0;
		}
		if (y < 0)
		{
			y = 0;
		}

		Color gray = new Color(Color.darkGray.getRed(), Color.darkGray.getGreen(), Color.darkGray.getBlue(), 190);
		graphics.setColor(gray);

		// Draws the background rect
		graphics.fillRect(x, y - (height / 2), total_width + 6, height);

		// Draws the outline of the rect
		graphics.setColor(Color.cyan);
		graphics.drawRect(x, y - (height / 2), total_width + 6, height);
		x += 3;
		y += 5;

		graphics.setColor(Color.white);
		// Draws the option (Use, Walk here, Wield)
		graphics.drawString(option + " ", x, y);
		// Sets the string colour to the colour the game uses.
		graphics.setColor(hex2rgb(colour));
		// Draws the target (Player, item)
		graphics.drawString(matchedTarget, x + option_width, y);

		return null;
	}

	private static Color hex2rgb(String col)
	{
		if (col.length() < 6)
		{
			return new Color(0, 255, 255);
		}

		return new Color(
			Integer.valueOf(col.substring(0, 2), 16),
			Integer.valueOf(col.substring(2, 4), 16),
			Integer.valueOf(col.substring(4, 6), 16)
		);
	}
}
