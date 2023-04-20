package org.example.findParityOutlier;

import java.util.ArrayList;
import java.util.List;

public class FindParityOutlier {

    public int find(int[] integers){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        boolean isEven = true;
        for (int i = 0; i < 3; i++) {
            if(integers[i] % 2 == 0) {
                even.add(integers[i]);
            } else {
                odd.add(integers[i]);
            }
//            System.out.println("even = " + even);
//            System.out.println("odd = " + odd);
            if (odd.size() > even.size()) {
            isEven = false;
        }

        }
        int result = 0;

        for (int i = 0; i < integers.length; i++) {
            if (isEven && integers[i] % 2 != 0) {
                result = integers[i];
            } else if (!isEven && integers[i] % 2 == 0) {
                result = integers[i];
            }

        }
        return result;
    }
}
