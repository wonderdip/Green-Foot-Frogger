import greenfoot.*; 
// Maxime Rioux - Assignement #2
public class car extends Actor
{
    private int counter = 0;
    
    // roads
    private int[] yPositions = { 253, 397}; 

    public void act()
    {
        counter++;
        int actorCount = getWorld().getObjects(car.class).size(); // to count frames and how many cars
        move(1);
        if (actorCount <= 3) {
            if (counter >= 95) {
                counter = 0;
                Actor clone = new car(); // add clone of my car
                
                // randomly pick one of the Y positions
                int randomY = yPositions[Greenfoot.getRandomNumber(yPositions.length)]; 

                getWorld().addObject(clone, getWorld().getWidth() - 300, randomY); // add it to the world
            }
        }   
        // kills itself if it goes past 280 
        if (getX() > 280) {
            getWorld().removeObject(this);
        }
    }
}
