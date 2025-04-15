import greenfoot.*;
// Maxime Rioux - Assignement #2
public class level2 extends World
{
    public level2()
    {   
        // adds all the faster cars and froggy
        super(300, 500, 1); 
        froggy frog = new froggy();
        addObject(frog, getWidth()/ 2 ,470);
        frog.setRotation(270);
        car4 car4 = new car4();
        addObject(car4, 50, 254);
        car5 car5 = new car5();
        addObject(car5, 250, 325);
        car5.setRotation(180);
        car6 car6 = new car6();
        addObject(car6, 50, 180);
        showText("Level 2", 250, 470);
    }
    public void act()
    {

    }
}
