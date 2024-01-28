package kyu_8

class BeginnerReduceButGrow {
    static void main(String[] args) {
        println grow([5, 4, 1, 3, 9])
    }

    static def grow(numbers) {
        int result = 1

        for (int i : numbers) {
            result *= i
        }

        result
    }
}
