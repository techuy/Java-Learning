import java.util.*;
class PrimeNumber{
    public static void main(String args[])
    {
        int i=3;
        int count=2;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N>=1)
        {
            System.out.println("2");
        }
        while(i<=N)
        {
            for(count=2;count<=i;count++)
            {
                if(i%count==0) break;
            }
            if(i==count) System.out.print(i+" ");
            i++;
        }
    }
}