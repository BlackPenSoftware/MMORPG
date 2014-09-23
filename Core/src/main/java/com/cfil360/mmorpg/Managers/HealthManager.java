package main.java.com.cfil360.mmorpg.Managers;

import java.util.HashMap;

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
public class HealthManager {

    HashMap<String, Integer> playerHealth = new HashMap<String, Integer>();
    HashMap<String, Integer> playerMaxHealth = new HashMap<String, Integer>();

    /**
     * Set the player's health
     * @param player
     * @param health
     */
    public void setHealth(String player, int health) {
        playerHealth.put(player, health);
    }

    /**
     * Set the player's max health
     * @param player
     * @param health
     */
    public void setMaxHealth(String player, int health) {
        playerMaxHealth.put(player, health);
    }

    /**
     * Retrieves the player's health
     * @param player
     * @return
     */
    public int getHealth(String player) {
        return playerHealth.get(player);
    }

    /**
     * Retrieves the player's max health
     * @param player
     * @return
     */
    public int getMaxHealth(String player) {
        return playerMaxHealth.get(player);
    }

    /**
     * Test to make sure the player is alive
     * @param player
     * @return
     */
    public boolean isAlive(String player) {
        if(getHealth(player) > 0) return true;
        else return false;
    }
}
