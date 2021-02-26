package com.company;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
   @Test
    public void test_smallNumbers ( ){
        Calculator calc = new Calculator();
        double actual_result = calc.add(22, 78);
        double expected_result = 100;
       assertEquals (expected_result, actual_result);

       actual_result = calc.minus(56,6);
       expected_result = 50;
       assertEquals(expected_result,actual_result);

       actual_result = calc.div(12,3);
       expected_result = 4;
       assertEquals(expected_result,actual_result);

       actual_result = calc.mult(5,5);
       expected_result = 25;
       assertEquals(expected_result,actual_result);

    }

}
