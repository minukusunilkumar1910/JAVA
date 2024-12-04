package maths;

public class armstrongNum {
public static void main(String[] args) {
   int num=371;
   int dup=num;
   int arms=0;
while(num>0)
{
   int last=num%10;
   arms=arms+(last*last*last);
   num=num/10;
}
System.out.println(arms+"");

if(dup== arms)
{
   System.out.println("true");
}
else{
   System.out.println("f");
}
}
}
