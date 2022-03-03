import java.util.*;
/**
 * Write a description of class World here.
 *
 * @author (Erol Gelbul)
 * @version (1.2 amended by Erol Gelbul 2020.04.20)
 */
public class World
{
    private int number;
    private String name;
    private int rating;
    private int capacity;
    private ArrayList<Card> card;
    
    /**
     * Fields added above.
     * World constructor below has field values.
     * loyalPoints is set to zero.
     */
    public World(int num, String nm, int rt, int cap)
    {
        number = num;
        name = nm;
        rating = rt;
        capacity = cap;
        card = new ArrayList<Card>();
    }
    
    //accessor to return its rating
    public int getRating()
    {
        return rating;
    }
    
    //working on arraylist
    /** 
     * Adds a Card object to the array
     * c is the reference to the Card object
     */
    public void enter(Card c)
    {
        card.add(c);
    }
   
    /** 
     * Adds a card object to the array
     * no is the card's number
     * nme is the cards's name
     * lr is the card's luxury rating
     * cr is the card's remaining credits
     */
    public void enter(int no, String nme, int lr, int cr)
    {
        Card xx = new Card(no,nme,lr,cr);
        card.add(xx);
    }
    
    /** 
     * Adds a Card object to the array at the specified position
     * pos it the position 
     * co is the reference to the Card object
     */
    public void enter(int pos, Card co)
    {
        card.add(pos, co);
    }
    
    public void leave(int index)
    {
        if(index < card.size())
        {
            card.remove(index);
        }
    }
    
     /** Returns the position in the array of the cardnt with the 
     *  specified card no
     *  cNo is the card's number
     *  return the position of the card in the array, 
     *  or -1 if not found
     */
    public int findCardbycNo(int cNo)
    {
        for (int i = 0; i < card.size(); i++)  //can't use the for..each as no index
        {
            Card temp = card.get(i);
            if((temp.getCardNo() == cNo))
            {
                return i;
            }
        }
        return -1;       

    }
    
    public Card getCard(int pos)
    {
        if (pos< card.size())
        {
            return card.get(pos);
        }
        return null;
    }
    
    public Card getCardbycNo(int cNo)
    {
       for (int i = 0; i < card.size(); i++)
        {
           Card temp = card.get(i);
           if((temp.getCardNo() == cNo))
            {
                return temp;
            }
        }
        return null;
        //OR try using the new for ..each loop
    }
    
    //an accessor which returns a boolean (true) saying whether a card is on the world
    public boolean checkCardbycNo(int cNo)
    {
       boolean here = false;
       for (int i = 0; i < card.size(); i++)
       {
            Card temp = card.get(i);
            if((temp.getCardNo() == cNo))
            {
                here = true;
            }
       }
       return here;
    }
    
    //toString method
    public String toString()
    {
       String ss = "\n";
       for (Card temp:card)
       {
            ss = ss + temp.toString() + "\n";
       }
       return ss;
    }  
}
