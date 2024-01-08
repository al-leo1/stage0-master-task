package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        double condition1 = firstSide + secondSide - thirdSide;
        double condition2 = firstSide + thirdSide - secondSide;
        double condition3 = secondSide + thirdSide - firstSide;
        if(condition1>0 && condition2 > 0 && condition3 >0)
            System.out.println("this is a valid triangle");
        else {
            System.out.println("it's not a triangle");
        }

    }

}
