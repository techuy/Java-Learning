class Movie{
    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("movie is playing");
    }
}

public class movieObject{
    public static void main (String[]args){
        Movie one = new Movie();
        one.title = "Gone with the stock";
        one.genre = "Thriller";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in Cublicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Byte club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating =127;
    }
}