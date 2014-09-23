package main.java.com.cfil360.mmorpg.races.Listeners;

import main.java.com.cfil360.mmorpg.CorePlugin;
import main.java.com.cfil360.mmorpg.Managers.RaceManager;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

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
public class SprintListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        //define player
        Player player = event.getPlayer();

        if(player.isSprinting()) {          //test to see if the player is sprinting
            if(CorePlugin.getPlayerManager().getRace(player.getUniqueId()).getSprint() > 0) {
                //add a speed effect to the player everytime they move based on their race stats
                //TODO test effectiveness of potion
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 500, (int)Math.round(CorePlugin.getPlayerManager().getRace(player.getUniqueId()).getSprint()) - 2));
            }
        }
        else {
            //remove the speed potion effect if the player isn't sprinting
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 0, 0), true);
        }
    }
}
