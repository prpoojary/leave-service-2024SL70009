package com.bits.leave;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeaveCalculatorTest {

    LeaveCalculator calculator = new LeaveCalculator();

    @Test
    public void testRemainingLeave() {
        double result =
            calculator.calculateRemainingLeave(24, 6);

        assertEquals(18.0, result, 0.001);
    }

    @Test
    public void testLeaveEncashment() {
        double result =
            calculator.calculateEncashment(18, 30000);

        assertEquals(18000.0, result, 0.001);
    }

    @Test
    public void testZeroLeaveBalance() {
        double result =
            calculator.calculateRemainingLeave(20, 20);

        assertEquals(0.0, result, 0.001);
    }
}
