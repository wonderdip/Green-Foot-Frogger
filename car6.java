import greenfoot.*; 
// Maxime Rioux - Assignement #2
public class car6 extends Actor
{
    private int counter = 0;
    
    // roads
    private int[] yPositions = {35 ,180}; 

    public void act()
    {
        counter++;
        int car3_Amount = getWorld().getObjects(car6.class).size(); // counts how many car6 objects are on screen
        move(4);
        if (car3_Amount <= 2) {
            if (counter >= 50) {
                counter = 0;
                Actor clone = new car6();  // create a new car6 object
                
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
