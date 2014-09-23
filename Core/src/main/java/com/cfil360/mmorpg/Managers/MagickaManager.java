package main.java.com.cfil360.mmorpg.Managers;

import java.util.HashMap;
import java.util.UUID;

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
public class MagickaManager {

    HashMap<UUID, Integer> playerMagicka = new HashMap<UUID, Integer>();
    HashMap<UUID, Integer> playerMaxMagicka = new HashMap<UUID, Integer>();

    /**
     * Set the player's magicka
     * @param player
     * @param health
     */
    public void setMagicka(UUID player, int health) {
        playerMagicka.put(player, health);
    }

    /**
     * Set the player's max magicka
     * @param player
     * @param health
     */
    public void setMaxMagicka(UUID player, int health) {
        playerMaxMagicka.put(player, health);
    }

    /**
     * Retrieves the player's magicka
     * @param player
     * @return
     */
    public int getMagicka(UUID player) {
        return playerMagicka.get(player);
    }

     /**
     * Retrieves the player's max magicka
     * @param player
     * @return
     */
    public int getMaxMagicka(UUID player) {
        return playerMaxMagicka.get(player);
    }

    /**
     * Test to see if the player has enough magicka to execute the spell
     * @param player
     * @param magickaRequired
     * @return
     */
    public boolean hasEnoughMagicka(UUID player, int magickaRequired) {
        if(getMagicka(player) < magickaRequired) return false;
        else return true;
    }
}
