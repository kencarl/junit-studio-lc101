package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

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
    public void stringsWithBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }
    @Test
    public void twoSetsOfBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] []"));
    }
    @Test public void stringWithTwoSetsOfBalancedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch] [Code]"));
    }
    @Test
    public void noBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void misnestedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void misnestedBracketsInStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("L]aunch[Code"));
    }
    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void containsOneNestedBracketOneAloneBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch] code is]"));
    }
    @Test
    public void containsOneNestedBracketOneMisnestedBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch] ]Code["));
    }



}
