package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int numberRevert =0;
        while(number!=0) {
            numberRevert = numberRevert * 10 + number%10;
            number = number / 10;
        }
        System.out.println(numberRevert);
    }

}
