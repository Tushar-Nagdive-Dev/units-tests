package com.in.units;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringParameterizedTest {

    StringHelper helper = new StringHelper();
    private String input;
    private String expectedOutput;

    public StringParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters 
    public static Collection<String[]> testConditions() {
        String expectedArray[][] = {{"AACD", "CD"},{"ACD", "CD"}};
        return Arrays.asList(expectedArray);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        String actualValue = helper.truncateAInFirst2Positions(input);
        assertEquals(expectedOutput, actualValue);
    }

    @Test
    public void testTruncateAInFirst2Positions2() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }
}
