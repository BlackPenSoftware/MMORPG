package main.java.com.cfil360.mmorpg.races.Listeners;

import main.java.com.cfil360.mmorpg.CorePlugin;
import main.java.com.cfil360.mmorpg.Managers.RaceManager;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

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
public class StrengthListener implements Listener {
    @EventHandler
    public void onMeleeAttack(EntityDamageByEntityEvent event) {
        //if the victim and attacker aren't players then end code
        if(!(event.getEntity() instanceof Player) && !(event.getDamager() instanceof Player)) return;

        //define some simple player variables
        Player victim = (Player) event.getEntity();
        Player attacker = (Player) event.getDamager();

        //check to see if it is a melee attack if not end code
        if(!isMeleeAttack(event, attacker)) return;

        //damage the victim based on the attacker's race
        event.setDamage(CorePlugin.getPlayerManager().getRace(attacker.getUniqueId()).getStrength());
        /*TODO
        test the damage and figure out equation
         */

    }

    public boolean isMeleeAttack(EntityDamageByEntityEvent event, Player attacker) {
        //if the damage is caused by an attack return true else return false
        if(event.getCause() == EntityDamageEvent.DamageCause.ENTITY_ATTACK) return true;
        else return false;
    }

}
