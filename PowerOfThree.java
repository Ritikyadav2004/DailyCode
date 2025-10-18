class PowerOfThree {
    public static int isDivisible(int n )
    {
        if(n==1) return 1;
        if(n<=0) return 0;
        if(n%3==0)
        {
            return isDivisible(n/3);
        }
        else return 0;
    }
    public boolean isPowerOfThree(int n) {
        return isDivisible(n)==1;
    }
    public static void main(String[] args) {
        PowerOfThree num = new PowerOfThree();
        System.out.println(num.isPowerOfThree(81));
    }
}