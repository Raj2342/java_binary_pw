import java.util.Arrays;

public class  insertion_sort {

    public static void insertion_sort_print(int arr[])
      {

        for(int i=1;i<=arr.length-1;i++)
        {
            for(int j=i;j<=arr.length-1;j++)
            {
                while(j>0 && arr[j-1]>arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                     j--;
                }
            }
        }
      }
    public static void main(String[] args) {
         
         int arr[] = { 20,40 ,11,19,27,45};
         insertion_sort_print(arr);
         System.out.println(Arrays.toString(arr));
    }
}