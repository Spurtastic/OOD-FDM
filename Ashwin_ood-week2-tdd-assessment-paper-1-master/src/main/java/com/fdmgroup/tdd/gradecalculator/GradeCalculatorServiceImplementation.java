package com.fdmgroup.tdd.gradecalculator;

public class GradeCalculatorServiceImplementation implements GradeCalculatorService{

    private double mark;



    public GradeCalculatorServiceImplementation() {

    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }
    @Override
    public String getClassification(double mark) {

        //        fail” when less than 75.
        //	“pass” when greater than or equal to 75 but less than 80.
        //	“merit” when greater than or equal to 80 but less than 90.
        //	“distinction” when greater than or equal to 90 but less than or equal to 100.
        if (mark < 75) {
            return "fail";

        }else if (mark >= 75 && mark < 80) {
            return "pass";
        }else if (mark >= 80 && mark < 90) {
            return "merit";
        }else if (mark >= 90 && mark <= 100) {
            return "distinction";
        }else {
            return "invalid";
        }
    }
}
