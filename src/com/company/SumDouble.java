package com.company;

public class SumDouble {
    /*даны два числа, вернуть их сумму.
    Но если эти числа равны, то вернуть удвоенную сумму*/
    public static void main(String args[]){
        int a, b, x;
        a = 5;
        b = 5;

        x =(a == b)? ((a + b)*2)  : (a + b);

        return;
    }
}
