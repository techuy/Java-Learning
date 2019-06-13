class front3
{
    public static void main(String args[])
    {
        System.out.println(repeat3T("Chocolate"));
    }
    public static String repeat3T(String str)
    {
        if(str.length()>3)
        {
           
            String temp = str.substring(0, 3);
            return temp.repeat(3);
        }
        else 
        return str.repeat(3);
    }
}