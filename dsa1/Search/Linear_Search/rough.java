public class rough {

    public static int call(int arr[] , int target)
    {
          for(int i=0;i<arr.length-1;i++){
              if(arr[i]==target)
              return i;
          }
          return -1;
    }
    public static void main(String[] args) {
           int arr[]= { 10 ,15 ,20 ,25 , 30 ,35,40};
           int target = 88;
          int result = call(arr,target);
          System.out.println(result);
    }
}
