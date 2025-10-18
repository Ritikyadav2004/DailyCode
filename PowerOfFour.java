class PowerofFour {
    public static int isDivisible(int n )
    {
        if(n==1) return 1;
        if(n<=0) return 0;
        if(n%4==0)
        {
            return isDivisible(n/4);
        }
        else return 0;
    }
    public boolean isPowerOfFour(int n) {
        return isDivisible(n)==1;
    }
    public static void main(String[] args) {
        PowerofFour num = new PowerofFour();
        System.out.println(num.isPowerOfFour(1021));
    }
}