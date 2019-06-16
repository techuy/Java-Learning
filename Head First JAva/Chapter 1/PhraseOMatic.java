public class PhraseOMatic{
    public static void main(String[] args)
    {
        // make three set of words to choose from
        String[] wordListOne = {
            "24/7","multi-Tier","30,00 foot","B-to-B","win-win","front-end","web-base","pervasive","smart","six-sigma","critical-path","dynamic","shout","Hello","sir"
        };
        String[] wordListTwo = {
            "empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"
        };
        String[] wordListThree={
            "process","tippingpoint","solution","architecture","core competency","strategy","mindshare","portal","space","vision","paradigm","mission"
        };

        //find out how many word in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate three random number
        int rand1 = (int) (Math.random()* oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()* threeLength);
        
        //buld a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //print it out
        System.out.println("What we need is a "+ phrase);
    }
}