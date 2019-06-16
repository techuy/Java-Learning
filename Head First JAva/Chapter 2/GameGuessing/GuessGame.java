public class GuessGame{
    // creating 3 players
    Player p1;
    Player p2;
    Player p3;
    
    public void StartGame(){
        //create objects and assign to instace variable;
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // create variable to hold the three guesses
        int guessp1 =0;
        int guessp2 = 0;
        int guessp3 = 0;

        //create variable to hold player answer
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        //make number that player have to guess
        int targetNumber = (int) (Math.random()*10);
        System.out.println("i'm thinking o a number between 0 to 9..");

        while(true){
            System.out.println("number is to guess is "+ targetNumber);

            // call player method;
            p1.guess();
            p2.guess();
            p3.guess();

            //get the player guess by acessing number variable of each player
            guessp1 = p1.number;
            System.out.println("Player one guessed "+ guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed "+ guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed "+ guessp3);

            //check the player guess , if it matches the target number, a player is right it will set the player's variable to true;
            if(guessp1 == targetNumber){
                p1isRight = true;
            }
            if(guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }

            //if player one OR player two OR player 3 is right 
            if(p1isRight || p2isRight||p3isRight)
            {
                System.out.println("We have a winner!!");
                System.out.println("Player one got it right ?"+ p1isRight);
                System.out.println("Player two got it right ?"+ p2isRight);
                System.out.println("Player three got it right ?"+ p3isRight);
                System.out.println("Game is OVER");
                break;
            }
            else
            {
                // keep the game going if nobody right
                System.out.println("Players will have to try again");
            }
        }
    }
}