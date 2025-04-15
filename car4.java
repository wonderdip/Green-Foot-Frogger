import greenfoot.*; 
// Maxime Rioux - Assignement #2
public class car4 extends Actor
{
    private int counter = 0;
    
    // roads it can spawn in Y
    private int[] yPositions = { 253, 397}; 

    public void act()
    {
        counter++;
        int actorCount = getWorld().getObjects(car4.class).size(); // to count frames and how many cars
        move(2);
        if (actorCount <= 2) {
            if (counter >= 70) {
                counter = 0;
                Actor clone = new car4(); // add clone of my car4
                
                // randomly pick one of the Y positions
                int randomY = yPositions[Greenfoot.getRandomNumber(yPositions.length)]; 

                getWorld().addObject(clone, getWorld().getWidth() - 300, randomY); // add it to the world
            }
        }   
        // if it gets to the other side it will delete itself
        if (getX() > 280) {
            getWorld().removeObject(this);
        }
    }
}
