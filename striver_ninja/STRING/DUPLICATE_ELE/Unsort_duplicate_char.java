import java.util.HashSet;

public class  Unsort_duplicate_char {
    
    
    public static void main(String[] args) {
        
        String s = "APLEPLOMO";
        HashSet<Character> seeout = new HashSet<>();
        //  SORTED DUPLICATE  ************************ 
        char temp;
        char  ar[] = s.toCharArray();
        for(int i=0; i<ar.length-1;i++)
        {
            for(int j=0; j<ar.length-1;j++)
            {
                if (ar[j]>ar[j+1]) {
                    temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;

                }
               
                // find duplicate character
                if (ar[j] == ar[j+1]) {
                  seeout.add(ar[j]);
                }
            }
        }
        System.out.println(ar);
        System.out.println(seeout);

        
       
            
        }

   

  
             

           
    }
