
package com.bits.leave;

// BITS ID: 2024SL70009

public class LeaveCalculator {

    // Calculate remaining leave balance
    public double calculateRemainingLeave(
            double totalLeave, double leaveTaken) {

        if (totalLeave < 0 || leaveTaken < 0
                || leaveTaken > totalLeave) {
            throw new IllegalArgumentException(
                    "Invalid leave details");
        }

        return totalLeave - leaveTaken;
    }

    // Calculate leave encashment amount
    public double calculateEncashment(
            double remainingLeave, double monthlySalary) {

        if (remainingLeave < 0 || monthlySalary < 0) {
            throw new IllegalArgumentException(
                    "Invalid salary or leave balance");
        }

        double dailySalary = monthlySalary / 30.0;

        return remainingLeave * dailySalary;
    }
}
