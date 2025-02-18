import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BACK here.
 * 
 * @author (Syalwa Aliya) 
 * @version (1.0)
 * ig : @syalwalyrh
 */
public class BACK extends Tombol
{
    public BACK(){
        setImage("BACK.png");
    }
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            (getWorld()).stopped();
            World Start = getWorld();
            Start = new Menu();
            Greenfoot.setWorld(Start);
        }
    }
}
