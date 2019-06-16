class notJava{
    public static void main(String args[])
    {
        System.out.println(notString("not"));
    }
    public static String notString(String str)
    {
      if(str.length()>=3)
      {
        if((str.substring(0, 3)).equals("not"))
        {
            return str;
        }
        else return "not "+str;
      }
      else
        return "not "+str;
    }
}