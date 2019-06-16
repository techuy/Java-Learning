import java.util.*;
class Sumoffour
{
    public static void main(String args[])
    {
        int sum = 0;
		int[] numArray = new int[4]; // Define an array of integers of size 4.
		Scanner s = new Scanner(System.in);
                int i;
		for(i=0; i<4; i++){
			numArray[i] = s.nextInt();// Get the input
			sum=sum+numArray[i];
		}
		
		
		// Write the logic to add these integers here:
	
		
		
		
		System.out.println(sum); // Print the sum
		s.close();
    }
}