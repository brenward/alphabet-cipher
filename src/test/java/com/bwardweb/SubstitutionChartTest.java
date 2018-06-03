package com.bwardweb;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubstitutionChartTest {
    SubstitutionChart subChart;

    @Before
    public void setup(){
        subChart = new SubstitutionChart();
    }

    @Test
    public void testGetSubstituteCharacter_aa(){
        char returnedChar = subChart.getSubstituteChar('a','a');
        Assert.assertTrue(returnedChar == 'a');
    }

    @Test
    public void testGetSubstituteCharacter_lf(){
        char returnedChar = subChart.getSubstituteChar('l','f');
        Assert.assertTrue(returnedChar == 'q');
    }

    @Test
    public void testGetSubstituteCharacter_tq(){
        char returnedChar = subChart.getSubstituteChar('t','q');
        Assert.assertTrue(returnedChar == 'j');
    }

    @Test
    public void testGetSubstituteCharacter_dy(){
        char returnedChar = subChart.getSubstituteChar('d','y');
        Assert.assertTrue(returnedChar == 'b');
    }

}
