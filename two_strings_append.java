//Q2. Given two strings, append them together (known as "concatenation") and return the result.
//        However, if the concatenation creates a double-char, then omit one of the chars.
//        If the inputs are “Mark” and “Kate” then the output should be “markate”. (The output should be in lowercase)

import java.util.Locale;

class Add {
    public static void main(String[] args) {
         Add obj= new Add();
        System.out.println(obj.AddString("mark","  ate"));
    }
   public String AddString(String s, String x){
        s=s.trim();
        x=x.trim();
        s=s.concat(x);
        s=s.toLowerCase();
        return s;
    }

}
