import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for(int i = 0; i < ar.length; i++){
            if(!map.containsKey(ar[i])){
                map.put(ar[i], 1);
                continue;
            }

            int value = map.get(ar[i]) + 1;
            map.put(ar[i], value);
        }
        System.out.println(map.values());


        for(int i = 0; i < ar.length; i++){
            if(map.containsKey(ar[i])){
                int temp = map.remove(ar[i]);
                int divide = temp / 2;
                pairs = pairs + divide;
            }

        }
        return pairs;
    }
}
