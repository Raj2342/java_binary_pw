import java.util.Arrays;

public class selection_sort {
    public static void selection_sort_print(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min =i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }

        if (min != i) {
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        }
    }
      public static void main(String[] args) {
             int arr[] = { 7,4,10,8,3,1};
             selection_sort_print(arr);
             System.out.println(Arrays.toString(arr));

      }
}
