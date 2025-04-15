import greenfoot.*;
// Maxime Rioux - Assignement #2
public class mainMenu extends World
{
    public mainMenu()
    {   
        // adds the start button so i can press it 
        super(300, 500, 1);
        startButton s = new startButton();
        addObject(s, 150 ,220);
    }
}
