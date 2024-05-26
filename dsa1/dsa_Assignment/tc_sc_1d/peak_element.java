public class peak_element {
    
    public static int findFirstPeak(int[] arr) {
        int n = arr.length;
        
        // Check for the first peak element
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }
        
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 6, 5};
        int[] arr2 = {1, 4, 7, 3, 2, 6, 5};
        
        System.out.println("First peak in arr1: " + findFirstPeak(arr1)); 
        System.out.println("First peak in arr2: " + findFirstPeak(arr2)); 
    }
}
