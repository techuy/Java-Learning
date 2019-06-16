class frontBack{
    public static void main(String args[])
    {
        System.out.println(Frontoback("a"));
    }
    public static String Frontoback(String str)
    {
        if(str.length()>1)
        {
            String mid = str.substring(1, str.length()-1);
            return str.charAt(str.length()-1) + mid + str.charAt(0);
        }
        else return str;
    }
}