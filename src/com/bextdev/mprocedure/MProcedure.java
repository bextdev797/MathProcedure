package com.bextdev.mprocedure;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import java.util.HashMap;

public class MProcedure extends AndroidNonvisibleComponent {

    private HashMap<String, String> procedure = new HashMap<>();
    private String wProcedure;

    public MProcedure(ComponentContainer container) {
        super(container.$form());
    }

    @SimpleFunction(description = "Create a math procedure")
    public void CreateMathProcedure(String whatProcedure) {
        this.wProcedure = whatProcedure;
        procedure.put("MathProcedure", whatProcedure);
    }

    @SimpleFunction(description = "The function inside the math procedure")
    public int MathProcedureDo(int number, int number2, int number3, int number4) {
        switch (wProcedure) {
            case "Create a math procedure to add":
                return number + number2;
            case "Create a math procedure to subtract":
                return number - number2;
            case "Create a math procedure to multiply":
                return number * number2;
            case "Create a math procedure to divide":
                return number / number2;
            case "Create a math procedure to find maximum number":
                return Math.max(number, number2);
            case "Create a math procedure to find minimum number":
                return Math.min(number, number2);
            case "Create a math procedure to calculate square root":
                return (int) Math.sqrt(number);
            case "Create a math procedure to add square root":
                return Operation4.sqrtAddition(number, number2);
            case "Create a math procedure to subtract square root":
                return Operation4.sqrtSubtraction(number, number2);
            case "Create a math procedure to multiply square root":
                return Operation4.sqrtMultiply(number, number2);
            case "Create a math procedure to divide square root":
                return Operation4.sqrtDivide(number, number2);
            case "Create a math procedure to add maximum number":
                return Operation4.maxAddition(number, number2, number3, number4);
            case "Create a math procedure to subtract maximum number":
                return Operation4.maxSubtraction(number, number2, number3, number4);
            case "Create a math procedure to multiply maximum number":
                return Operation4.maxMultiply(number, number2, number3, number4);
            case "Create a math procedure to divide maximum number":
                return Operation4.maxDivide(number, number2, number3, number4);
            case "Create a math procedure to add minimum number":
                return Operation4.minAddition(number, number2, number3, number4);
            case "Create a math procedure to subtract minimum number":
                return Operation4.minSubtraction(number, number2, number3, number4);
            case "Create a math procedure to multiply minimum number":
                return Operation4.minMultiply(number, number2, number3, number4);
            case "Create a math procedure to divide minimum number":
                return Operation4.minDivide(number, number2, number3, number4);
            case "Create a math procedure to calculate dearness allowance":
                return Operation4.dAllowance(number, number2);
            case "Create a math procedure to calculate gross salary":
                // Ensure to add an additional argument, e.g., 0, for the fifth parameter if it's missing
                return Operation4.grossSalary(number, number2, number3, number4, 0);
            case "Create a math procedure to calculate gross salary provident fund advance":
                return Operation4.pFundAdvance(number, number2, number3);
            case "Create a math procedure to calculate gross salary sum cut":
                return Operation4.sumCut(number, number2);
            default:
                return 0;
        }
    }
}