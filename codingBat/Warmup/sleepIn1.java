class sleepIn1{
  public static boolean sleepIn(boolean weekday, boolean vacation) {
    if(weekday==false || vacation==true) 
      return true ;
      else return false;
  }
    public static void main(String[] args)
    {
      boolean a = sleepIn(true,false);
        System.out.println(a);
    }
}