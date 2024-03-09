class human {
    int age ;
    public void Age1(){
        age=13;
        System.out.println(" sleep is good for human ");
        System.out.println(age);
    }
}

class student extends human
 {

}



class introduction {
    
    public static void main(String[] args) {
           student st = new student();
           st.Age1();
    }
}