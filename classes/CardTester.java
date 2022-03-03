
/**
 * Write a description of class CardTester here.
 *
 * @author (Erol Gelbul)
 * @version (1.3 amended by Erol Gelbul 2020.04.20
 */
public class CardTester
{
    public static void main(String[] args)
    {
      //creating a few card objects for testing
      //Parameters we need for testing Card are:
      //public Card(int idnum, String nm, int luxr, int cr)
      //adding the first object
      Card card1 = new Card(1000, "Lynn", 5, 10);
      
      //testing credit addition into card 1
      int c1credits = card1.getCredits();
      System.out.println("\nCurrent Credits for Card 1 = " + c1credits);
      card1.addCredits(10);
      c1credits = card1.getCredits();
      System.out.println("10 Credits added for Card 1 = " + c1credits);
      
      //adding the second object
      Card card2 = new Card(1001, "May", 3, 30);
      
      //testing credit deduction from card 2
      int c2credits = card2.getCredits();
      System.out.println("\nCurrent Credits for Card 2 = " + c2credits);
      //additionally checking if there were enough credits
      boolean c2enough = card2.deductCredits(5);
      c2credits = card2.getCredits();
      System.out.println("5 Credits deducted from Card 2 = " + c2credits +
      " and were there enough credits? " + c2enough );
      
      //adding a third object
      Card card3 = new Card(1002, "Nils", 10, 25);
      
      //testing conversion from loyalty points to credits
      int c3credits = card3.getCredits();
      int c3lp = card3.getLP();
      System.out.println("\nCurrent Credits for Card 3 = " + c2credits 
      + " and current loyalty points = " + c3lp);
      card3.loyaltyToCredits(7);
      c3credits = card3.getCredits();
      c3lp = card3.getLP();
      //Should give an error, because loyalty point is zero
      System.out.println("We cannot convert at this time, credits now = "
      + c2credits + " and remaining Loyalty Points = " + c3lp);
      
      //display all the relevant information about the cards
      System.out.println(card1.toString());
      System.out.println(card2.toString());
      System.out.println(card3.toString());
    }
}
