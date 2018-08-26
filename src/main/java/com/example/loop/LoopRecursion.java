package com.example.loop;

public class LoopRecursion {

    public static int sum(final int[] arr, final int start){
        if(start >= arr.length){
            return 0;
        }
        return arr[start] + sum(arr, start +1);
    }
    public Integer val = 20;


    public void changeVal(Integer val) {
        val = 23;
    }

    public int getVal() {
        return val;
    }
}
