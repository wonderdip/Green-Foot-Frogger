import greenfoot.*;
// Maxime Rioux - Assignement #2
public class gameOver extends World
{
    private int timer; // timer 
    public gameOver()
    {    
        super(300, 500, 1); 
        timer = 2 * 55; // how long until it sets it back
    }
    public void act() {
        if (timer <= 0) {
            Greenfoot.setWorld(new MyWorld()); // sets it back to level 1
        }
        else {
            timer--; // makes the timer go down
        }        
    }
}
