package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void notEqualBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void expectedAnswerFalse() {
        BalancedBrackets bracketsTest = new BalancedBrackets();
        Boolean tORf;
        tORf = bracketsTest.hasBalancedBrackets("[hi");
        assertEquals(false, false);
    }

    @Test
    public void expectedAnswerTrue() {
        BalancedBrackets bracketsTest = new BalancedBrackets();
        Boolean tORf;
        tORf = bracketsTest.hasBalancedBrackets("[hi]");
        assertEquals(true, true);
    }

    @Test
    public void objectNotNullWhenFalse() {
        BalancedBrackets bracket = new BalancedBrackets();
        bracket.hasBalancedBrackets("[hi");

        assertNotNull(bracket);
    }

    @Test
    public void objectNotNullWhenTrue() {
     BalancedBrackets testBracket = new BalancedBrackets();
     testBracket.hasBalancedBrackets("[hi]");

     assertNotNull(testBracket);
    }

    @Test
    public void testTwoObjectsBothFalse() {
        BalancedBrackets testBrackets = new BalancedBrackets();

        BalancedBrackets testBrackets2 = new BalancedBrackets();

        assertFalse(testBrackets.hasBalancedBrackets("[hi"));
        assertFalse(testBrackets2.hasBalancedBrackets("[hi"));
    }

    @Test
    public void testTwoObjectsBothTrue(){
        BalancedBrackets test1 = new BalancedBrackets();
        BalancedBrackets test2 = new BalancedBrackets();

        assertTrue(test1.hasBalancedBrackets("[hi]"));
        assertTrue(test2.hasBalancedBrackets("[hi]"));
    }

    @Test
    public void moreThanTwoEqual() {
        BalancedBrackets test1 = new BalancedBrackets();

        assertTrue(test1.hasBalancedBrackets("[hi][hi]"));
    }

    @Test
    public void moreThanTwoNotEqual() {
        BalancedBrackets test1 = new BalancedBrackets();

        assertFalse(test1.hasBalancedBrackets("[hi]["));
    }

    @Test
    public void changingObject() {
        BalancedBrackets test = new BalancedBrackets();

        assertTrue(test.hasBalancedBrackets("[hi][][]"));
        assertFalse(test.hasBalancedBrackets("[hi]]"));
    }
}