import greenfoot.*;
// Maxime Rioux - Assignement #2
public class MyWorld extends World
{
    public MyWorld()
    {
        // adds the starter cars and the froggy
        super(300, 500, 1); 
        froggy frog = new froggy();
        addObject(frog, getWidth()/ 2 ,470);
        frog.setRotation(270);
        car car = new car();
        addObject(car, 50, 254);
        car2 car2 = new car2();
        addObject(car2, 250, 325);
        car2.setRotation(180);
        car3 car3 = new car3();
        addObject(car3, 50, 180);
        showText("Level 1", 250, 470);
    }
    public void act()
    {

    }
}
