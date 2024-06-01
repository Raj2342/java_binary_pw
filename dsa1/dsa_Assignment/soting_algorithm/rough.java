import java.util.Arrays;

public class rough {

    public static void insertion_sort(int arr[])
    {
        for(int i=1;i<=arr.length-1;i++)
        {
            for(int j=i;j<=arr.length-1;j++)
            {
                int temp=0;
                while(j>0 && arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;
                }
            }
        }
    }
    public static void main(String[] args) {
          int arr[] = { 20,40,11,19,27,45};
          insertion_sort(arr);
          System.out.println(Arrays.toString(arr));
    }
}
