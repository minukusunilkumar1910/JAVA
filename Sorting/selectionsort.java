package Sorting;
/*public class selectionsort {
   public static void main(String[] args) {
       int[] arr= {20,12,10,5,2};
       sort(arr);
       for(Integer i:arr){
      System.out.print(i+" ");
       }
   }
   static void sort(int[] arr)
   {
      for(int i=0;i<arr.length;i++)
      {
         int minIndex=i;
         for(int j=i;j<arr.length;j++)
         {
            if(arr[j]<arr[minIndex])
            {
               minIndex=j;
            }
         }
         int temp=arr[i];
       arr[i]=arr[minIndex];
       arr[minIndex]=temp;
      }
      

   }

}
public class selectionsort{
   public static void main(String[] args){
      int[] arr = {20,12,10,5,2};
      sort(arr);
      for(Integer i:arr){
         System.out.print(i+" ");
      }
   }
   static void sort(int[] arr){
      for(int i=0;i<arr.length;i++)
      {
         int minIndex=i;
         for(int j=i;j<arr.length;j++)
         {
              if(arr[j]<arr[minIndex])
              {
               minIndex=j;
              }
         }
         int temp= arr[i];
         arr[i]=arr[minIndex];
         arr[minIndex]=temp;
      }
   }
}

*/
public class selectionsort{
   public static void main(String[] args) {
      int[] arr={20,12,10,15,2};
      int minindex;

      for (int i= 0; i< arr.length;i++) 
      {
            minindex=i;
           for(int j=i;j<arr.length;j++) 
            {
               if(arr[j]<arr[minindex]){
                  minindex=j;
               }

            }  
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp; 
      }
      for(Integer r:arr){
         System.out.print(r+" ");
      }
   }
}