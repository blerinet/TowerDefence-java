/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.towerdefencegamesinc.towerdefence.java.logic.attacker;

import fi.towerdefencegamesinc.towerdefence.java.logic.Tile;
import fi.towerdefencegamesinc.towerdefence.java.logic.Type;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vrsaari
 */
public class FlyingAttackerTest {
    
    public FlyingAttackerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCreateFlyingAttacker() {
        Tile tile = new Tile(0, 0, Type.Spawn, false);
        Attacker flyingAttacker = new FlyingAttacker(tile, 1, 1);
        assertEquals(1, flyingAttacker.getSpeed());
        assertEquals(true, flyingAttacker.canFly());
        assertEquals(1, flyingAttacker.attack());
    }
    
}
