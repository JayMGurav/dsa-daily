package org.jay;
import java.util.Arrays;

/*
    Leetcode 1304: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
*/
public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero1(int n) {
        int[] nums = new int[n];
        int index = 0;

        // add pairs
        for (int x = 1; x <= n / 2; x++) {
            nums[index++] = x;
            nums[index++] = -x;
        }

        // if n is odd, add 0
        if (n % 2 == 1) {
            nums[index] = 0;
        }

        return nums;
    }

    public int[] sumZero2(int n) {
        int[] nums = new int[n];

        for(int i = 0; i < n; i++)
            nums[i] = i * 2 - n + 1;

        return nums;
    }


    static void main(){
        FindNUniqueIntegersSumUpToZero obj = new FindNUniqueIntegersSumUpToZero();
        IO.println(Arrays.toString(obj.sumZero1(5)));
    }
}