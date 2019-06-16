class strReve{
    public static void main(String args[])
    {
        System.out.println(frontBack("code"));
    }
    public static String frontBack(String str)
    {
        String[] str1 = str.split("");
        String newS = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            newS +=str1[i];
        }
        return newS;
    }
}