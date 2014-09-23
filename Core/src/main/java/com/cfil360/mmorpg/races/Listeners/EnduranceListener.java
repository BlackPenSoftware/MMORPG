package main.java.com.cfil360.mmorpg.races.Listeners;

import main.java.com.cfil360.mmorpg.CorePlugin;
import main.java.com.cfil360.mmorpg.Managers.PlayerManager;
import main.java.com.cfil360.mmorpg.Managers.RaceManager;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * *****************************************************
 * Copyright Cfil360 (c) 3014.  All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar branding
 * are the sole property of Cfil360.  Distribution, reproduction,m taking snippets or
 * claiming any contents as your own will break the terms of the liscense, and void any
 * agreements with you, the third party.
 * thanks
 * *****************************************************
 */
public class EnduranceListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        //define player
        Player player = event.getPlayer();

        //set the players max health on join based on race stats
        player.setMaxHealth(CorePlugin.getPlayerManager().getRace(player.getUniqueId()).getEndurance());
    }
}
