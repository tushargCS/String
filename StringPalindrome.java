import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the String");
       String s,rev="";
       s= obj.nextLine();
        int l= s.length();
        for(int i=(l-1);i>=0;i-- ){
            rev=rev+s.charAt(i);
        }
        if(rev.equals(s) ){
            System.out.println("palindrome");
        }
        else
            System.out.println("not palindrome");
    }
}
