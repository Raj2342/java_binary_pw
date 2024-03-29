class  try_multiple_catch {
     public static void main(String[] args) {
            int num1 = 6;
            int num2 =2;
            int result = 0;
            int arr[] = { 2,3,4,5};
            String  name = null;
            System.out.println("welcome ");
            try{
               result = num1/num2;
               
               System.out.println(result);
               System.out.println(num1/name.length());
               System.out.println(arr[0]);
            }
            catch(ArithmeticException obj)
            {
               System.out.println(" cannot divide by 0"+ obj);
            }
            catch(ArrayIndexOutOfBoundsException obj){
               System.out.println("value overlimit it should be limited ");
            }
            // all type  error throw they can catch 
            catch(Exception obj ){
               System.out.println("something went wrong");
            }
            System.out.println(result);
            System.out.println("hey");
     }
}