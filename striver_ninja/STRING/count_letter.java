class count_letter {
    public static void main(String[] args) {
        String  s = "raja";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i) !=' ') {
                count = count +1;
            }
        }
        System.out.println(count);
    }
}
