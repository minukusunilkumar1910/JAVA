package leetcode;
import java.util.Scanner;
public class duplicate_element_arr 
{
   public static void main(String[] args) {
      int[] arr=new int[6];
   
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array Elements");
      for(int i=0;i<arr.length;i++)
      {
         arr[i]=sc.nextInt();
      }
      int result=removedup(arr);
      System.out.println(result);
   }
       
  public static int removedup(int[] arr)
   {
      
      int i=0;
      for(int j=1;j<arr.length;j++)
      {
          if(arr[j] != arr[i])
          {
            arr[i+1]=arr[j];
            i++;
          }
      }
      return (i+1);
   }
}
