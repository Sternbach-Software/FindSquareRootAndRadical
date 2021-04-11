package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(squareRoot(96)[0] + "√" + squareRoot(96)[1]);
    }

    public static int[] squareRoot(int n) {
        int radical = n;
        int coefficient = 1;
        for (int i = 2; i < radical; i++) {
            if (radical % (i * i) == 0) {
                coefficient *= i;
                radical /= i * i;
                for (int j = 2; j < radical; j++) {
                    if (radical % (j * j) == 0) {
                        coefficient *= j;
                        radical /= j * j;
                    }
                }
            }
        }
        return new int[]{coefficient, radical};
    }
}

