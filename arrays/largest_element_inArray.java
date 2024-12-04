package arrays;

public class largest_element_inArray {
   public static void main(String[] args) 
   {
       int[] array ={2,4,5,3,6,5,8,9}; 
       int max=0;
       int result = larginArray(array,max);
       System.out.println(result+" is the largest in an array");
   }
   static int larginArray(int[] array,int max){

   
       for(int i=0;i<array.length;i++){
         if(array[i] > max){
            max = array[i];
         }
       }
          return max;
      }
}
