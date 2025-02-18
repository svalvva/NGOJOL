import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win2 extends Actor
{
    /**
     * Act - do whatever the Win2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 100; // Adjust the delay as needed (200 ticks = 4 seconds if using 50 FPS)

    public void act() 
    {
        timer--;
        if (timer == 0) 
        {
            nextLevel();
        }
    }

    private void nextLevel()
    {
        World Start = getWorld();
        Start = new MyWorld2(); // Ganti dengan nama level berikutnya
        Greenfoot.setWorld(Start);
    }
}
