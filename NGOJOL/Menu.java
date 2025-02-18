import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AboutWorld here.
 * 
 * @author (Syalwa Aliya) 
 * @version (1.0)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1);
        setBackground("Menu.png");
        prepare();        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        ABOUT aBOUT = new ABOUT();
        addObject(aBOUT,480,400);
        TUTORIAL tUTORIAL = new TUTORIAL();
        addObject(tUTORIAL,480,340);
        PLAY pLAY = new PLAY();
        addObject(pLAY,480,270);
    }
}
