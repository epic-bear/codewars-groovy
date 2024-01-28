package kyu_7

class VAPORCODE {

    static void main(String[] args) {
        println vaporcode("Lets go to the movies")
    }

    static String vaporcode(String s) {
         s.replaceAll(" ", "").toUpperCase().split("").join("  ")
    }
}
