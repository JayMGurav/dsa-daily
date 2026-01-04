package org.jay;

import java.util.Arrays;

/*
    Leetcode 1317: https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/description/
*/
public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {

    public boolean isNonZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) return false;
            n = n / 10;
        }
        return true;
    }

    public int[] getNoZeroIntegers1(int n) {
        for (int a = 1; a < n; a++) {
            if (!String.valueOf(a).contains("0") &&
                    !String.valueOf(n - a).contains("0")) {
                return new int[]{a, n - a};
            }
        }
        return new int[]{0, 0};
    }

    public int[] getNoZeroIntegers2(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (isNonZero(a) && isNonZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{0, 0};
    }


    static void main() {
        ConvertIntegerToTheSumOfTwoNoZeroIntegers obj =
                new ConvertIntegerToTheSumOfTwoNoZeroIntegers();

        int[] x = obj.getNoZeroIntegers1(11);
        IO.println(Arrays.toString(x));

        int[] y = obj.getNoZeroIntegers2(11);
        IO.println(Arrays.toString(y));
    }
}


