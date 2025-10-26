class RemoveZeroes {
    public long removeZero(long n) {
       String str = Long.toString(n) ;// number in integer;
       StringBuilder str1 = new StringBuilder();
        // str.toCharArray();
       for(int i=0;i<str.length();i++)
           {
               if(str.charAt(i)!='0')
               {
                   str1.append(str.charAt(i));
               }
           }
        return Long.parseLong(str1.toString());
        // return Long.parseLong(str1.toString());  // Correct

        
    }
    public static void main(String[] args) {
        RemoveZeroes obj = new RemoveZeroes();
        System.err.println(obj.removeZero(1082782002));
    }
}