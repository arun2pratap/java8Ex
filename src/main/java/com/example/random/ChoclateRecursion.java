package com.example.random;

public class ChoclateRecursion {
    public static void main(String[] args) {
        int count = getChoclate(15);
        System.out.println("count" + count);
    }

    private static int getChoclate(int i) {
        int totalCount = i;
        if(i >= 3){
            int wrapper = i/3;
            int mod = i%3;
            totalCount = totalCount + getChoclate(wrapper +mod);
        }
        return totalCount;
    }
}
