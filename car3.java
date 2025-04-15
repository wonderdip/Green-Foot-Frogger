import greenfoot.*; 
// Maxime Rioux - Assignement #2
public class car3 extends Actor
{
    private int counter = 0;
    
    // roads
    private int[] yPositions = {35 ,180}; 

    public void act()
    {
        counter++;
        int car3_Amount = getWorld().getObjects(car3.class).size(); // counts how many car3 objects are on screen
        move(2);
        if (car3_Amount <= 1) {
            if (counter >= 60) {
                counter = 0;
                Actor clone = new car3();  // create a new car3 object
                
                // randomly pick one of the Y positions
                int randomY = yPositions[Greenfoot.getRandomNumber(yPositions.length)]; 

                
                getWorld().addObject(clone, getWorld().getWidth() - 300, randomY); 
            }
        }

        // gets rid of the car
        if (getX() > 280) {
            getWorld().removeObject(this);
        }
    }
}
