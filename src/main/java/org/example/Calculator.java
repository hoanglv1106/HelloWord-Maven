package org.example;
//Viết JUnit test kiểm tra hàm tính tổng 2 số.
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must >= 0");
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
