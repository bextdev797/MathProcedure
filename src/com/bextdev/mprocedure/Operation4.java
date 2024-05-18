package com.bextdev.mprocedure;

public class Operation4 {

    public static int sqrtAddition(int number, int number2) {
        SqrtOperation4 sqrtOperation4 = new SqrtOperation4();
        return (int) sqrtOperation4.addSqrt(number, number2);
    }

    public static int sqrtSubtraction(int number, int number2) {
        SqrtOperation4 sqrtOperation4 = new SqrtOperation4();
        return (int) sqrtOperation4.subtractSqrt(number, number2);
    }

    public static int sqrtMultiply(int number, int number2) {
        SqrtOperation4 sqrtOperation4 = new SqrtOperation4();
        return (int) sqrtOperation4.timesSqrt(number, number2);
    }

    public static int sqrtDivide(int number, int number2) {
        SqrtOperation4 sqrtOperation4 = new SqrtOperation4();
        return (int) sqrtOperation4.divideSqrt(number, number2);
    }

    public static int maxAddition(int number, int number2, int number3, int number4) {
        MaxOperation4 maxOperation4 = new MaxOperation4();
        return maxOperation4.addMax(number, number2, number3, number4);
    }

    public static int maxSubtraction(int number, int number2, int number3, int number4) {
        MaxOperation4 maxOperation4 = new MaxOperation4();
        return maxOperation4.subMax(number, number2, number3, number4);
    }

    public static int maxMultiply(int number, int number2, int number3, int number4) {
        MaxOperation4 maxOperation4 = new MaxOperation4();
        return maxOperation4.timesMax(number, number2, number3, number4);
    }

    public static int maxDivide(int number, int number2, int number3, int number4) {
        MaxOperation4 maxOperation4 = new MaxOperation4();
        return maxOperation4.divideMax(number, number2, number3, number4);
    }

    public static int minAddition(int number, int number2, int number3, int number4) {
        MinOperation4 minOperation4 = new MinOperation4();
        return minOperation4.addMin(number, number2, number3, number4);
    }

    public static int minSubtraction(int number, int number2, int number3, int number4) {
        MinOperation4 minOperation4 = new MinOperation4();
        return minOperation4.subMin(number, number2, number3, number4);
    }

    public static int minMultiply(int number, int number2, int number3, int number4) {
        MinOperation4 minOperation4 = new MinOperation4();
        return minOperation4.timesMin(number, number2, number3, number4);
    }

    public static int minDivide(int number, int number2, int number3, int number4) {
        MinOperation4 minOperation4 = new MinOperation4();
        return minOperation4.divideMin(number, number2, number3, number4);
    }

    public static int dAllowance(int baseAmount, int interestRate) {
        SalaryOperation4 salaryOperation4 = new SalaryOperation4();
        return (int) salaryOperation4.dearnessAllowance(baseAmount, interestRate);
    }

    public static int grossSalary(int baseAmount, int da, int hra, int medical, int otherAllowance) {
        SalaryOperation4 salaryOperation4 = new SalaryOperation4();
        return (int) salaryOperation4.grossSalary(baseAmount, da, hra, medical, otherAllowance);
    }

    public static int pFundAdvance(int basicSalary, int da, int rate) {
        SalaryOperation4 salaryOperation4 = new SalaryOperation4();
        return (int) salaryOperation4.providentFundAdvance(basicSalary, da, rate);
    }

    public static int sumCut(int pFundAdvance, int groupInsuranceScheme) {
        SalaryOperation4 salaryOperation4 = new SalaryOperation4();
        return (int) salaryOperation4.sumCut(pFundAdvance, groupInsuranceScheme);
    }
}