class posNeg{
    public static void main(String[] args)
    {
        System.out.println(posNegg(-4,-5,true));
    }
    public static boolean posNegg(int a,int b, boolean negative)
    {
        if(negative==false)
        if(a<0) if(b>0) return true;
                else return false;
        else
          if(b<0) return true;
          else return false;
        
      else
        if(a<0&&b<0) return true;
        else return false;
    }
}