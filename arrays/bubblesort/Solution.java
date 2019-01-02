import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int swaps = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {
                if (a[j] < a[i]) {
                    swaps++;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);

    }

}