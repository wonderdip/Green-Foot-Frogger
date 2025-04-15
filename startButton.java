import greenfoot.*;
// Maxime Rioux - Assignement #2
public class startButton extends Actor
{
    public void act()
    {
        // if its clicked it will set the world to level 1
        if (Greenfoot.mouseClicked(this)) {
            MyWorld MyWorld = new MyWorld();
            Greenfoot.setWorld(MyWorld);  
        }
    }
}
