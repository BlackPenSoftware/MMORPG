package main.java.com.cfil360.mmorpg.Events.Listeners;

import main.java.com.cfil360.mmorpg.Events.NewPlayerEvent;
import main.java.com.cfil360.mmorpg.Events.RaceSelectEvent;
import main.java.com.cfil360.mmorpg.Managers.MessageManager;

import org.bukkit.Bukkit;
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
public class NewPlayerEventListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        //define a player for use
        Player player = event.getPlayer();

        //create a new player event
        Bukkit.getServer().getPluginManager().callEvent(new NewPlayerEvent(player));
    }

    @EventHandler
    public void onNewPlayerEvent(NewPlayerEvent event) {
        //define a player for use
        Player player = event.getPlayer();

        //welcome player
        MessageManager.getInstance().msg(player, MessageManager.MessageType.INFO, "Welcome to §aNarnia!");
        MessageManager.getInstance().msg(player, MessageManager.MessageType.INFO, "The wonderful world of exploration");


        //tell player to select a race
        MessageManager.getInstance().msg(player, MessageManager.MessageType.INFO, "Please select a race!");

        //call raceSelectEvent
        Bukkit.getServer().getPluginManager().callEvent(new RaceSelectEvent(player));


        //explain to player the wonderful journey
    }
}
