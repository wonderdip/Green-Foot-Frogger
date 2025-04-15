import greenfoot.*;
public class froggy extends Actor {
    public int speed;
    public froggy() {
        this.speed = 20; // current speed
        setRotation(270); // makes sure it starts off facing up
    }
    public void act() {
        // what ket is pressed
        String key = Greenfoot.getKey();
        
        // 6 checks for collisions with the cars, didnt feel like adding individual ones
        // || = OR
        if (getOneIntersectingObject(car.class) != null || getOneIntersectingObject(car2.class) != null || getOneIntersectingObject(car3.class) != null || getOneIntersectingObject(car4.class) != null || getOneIntersectingObject(car5.class) != null || getOneIntersectingObject(car6.class) != null) {
            gameOver gameOver = new gameOver();
            Greenfoot.setWorld(gameOver);
        } else {
            // Move the frog based on the key press
            if (key != null && key.equals("right")) {
                setRotation(0); //change the angle so it moves the right direction
                move(this.speed); // move it based on the speed i set
                key = null; // sets the key back to null so i cant hold it *thanks Brandon
            }
            if (key != null && key.equals("left")) {
                setRotation(180);
                move(this.speed);
                key = null;
            }
            if (key != null && key.equals("down")) {
                setRotation(90);
                move(this.speed);
                key = null;
            }
            if (key != null && key.equals("up")) {
                setRotation(270);
                move(this.speed);
                key = null;
            }
        }
        // changes the world to level 2 after froggy reaches the top
        if (getY() < 50 && getWorld() instanceof MyWorld) {
            level2 level2 = new level2();
            Greenfoot.setWorld(level2);
        }
        // changes the world to the win screen after it reaches the top but only if its also level 2
        if (getY() < 50 && getWorld() instanceof level2) {
            winScreen winScreen = new winScreen();
            Greenfoot.setWorld(winScreen);
        }
    }
}

