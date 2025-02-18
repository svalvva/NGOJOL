import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ABOUT here.
 * 
 * @author (Syalwa Aliya) 
 * @version (1.0)
 * ig : @syalwalyrh
 */
public class ABOUT extends Tombol
{
    /**
     * Act - do whatever the ABOUT wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ABOUT(){
        setImage("ABOUT2.png");
    }
    /**
     * Act - do whatever the About wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            ((Menu)getWorld()).stopped();
            World Start = getWorld();
            Start = new AboutWorld();
            Greenfoot.setWorld(Start);
        }
    }   
}
