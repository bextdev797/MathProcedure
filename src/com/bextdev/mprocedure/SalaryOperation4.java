package com.bextdev.mprocedure;

public class SalaryOperation4 {

    public int dearnessAllowance(int baseAmount, int interestRate){
        int dA = (interestRate / 100 * baseAmount);
        return dA;
    }
    
    public int grossSalary(int baseAmount, int da, int hra, int medical, int otherAllowance){
        int gSalary = (baseAmount + da + hra + medical + otherAllowance);
        return gSalary;
    }

    public int netSalary(int grossAmount, int handicapAllowance, int sumCut){
        int nSalary = (grossAmount + handicapAllowance - sumCut);
        return nSalary;
    }

    public int providentFundAdvance(int basicSalary, int da, int rate){
        int pFundAdvance = (rate / 100 * basicSalary + da);
        return pFundAdvance;
    }

    public int sumCut(int pFAdvance, int groupInsuranceScheme){
        int sCut = pFAdvance + groupInsuranceScheme;
        return sCut;
    }
}