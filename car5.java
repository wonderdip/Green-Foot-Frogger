import greenfoot.*; 
// Maxime Rioux - Assignement #2
public class car5 extends Actor
{
    private int counter = 0;
    
    // roads
    private int[] yPositions = {106 , 325}; 

    public void act()
    {
        counter++;
        setRotation(180);  // makes car5 move to the left side
        int car2_Amount = getWorld().getObjects(car5.class).size(); // counts how many car5 objects are on screen
        move(2);
        if (car2_Amount <= 3) {
            if (counter >= 50) {
                counter = 0;
                Actor clone = new car5();  // create a new car5 object
                
                // randomly pick one of the Y positions
                int randomY = yPositions[Greenfoot.getRandomNumber(yPositions.length)]; 

                
                getWorld().addObject(clone, getWorld().getWidth() + 300, randomY); 
            }
        }

        // gets rid of the car
        if (getX() < 20) {
            getWorld().removeObject(this);
        }
    }
}
