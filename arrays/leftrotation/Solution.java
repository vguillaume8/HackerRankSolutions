import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        // convert array to arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++){
            list.add(a[i]);
        }

        // rotations
        for(int i = 0; i < d; i++){
            int current = list.get(0);
            list.remove(0);
            list.add(current);
        }

        // convert back to array
        int[] b = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            b[i] = list.get(i);
        }
        return b;
    }


}
