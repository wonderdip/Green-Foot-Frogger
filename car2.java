import greenfoot.*; 

public class car2 extends Actor
{
    private int counter = 0;
    
    // roads
    private int[] yPositions = {106 , 325}; 

    public void act()
    {
        counter++;
        setRotation(180);  // makes car2 move to the left side
        int car2_Amount = getWorld().getObjects(car2.class).size(); // counts how many car2 objects are on screen
        move(1);
        if (car2_Amount <= 1) {
            if (counter >= 60) {
                counter = 0;
                Actor clone = new car2();  // create a new car2 object
                
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
