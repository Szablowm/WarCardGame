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
public class SuitTest {

    @Test
    public void getSymbol_returnsFirstLetterOfSuit() {
        String expected = "C";
        String actual = Suit.CLUBS.getSymbol();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSuitName_returnsTitleCaseOfSuit() {
        String expected = "Hearts";
        String actual = Suit.HEARTS.getSuitName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toString_returnsFirstLetterOfSuit() {
        String expected = "C";
        String actual = Suit.CLUBS.toString();
        Assert.assertEquals(expected, actual);
    }
}
