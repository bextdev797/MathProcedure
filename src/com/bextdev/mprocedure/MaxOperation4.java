package com.bextdev.mprocedure;


public class MaxOperation4 {

    public int addMax(int maxOneNum1, int maxOneNum2, int maxTwoNum1, int maxTwoNum2) {
        int max1Result = Math.max(maxOneNum1, maxOneNum2);
        int max2Result = Math.max(maxTwoNum1, maxTwoNum2);
        return max1Result + max2Result;
    }

    public int subMax(int maxOneNum1, int maxOneNum2, int maxTwoNum1, int maxTwoNum2) {
        int max1Result = Math.max(maxOneNum1, maxOneNum2);
        int max2Result = Math.max(maxTwoNum1, maxTwoNum2);
        return max1Result - max2Result;
    }

    public int timesMax(int maxOneNum1, int maxOneNum2, int maxTwoNum1, int maxTwoNum2) {
        int max1Result = Math.max(maxOneNum1, maxOneNum2);
        int max2Result = Math.max(maxTwoNum1, maxTwoNum2);
        return max1Result * max2Result;
    }

    public int divideMax(int maxOneNum1, int maxOneNum2, int maxTwoNum1, int maxTwoNum2) {
        int max1Result = Math.max(maxOneNum1, maxOneNum2);
        int max2Result = Math.max(maxTwoNum1, maxTwoNum2);
        return max1Result / max2Result;
    }
}