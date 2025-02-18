import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AboutWorld here.
 * 
 * @author (Syalwa Aliya) 
 * @version (1.0)
 */
public class AboutWorld extends World
{

    /**
     * Constructor for objects of class AboutWorld.
     * 
     */
    public AboutWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1);
        setBackground("About.png");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Back back = new Back();
        BACK bACK = new BACK();
        addObject(bACK,480,450);
    }
}
