package net.runelite.client.plugins.cannon;/*
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

import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.Query;
import net.runelite.api.queries.GameObjectQuery;
import net.runelite.client.RuneLite;
import net.runelite.client.RuneliteProperties;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.task.Schedule;

import java.time.temporal.ChronoUnit;

public class CannonPlugin extends Plugin
{

	private final Client client = RuneLite.getClient();
	private final RuneLite runelite = RuneLite.getRunelite();
	@Override
	protected void startUp() throws Exception
	{

	}

	@Override
	protected void shutDown() throws Exception
	{

	}


	@Schedule(
			period = 1500,
			unit = ChronoUnit.MILLIS
	)
	public void update()
	{
		if(client == null || client.getGameState() != GameState.LOGGED_IN)
			return;

		GameObject cannon = findCannon();
		if(cannon == null) return;


	}

	private GameObject findCannon()
	{
		Query query = new GameObjectQuery().idEquals(6);
		GameObject[] result = runelite.runQuery(query);
		return result.length >= 1 ? result[0] : null;
	}
}
