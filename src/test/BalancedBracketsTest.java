package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets test_Class;

    public void createBracketObject() {
        test_Class = new BalancedBrackets();
    }

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void balancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Miguel][Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Rodriguez"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Miguel [Rodriguez] Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch Code] [Launch Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch Code [Launch]][]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch Code [Launch] [Code]]"));
    }

    @Test
    public void balancedBracketsReturnFalse() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("['a'"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Miguel's Code] [Rodriguez"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("['a'"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[HelloPeople"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hello]People["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Hello World] [Hello "));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[L][a][u][n][c]][[h][C][o][d][e]"));


    }

}
