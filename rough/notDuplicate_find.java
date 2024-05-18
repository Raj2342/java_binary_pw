public class notDuplicate_find {
      public static void main(String[] args) {
              int arr[] = { 1,2 };
              int result =0;
              for(int i=0; i<arr.length-1;i++)
              {
                  result = result^arr[i];
              }
              System.out.println(result);
      }
}
