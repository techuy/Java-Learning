class backAroun
{
    public static void main(String args[])
    {
        System.out.println(backAround("Hello"));
    }
    public static String backAround(String str)
    {
        return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }
}