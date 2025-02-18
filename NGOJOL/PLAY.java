import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PLAY here.
 * 
 * @author (Syalwa Aliya) 
 * @version (1.0)
 * ig : @syalwalyrh
 */
public class PLAY extends Tombol
{
    /**
     * Act - do whatever the PLAY wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PLAY(){
        setImage("PLAY.png");
    }
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            ((Menu)getWorld()).stopped();
            World Start = getWorld();
            Start = new MyWorld();
            Greenfoot.setWorld(Start);
        }
    }   
}
