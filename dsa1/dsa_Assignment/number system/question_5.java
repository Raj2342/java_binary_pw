public class question_5 {
    public static void main(String[] args) {
        
          int arr[]= {4,3,6,2,6,4,2,3,4,4,2};
          int result = 0;
          for(int i:arr){
            result = result^i;

          }
          System.out.println(result);

    }
}
