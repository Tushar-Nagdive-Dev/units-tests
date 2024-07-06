package com.in.units;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StringTest {

    StringHelper helper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions() {
        String actualValue = helper.truncateAInFirst2Positions("AACD");
        String expectedValue = "CD";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testTruncateAInFirst2Positions2() {
        assertEquals("CDA", helper.truncateAInFirst2Positions("AACD"));
    }

    /* 
     * ABCD => false, ABAB => true, AB => true, A => false
     */
    @Test
    public void test_AreFirstAndLastTwoCharactersTheSame() {
        Boolean actualValue = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
        Boolean expectedValue = false;
        assertFalse(actualValue);
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
        assertTrue("This condition is fail when 'A' is input. ",helper.areFirstAndLastTwoCharactersTheSame("A"));
    }
}
