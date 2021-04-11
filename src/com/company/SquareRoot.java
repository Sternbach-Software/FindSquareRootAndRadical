package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareRoot(96)));
    }

    public static int[] squareRoot(int number) {
        int number1 = number;
        List<Integer> roots = new ArrayList<>();
        int coefficient = 1;
        int root = 2;
        if (root <= number) {
            while (true) {
                if (number1 % (root * root) == 0) {
                    roots.add(root);
                    number1 /= root * root;
                    int j = 2;
                    int var7 = number1;
                    if (j <= number1) {
                        while (true) {
                            if (number1 % (j * j) == 0) {
                                roots.add(j);
                                number1 /= j * j;
                            }
                            if (j == var7) break;
                            ++j;
                        }
                    }
                }
                if (root == number) break;
                ++root;
            }
        }

        for (Integer root1 : roots) coefficient *= root1;
        return new int[]{coefficient, number1};
    }
}
