package main.java.com.cfil360.mmorpg.races;

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
public interface Race {

    //region Attributes
    //region Name
     /**
        Sets the name of the race
     **/
    void setName(String name);

    /**
        Retrieves the name of the race
     **/
    String getName();
    //endregion

    //region Description
     /**
        Sets the description of the race
     **/
    void setDescription(String description);

    /**
        Retrieves the name of the race
     **/
    String getDescription();
    //endregion

    //region Strength
     /**
        Sets the amount of damage done by melee attacks
     **/
    void setStrength(int strength);

    /**
        Retrieves the amount of damage done by melee attacks
     **/
    int getStrength();
    //endregion

    //region Endurance
     /**
        Sets the total health
     **/
    void setEndurance(int endurance);

    /**
        Retrieves the total health
     **/
    int getEndurance();
    //endregion

    //region Agility
     /**
        Sets the total stamina
     **/
    void setAgility(int agility);

    /**
        Retrieves the total stamina
     **/
    int getAgility();
    //endregion

    //region Willpower
     /**
        Sets the rate at which Magicka and Stamina regenerates
     **/
    void setWillpower(int willpower);

    /**
        Retrieves the rate at which Magicka and Stamina regenerates
     **/
    int getWillpower();
    //endregion

    //region Wisdom
     /**
        Sets your total Magicka.
     **/
    void setWisdom(int wisdom);

    /**
        Retrieves your total Magicka.
     **/
    int getWisdom();
    //endregion

    //region Intelligence
     /**
        Sets the effectiveness of a spell
     **/
    void setIntelligence(int intelligence);

    /**
        Retrieves the effectiveness of a spell
     **/
    int getIntelligence();
    //endregion

    //region Accuracy
     /**
        Sets the damage dealt by ranged weapons
     **/
    void setAccuracy(int accuracy);

    /**
        Retrieves the damage dealt by ranged weapons
     **/
    int getAccuracy();
    //endregion

    //region Speed
     /**
        Sets walk speed of the race
     **/
    void setSpeed(double speed);

    /**
        Retrieves the walk speed of the race
     **/
    double getSpeed();
    //endregion

    //region Sprint
     /**
        Sets sprint speed of the race
     **/
    void setSprint(double sprint);

    /**
        Retrieves the sprint speed of the race
     **/
    double getSprint();
    //endregion

    //region Swim
     /**
        Sets swim speed of the race
     **/
    void setSwim(double swim);

    /**
        Retrieves the swim speed of the race
     **/
    double getSwim();
    //endregion
    //endregion
}
