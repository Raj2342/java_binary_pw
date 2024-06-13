
// binary serach using resucrsion
public  class binary_search {
      
     public static int binarySearch(int arr[],int target ,int high,int low)
     {
        //    low=0;
        //    high=arr.length-1;
           int mid=0;
           while(high>=low)
           {
             mid=(high+low)/2;
            if (arr[mid]==target) {
                return mid;
            }
            else if (arr[mid]<target) {
                
              return  binarySearch(arr,target,high,mid+1);
            }
            else{
                return binarySearch(arr, target, mid-1, low);
            }
              
           }
        return mid;
     }
    public static void main(String[] args) {
            int arr[]= { 11,23,45,15,10,18};
            int target = 10;
           int high=arr.length-1;
           int low=0;
          int result=  binarySearch(arr,target,high,low);
          System.out.println(result);
    }
}