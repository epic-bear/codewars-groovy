package kyu_7

class Fibonacci {
    static void main(String[] args) {
        println fib(4)
    }

    static long fib(int n) {
        return n < 3 ? 1 : fib(n - 1) + fib(n - 2)
    }
}
