package org.example.aisd;

public class FirstLesson {

    public static void main(String[] args) {
        int[] a = new int[1000];
        int s = 0;
        int n = 1000;

        for(int i = 0; i < n; i++) {
            s = s + a[i];
        }

        /*
        T = n шагов
        T = c * n шагов,  С- const
        T = O(n)
        T = O(n) означает, что T<= c * n
         */
    }

}
