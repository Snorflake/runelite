/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.api.widgets;

public enum WidgetInfo
{
	INVENTORY(WidgetID.INVENTORY_GROUP_ID, 0),

	PESTCONTROL_PURPLE_SHIELD(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.PURPLE_SHIELD),
	PESTCONTROL_BLUE_SHIELD(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.BLUE_SHIELD),
	PESTCONTROL_YELLOW_SHIELD(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.YELLOW_SHIELD),
	PESTCONTROL_RED_SHIELD(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.RED_SHIELD),
	PESTCONTROL_PURPLE_HEALTH(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.PURPLE_HEALTH),
	PESTCONTROL_BLUE_HEALTH(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.BLUE_HEALTH),
	PESTCONTROL_YELLOW_HEALTH(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.YELLOW_HEALTH),
	PESTCONTROL_RED_HEALTH(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.RED_HEALTH),
	PESTCONTROL_PURPLE_ICON(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.PURPLE_ICON),
	PESTCONTROL_BLUE_ICON(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.BLUE_ICON),
	PESTCONTROL_YELLOW_ICON(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.YELLOW_ICON),
	PESTCONTROL_RED_ICON(WidgetID.PESTRCONTROL_GROUP_ID, WidgetID.PestControl.RED_ICON),

	CLAN_CHAT_TITLE(WidgetID.CLAN_CHAT_GROUP_ID, WidgetID.ClanChat.TITLE),
	CLAN_CHAT_NAME(WidgetID.CLAN_CHAT_GROUP_ID, WidgetID.ClanChat.NAME),
	CLAN_CHAT_OWNER(WidgetID.CLAN_CHAT_GROUP_ID, WidgetID.ClanChat.OWNER);

	private final int groupId;
	private final int childId;

	private WidgetInfo(int groupId, int childId)
	{
		this.groupId = groupId;
		this.childId = childId;
	}

	public int getGroupId()
	{
		return groupId;
	}

	public int getChildId()
	{
		return childId;
	}

}
