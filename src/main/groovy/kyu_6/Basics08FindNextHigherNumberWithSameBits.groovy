package kyu_6;

class Basics08FindNextHigherNumberWithSameBits {

    static void main(String[] args) {
        System.out.println(nextHigher(128));
    }

    static int nextHigher(int n) {
        return Integer.parseInt(Integer.toBinaryString(n).replaceAll('0?1(1*)(0*)$', '10$2$1'), 2)
    }
}
