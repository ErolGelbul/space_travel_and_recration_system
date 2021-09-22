
/**
 * Write a description of class Shuttle here.
 *
* @author (Erol Gelbul)
 * @version (1.4 amended by Erol Gelbul 2020.04.20)
 */
public class Shuttle
{
    private String journeyCode;
    private World world1; 
  
   
    /**
     * Fields added above.
     * Shuttle constructor below has field values.
     * jCode is the shuttle's journey code
     */
    public Shuttle(String jCode )
    {
        journeyCode = jCode;
 
    }
    
    //accessor for the journey code
    public String getJourneyCode()
    {
        return journeyCode;
    }
    
    //to string method
    public String toString() 
    {
        String s = "****************" + "\n*  Shuttle Report";
        s = s + "\n*  Shuttle Code: " + journeyCode;
        s = s + "\n*****************";
        return s;
    } 
    
    /**
     * Journey Planner
     *
     *public boolean journeyPlanner()
     *{
     * boolean clear = false;
     * if (start != destination)
     *  {
     *       world1.number = world2.number;
     *   }
     *  return clear;
     *}
     */
}
