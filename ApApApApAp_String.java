//Q3. Given a string, return a new string made of n copies of the first 2 chars of the original string
//        where n is the length of the string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
//        If the input is “Apple” then the output should be “ApApApApAp”.
class Repeat {
    public static void main(String[] args) {
        Repeat obj = new Repeat();
        obj.stringRepeat("Apple");
    }

    public void stringRepeat(String s) {
        int i = s.length();
        for (int l = i; i > 0; i--) {
            for (int x = 0; x <= 1; x++) {
                System.out.print(s.charAt(x));
            }
        }
    }
}
