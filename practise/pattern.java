

/* 
public class pattern{
   public static void main(String[] args){
      int n=5;
      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         }
         System.out.println("");
      }
   }
}
   
  public class pattern{
   public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++)
       {
         for(int j=n;j>=i;j--)
         {
            System.out.print("* ");
         }
         System.out.println("");
       }
   }
}
 
  public class pattern{
public static void main(String[] args)
{
 int n=5;
 for(int i=1;i<=n;i++)
 {
   for(int k=1;k<=i-1;k++)
   {
      System.out.print(" ");
   }
   for(int j=1;j<=n-i+1;j++)
   {
      System.out.print((char)(j+64)+"");
   }
   System.out.println("");
 }
}
}

 public class pattern{
   public static void main(String[] args)
   {
      int n=5;
      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=i;j++)
         {
            System.out.print("*");
         }
         System.out.println("");
      }
   }
}

*/
// public class pattern{
//    public static void main(String[] args){
//       int n=5;
//       for(int i=1;i<=n;i++)
//       {
//          for(int j=n;j>=i;j--)
//          {
//             System.out.print("*");
//          }
//          System.out.println("");
//       }
//    }
// }

// class pattern {
//    public static void main(String[] args) {
//       int n=3 ;
//       int m=9;
//       pat(n,m);
//    }
//    static void pat(int n,int m)
//    {
//       for(int i=0;i<n;i++)
//       {
//          for(int j=0;j<m;j++)
//          {
//             System.out.print("*"+"");
//             if(j!=m-1)
//             {
//                System.out.print("_");
//             }

//          }
//          System.out.println();
//       }
//    }
// }

class pattern {
   public static void main(String[] args) {
      int n=4 ; 
      pat(n);
   }
   static void pat(int n)
   {
      int m=30;
      for(int i=0;i<n;i++)
      {
         for(int j=0;j<m;j++)
         {
            if(i==0 ||i==n-1||j==0||j==m-1)
            {
               System.out.print("*");
            }
            else
            {
               System.out.print(" "); 
            }

         }
         System.out.println();
      }
   }
}

