

//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


class hundred{
    public static void main(String[] args)
    {
        System.out.println(nearHundred(90));
    }
    public static boolean nearHundred(int n) {
        if(Math.abs(100-n)<=10||Math.abs(200-n)<=10) return true;
        else return false;
    }
}