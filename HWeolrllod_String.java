//Q4. Given two strings, a and b, create a bigger string made of the first char of a,
//        the first char of b, the second char of a, the second char of b, and so on.
//        Any leftover chars go at the end of the result.
//        If the inputs are "Hello" and "World", then the output is "HWeolrllod".

class FirstSecond{
    public static void main(String[] args) {
      FirstSecond obj= new FirstSecond();
        System.out.println( obj.method("tushar","guptaa"));
    }
    public String method(String s,String c){
        int y=0;
        String Z="";
        int i=s.length();
        int v= c.length();
        for(int x=0;x<i;x++){
            Z=Z+s.charAt(x)+c.charAt(y);
          y++;
     }
        return Z;
    }

}
