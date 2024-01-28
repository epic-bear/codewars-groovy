package kyu_7

class CircleCipher {
    static void main(String[] args) {
        println encode("white")
        println decode("wehti")
    }

    static String encode(String s) {
        String[] letters = s.split("")
        String result = ""
        for (int i = 0; i < letters.length / 2; i++) {
            result += letters[i]
            if (i < letters.length - 1 - i) {
                result += letters[letters.length - 1 - i]
            }
        }
        result
    }

    static String decode(String s) {
        String result = ""
        for (int i = 0; i < s.length(); i += 2) {
            result += s.charAt(i)
        }
        for (int i = s.length() % 2 == 0 ? s.length() - 1 : s.length() - 2; i > 0; i -= 2) {
            result += s.charAt(i)
        }
        result
    }
}
