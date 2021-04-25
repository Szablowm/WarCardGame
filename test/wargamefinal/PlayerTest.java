/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargamefinal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matthewszablowski
 */

public class PlayerTest {

    private Player testPlayer;

    @Before
    public void setUpBefore() {
        testPlayer = new Player("Matt");
    }

    @Test
    public void getName_returnsPlayerName() {
        //Player testPlayer = new Player("Matt");
        String expected = "Matt";
        String actual = testPlayer.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName_updatesPlayerName() {
        String expected = "Sujal";
        testPlayer.setName("Sujal");
        String actual = testPlayer.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHand_returnsPlayerHand() {
        Hand expected = new Hand();
        testPlayer.setHand(expected);
        Hand actual = testPlayer.getHand();
        Assert.assertEquals(expected, actual);
    }
}
