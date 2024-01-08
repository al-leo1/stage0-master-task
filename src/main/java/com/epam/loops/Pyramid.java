package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for(int i=1;i<=cathetusLength;i++){
            for (int k=cathetusLength;k>i;k--)System.out.print(" ");
            for (int m=i;m>=1;m--)
                System.out.print(m);
            for (int n=1;n<i;n++) System.out.print(n+1);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
