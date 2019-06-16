class make10{
    public static void main(String[] args)
    {
        System.out.println(makes10(10,5));
    }
    public static boolean makes10(int a, int b) {
        if(a==10||b==10||a+b==10) return true;
        else return false;
    }
    
}