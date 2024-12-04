package recursion;


/*public class recursions{
  public static void main(String[] args) {
      int n=1;
     int result =    onetoN(n);
     System.out.println(result+"");
  }
  static int onetoN(int n)
  {
     if(n==10)
     {
      return n;
     }
     
    int sum = n+ onetoN(n+1);
     return sum;
  }
}

public class recurson {
   public static void main(String[] args){
      int n;
      int result= NtoOne(5);
      System.out.println(result+"");
   }
   static int NtoOne(int n)
   { if (n==1) {
       return n;
   }
    int pro =n*NtoOne(n-1);
    return pro;
   }
}
public class recursion{
   public static void main(String[] args)
   {
      int n;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter n");
     n=sc.nextInt();
    
     int r= fact(n);
     System.out.println(r+"");
   } 
   static int fact(int n){
      if(n==1 || n==0)
      return 1;
   
    int factorial=n*fact(n-1);
    return factorial;
   }
} 
public class recursion
{
   public static void main(String[] args)
   {
      int n=1234;
       reverse(n);
       System.out.println(sum+"");
   } 
   static int sum=0;
   static void reverse(int n){
      if(n==0)
      {
         return;
      }
      int rem=n%10;
      sum=sum *10+rem;
      reverse(n/10);
     
   }
}
public class recursion{
   public static void main(String[] args){
      System.out.println("Enter n");
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int r=fibb(n);
      System.out.println(r +"");
   }
   static int fibb(int n){
      if(n==0||n==1)
      {
         return n;
      }
      return fibb(n-1)+fibb(n-2);
   }
}
public class recursion{
   public static void main(String[] args){
      int n=13542;
     int result= sum(n);
   System.out.println(result+"");
   }
   static int sum(int n){
      if (n==0)
      {
         return n;
      }
     return (n%10)+sum(n/10);
   }
}
   public class recursion{
      public static void main(String[] args)
      {
         int a,b,c,d;
         Scanner sc =new Scanner(System.in);
         System.out.println("a");
         a=sc.nextInt();
         System.out.println("b");
         b=sc.nextInt();
         System.out.println("c");
         c=sc.nextInt();
         System.out.println("d");
         d=sc.nextInt();
       int large=  largestNum(a,b,c,d);
       System.out.println(large+" is the largest number");

      }
      static int largestNum(int a,int b,int c,int d){
         if(a>b)
         {
            if(a>c)
            {
               if(a>d)
               {
                 return a;
               }
               else{
                 return d;
               }
            }
            else{
              return c;
               }
         }
         else{
            if(b>c)
            {
               if(b>d)
               {
                 return c;
               }
               else{
                 return d;
               }
            }
            else{
               if(c>d){
                 return c;
               }
               else{
                  return d;
               }
            }
         }
      }
   }*/