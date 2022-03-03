/**
 * @author (Erol Gelbul)
 * @version (1.2 amended by Erol Gelbul 2020.04.20)
 */
public class Card
{
    private int idNo;
    private String name;
    private int luxuryRating;
    private int credits;
    private int loyaltyPoints;
    
    /**
     * Fields added above.
     * Card constructor below has field values.
     * loyalPoints is set to zero.
     * Adds a card object to the array
     * idnum isluxr is the card's luxury rating the card's number
     * nm is the cards's name
     * 
     * cr is the card's remaining credit
     */
    public Card(int idnum, String nm, int luxr, int cr)
    {
        idNo = idnum;
        name = nm;
        luxuryRating = luxr;
        credits = cr;
        loyaltyPoints = 0;   
    }
    
    //accessor for the luxury rating
    public int getLuxuryRating()
    {
        return luxuryRating;
    }
    
    //accessor for the number of credits
    public int getCredits()
    {
        return credits;
    }
    
    //accessor for the loyaltypoints
    public int getLP()
    {
        return loyaltyPoints;
    }
    
    //accessor for the cardno
    public int getCardNo()
    {
        return idNo;
    }
    
    //accessor for the cardno
    public int getCardName()
    {
        return idNo;
    }
    
    //method to add credits
    public void addCredits(int amount)
    {
        credits = credits + amount;
    }
    
    //method to deduct credits and return boolean as true if you can
    public boolean deductCredits(int amount)
    {
        boolean enough = false;
        if ((credits - amount) >= 0)
        {
            credits = credits - amount;
            enough = true;
        }
        return enough;
    }
    
    //loyalty points to credits converter
    public void loyaltyToCredits(int amount)
    {
        if ((credits - amount) >= 0 && loyaltyPoints > 0)
        {
            credits = credits - amount;
            loyaltyPoints = loyaltyPoints + amount;
        }
    }
    
    //same parameter as the card id
    public boolean itsAMatch(int amount)
    {
        boolean match = false;
        if (amount == idNo)
        {
            match = true;
        }
        return match;
    }
   
    //returning all relevant information about the card
    public String toString() 
    {
        String s = "****************" + "\n*  Card Report";
        s = s + "\n*  Card ID: " + idNo  + "\n*  Name: " 
              + name + "\n*  Luxury Rating : " +  luxuryRating
              + "\n*  Credits : " +  credits + "\n*  Loyalty Points : "
              + loyaltyPoints;
        s = s + "\n*****************";
        return s;
    }
}
