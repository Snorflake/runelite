/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
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

package net.runelite.client.plugins.boosts;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Skill;
import net.runelite.client.RuneLite;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;

class BoostsOverlay extends Overlay
{
	private static final int WIDTH = 140;

	private static final Color BACKGROUND = new Color(Color.gray.getRed(), Color.gray.getGreen(), Color.gray.getBlue(), 127);

	private static final Skill[] SHOW = new Skill[] { Skill.ATTACK, Skill.STRENGTH, Skill.DEFENCE, Skill.RANGED, Skill.MAGIC };

	private static final int TOP_BORDER = 2;
	private static final int LEFT_BORDER = 2;
	private static final int RIGHT_BORDER = 2;

	private static final int SEPARATOR = 2;
	
	BoostsOverlay()
	{
		super(OverlayPosition.TOP_LEFT, OverlayPriority.MED);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Client client = RuneLite.getClient();

		if (client.getGameState() != GameState.LOGGED_IN)
			return null;
		
		FontMetrics metrics = graphics.getFontMetrics();

		int height = TOP_BORDER;
		for (Skill skill : SHOW)
		{
			int boosted = client.getBoostedSkillLevel(skill),
				base = client.getRealSkillLevel(skill);

			if (boosted == base)
				continue;

			height += metrics.getHeight() + SEPARATOR;
		}

		if (height == TOP_BORDER)
			return null;

		graphics.setColor(BACKGROUND);
		graphics.fillRect(0, 0, WIDTH, height);

		int y = TOP_BORDER;
		for (Skill skill : SHOW)
		{
			int boosted = client.getBoostedSkillLevel(skill),
				base = client.getRealSkillLevel(skill);

			if (boosted == base)
				continue;

			graphics.setColor(Color.white);
			graphics.drawString(skill.getName(), LEFT_BORDER, y + metrics.getHeight());

			String str = boosted + "/" + base;
			graphics.drawString(str, WIDTH - RIGHT_BORDER - metrics.stringWidth(str), y + metrics.getHeight());

			y += metrics.getHeight() + SEPARATOR;
		}

		return new Dimension(WIDTH, height);
	}

}
