//Q5. Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
//        You may assume that n is between 0 and the length of the string, inclusive.
//        For example, if the inputs are “Niraj” and 3, then the output should be “rajrajraj


class Return{
  public static void main(String[] args) {
        Return obj= new Return();
        obj.Method("tushar",4);
    }
    public void Method(String s,int q){
        int x=s.length();
         for(int i=0;i<q;i++){
           
                    for(int y= (x-q); y<x;y++){
    System.out.print(s.charAt(y));
        }
             System.out.println();
         }
    }

}
