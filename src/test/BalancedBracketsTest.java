package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    BalancedBrackets test_Class;

    public void createBracketObject() {
        test_Class = new BalancedBrackets();
    }

    @Test
    public void balancedBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
        assertTrue(test_Class.hasBalancedBrackets("Launch[Code]"));
        assertTrue(test_Class.hasBalancedBrackets(""));
        assertTrue(test_Class.hasBalancedBrackets("[Miguel][Code]"));
        assertTrue(test_Class.hasBalancedBrackets("[]Rodriguez"));
        assertTrue(test_Class.hasBalancedBrackets("[Miguel [Rodriguez] Code]"));
        assertTrue(test_Class.hasBalancedBrackets("[]"));
        assertTrue(test_Class.hasBalancedBrackets(""));
        assertTrue(test_Class.hasBalancedBrackets("[][]"));
        assertTrue(test_Class.hasBalancedBrackets("[Launch Code] [Launch Code]"));
        assertTrue(test_Class.hasBalancedBrackets("[Launch Code [Launch]][]"));
        assertTrue(test_Class.hasBalancedBrackets("[Launch Code [Launch] [Code]]"));
    }

    @Test
    public void balancedBracketsReturnFalse() {
        assertFalse(test_Class.hasBalancedBrackets("['a'"));
        assertFalse(test_Class.hasBalancedBrackets("[Miguel's Code] [Rodriguez"));
        assertFalse(test_Class.hasBalancedBrackets("['a'"));
        assertFalse(test_Class.hasBalancedBrackets("]["));
        assertFalse(test_Class.hasBalancedBrackets("[HelloPeople"));
        assertFalse(test_Class.hasBalancedBrackets("Hello]People["));
        assertFalse(test_Class.hasBalancedBrackets("["));
        assertFalse(test_Class.hasBalancedBrackets("]"));
        assertFalse(test_Class.hasBalancedBrackets("[[]"));
        assertFalse(test_Class.hasBalancedBrackets("[Hello World] [Hello "));

    }

}
