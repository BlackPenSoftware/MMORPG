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
public class StaminaManager {

    HashMap<String, Integer> playerStamina = new HashMap<String, Integer>();
    HashMap<String, Integer> playerMaxStamina = new HashMap<String, Integer>();

    /**
     * Set the player's stamina
     * @param player
     * @param health
     */
    public void setStamina(String player, int health) {
        playerStamina.put(player, health);
    }

    /**
     * Set the player's max stamina
     * @param player
     * @param health
     */
    public void setMaxStamina(String player, int health) {
        playerMaxStamina.put(player, health);
    }

    /**
     * Retrieves the player's stamina
     * @param player
     * @return
     */
    public int getStamina(String player) {
        return playerStamina.get(player);
    }

     /**
     * Retrieves the player's max stamina
     * @param player
     * @return
     */
    public int getMaxStamina(String player) {
        return playerMaxStamina.get(player);
    }

    /**
     * Test to see if the player has any stamina
     * @param player
     * @return
     */
    public boolean hasStamina(String player) {
        if(getStamina(player) > 0) return true;
        else return false;
    }
}
