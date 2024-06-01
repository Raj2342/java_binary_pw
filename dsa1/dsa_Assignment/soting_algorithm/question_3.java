import java.util.Arrays;

public class question_3 {

    public static void  insertion_sort(int arr[]){
                 
         for(int i=1;i<=arr.length-1;i++)
         {
            for(int j=i;j<=arr.length-1;j++)
            {
                while ( j>0 && arr[j-1]<arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                    j--;
                }
            }
         }

    }
    public static void main(String[] args) {
         int arr[]= {3,5,1,6,0};
            insertion_sort(arr);
            System.out.println(Arrays.toString(arr));
    }
}
