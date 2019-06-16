
import java.util.*;
class seatingArragement
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("number of test case : ");
        int input = scan.nextInt();
        int[] seatNum = new int[input];
        int allSeat[][] = new int[18][6];
        int counter=1;
        //get user input
        for(int i=0;i<input;i++)
        {
            System.out.print("Seat number :");
            seatNum[i] = scan.nextInt();
        }
        for(int i=0;i<allSeat.length;i++)
            for(int j=0;j<allSeat[i].length;j++,counter++)
                allSeat[i][j]=counter;
        for(int i=0;i<allSeat.length;i++)
            System.out.println(Arrays.toString(allSeat[i]));
        //Algorithms
        
        for(int i=0;i<input;i++)
        {
            int index;
            if(seatNum[i]%6!=0)
                index = (int) (seatNum[i] / 6);
            else
                index = (seatNum[i]/6)-1;
            int j=0;
            while(j<6)
            {
                if(allSeat[index][j]==seatNum[i])
                {
                    break;
                }
                j++;
            }    
            System.out.println(j + " " + index);
            if(index%2==0)
            {
                switch(j)
                {
                    case 0: 
                        System.out.println(seatNum[i]+11 + " WS");
                        break;
                    case 1: 
                        System.out.println(seatNum[i]+9 + " MS");
                        break;
                    case 2: 
                        System.out.println(seatNum[i]+7 + " AS");
                        break;
                    case 3: 
                        System.out.println(seatNum[i]+5 + " AS");
                        break;
                    case 4: 
                        System.out.println(seatNum[i]+3 + " MS");
                        break;
                    case 5: 
                        System.out.println(seatNum[i]+1 + " WS");
                        break;
                }
            }
            else
            {
                switch(j)
                {
                    case 0: 
                        System.out.println(seatNum[i]-1 + " WS");
                        break;
                    case 1: 
                        System.out.println(seatNum[i]-3 + " MS");
                        break;
                    case 2: 
                        System.out.println(seatNum[i]-5 + " AS");
                        break;
                    case 3: 
                        System.out.println(seatNum[i]-7 + " AS");
                        break;
                    case 4: 
                        System.out.println(seatNum[i]-9 + " MS");
                        break;
                    case 5: 
                        System.out.println(seatNum[i]-11 + " WS");
                        break;
                }
            }
        }

    }
}