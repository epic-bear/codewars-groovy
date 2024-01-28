package kyu_7

class CatsAndShelves {
    static void main(String[] args) {
        println jump(1, 5)
    }

    static int jump(start, finish) {
        return (finish - start) / 3 + (finish - start) % 3
    }
}
