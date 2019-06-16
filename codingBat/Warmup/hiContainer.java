//Given a string, return true if the string starts with "hi" and false otherwise.
class hiContainer
{
    public static void main(String args[])
    {
        System.out.println(startHi("h2"));
    }
    public static boolean startHi(String str)
    {
        if (str.length()>=2)
        {
            return str.substring(0, 2).equals("hi");
        }
        else return false;
    }
}