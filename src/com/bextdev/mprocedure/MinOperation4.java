package com.bextdev.mprocedure;

public class MinOperation4 {
    public int addMin(int minOneNum1, int minOneNum2, int minTwoNum1, int minTwoNum2) {
        int minResult1 = Math.min(minOneNum1, minOneNum2);
        int minResult2 = Math.min(minTwoNum1, minTwoNum2);
        return minResult1 + minResult2;
    }

    public int subMin(int minOneNum1, int minOneNum2, int minTwoNum1, int minTwoNum2) {
        int minResult1 = Math.min(minOneNum1, minOneNum2);
        int minResult2 = Math.min(minTwoNum1, minTwoNum2);
        return minResult1 - minResult2;
    }

    public int timesMin(int minOneNum1, int minOneNum2, int minTwoNum1, int minTwoNum2) {
        int minResult1 = Math.min(minOneNum1, minOneNum2);
        int minResult2 = Math.min(minTwoNum1, minTwoNum2);
        return minResult1 * minResult2;
    }

    public int divideMin(int minOneNum1, int minOneNum2, int minTwoNum1, int minTwoNum2) {
        int minResult1 = Math.min(minOneNum1, minOneNum2);
        int minResult2 = Math.min(minTwoNum1, minTwoNum2);
        return minResult1 / minResult2;
    }
}