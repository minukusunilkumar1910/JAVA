class stackImpArray
{


   int top =-1;
   int[] st = new int[10];


void push(int x)
{
   if(top == 10)
   {
      System.out.println("stack is full");
   }
   top = top+1;
   st[top]=x;
}

void pop()
 {
   if(top == -1)
   {
      System.out.println("stack is empty");
   }
   top =top-1;
}
int top()
{
   return st[top];
}
int size()
{
   return top+1;
}
void display()
{
   if(top == -1)
   {
      System.out.println("stack is empty");
   }
   else
   {

      for(int i=0;i<st.length;i++)
      {
         
         System.out.print(st[i]+" ");
      }
   }
}



   public static void main(String[] args) {
       stackImpArray  stack = new stackImpArray();

       stack.push(7);
       stack.push(5);
       stack.push(3);
       stack.push(4);
       stack.push(9);
       stack.push(7);
       stack.push(15);
       stack.push(13);
       stack.push(14);
       stack.push(11);
      //  stack.push(9);

    
 
      //  for(int i=0;i<=stack.size();i++)
      //  {
      //    System.out.println(stack.top);
      //  }
   //   System.out.println(stack.top());
   //   System.out.println(stack.size());
     stack.display();
   }
}