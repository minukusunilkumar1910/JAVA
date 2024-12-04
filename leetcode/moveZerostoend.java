package leetcode;
public class moveZerostoend {

   public static void main(String[] args) {
      int[] arr = { 1, 0, 2, 4, 0, 0, 4, 5, 1 };
      int n = arr.length;
      int j = -1;
      for (int i = 0; i < n; i++) {
         if (arr[i] == 0) {
            j = i;
            break;
         }
      }
      for (int i = j + 1; i < n; i++) {
         if (arr[i] != 0) 
         {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
         }
      }
      for(int k=0;k<n;k++)
      {
         System.out.print(arr[k]+" ");
      }
   }
}
