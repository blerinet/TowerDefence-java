/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.towerdefencegamesinc.towerdefence.java.logic.tower;

import fi.towerdefencegamesinc.towerdefence.java.logic.Tile;
import fi.towerdefencegamesinc.towerdefence.java.logic.attacker.Attacker;
import java.util.List;

/**
 * Interface for all towers to be placed by the player.
 *
 * @author vrsaari
 */
public interface Tower {

    /**
     * Attempt to shoot.
     *
     * @param attacker Attacker to be shot.
     * @return Damage to be dealt.
     */
    int shoot(Attacker attacker);

    /**
     * Upgrade the tower level.
     *
     * @return The new level of the tower.
     */
    int upgrade();

    /**
     * Find out how much it would cost to upgrade the tower.
     *
     * @return The cost to upgrade the tower to the next level.
     */
    int getUpgradeCost();

    /**
     *
     * @return The current level of the tower.
     */
    int getLevel();

    /**
     * Find out if the tower is ready to shoot again.
     *
     * @return Is the tower ready to shoot?
     */
    boolean readyToShoot();

    /**
     *
     * @return Single character representation for the tower.
     */
    public char getCharRepr();

    /**
     * When was the last shot fired?
     *
     * @return Time of last shot fired.
     */
    public long getLastShot();
    
    /**
     * Get target for tower. This will return the previous target, 
     * if it is still in range. Otherwise nearest new target in range is returned.
     * In case no target is in range, null is returned.
     * @param attackers List of all attackers in game.
     * @return Target for tower or null if none in range.
     */
    public Attacker getTarget(List<Attacker> attackers);
    
    /**
     *
     * @return Tile the tower is located in.
     */
    public Tile getTile();

    /**
     *
     * @return Attack range of the tower.
     */
    public double getRange();

    public void setTile(Tile tile);

}
