package main.java.com.cfil360.mmorpg.races.Listeners;

import main.java.com.cfil360.mmorpg.CorePlugin;
import main.java.com.cfil360.mmorpg.Managers.RaceManager;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

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
public class SwimListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        //define player
        Player player = event.getPlayer();

        if(player.getLocation().getBlock().getType().equals(Material.STATIONARY_WATER)) {          //test to see if the player is in water
            if(CorePlugin.getPlayerManager().getRace(player.getUniqueId()).getSwim() > 0) {
                //change the player's velocity while moving in water
                //TODO test effectiveness of velocity
                Vector dir = player.getLocation().getDirection().normalize().multiply(CorePlugin.getPlayerManager().getRace(player.getUniqueId()).getSwim() - 1.6D);
                Vector vec = new Vector(dir.getX(), dir.getY(), dir.getZ());
                player.setVelocity(vec);
            }
        }
    }
}
