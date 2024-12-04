package recursion;

public class n_to_1{
 public static void main(String[] args) {
     int n=1;
     numbers(n);
 
 }
 static void numbers(int n){
    if(n==6) 
{
   return ;
}
System.out.print(n+" ");
   numbers(n+1);
 }
}