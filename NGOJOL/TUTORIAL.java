import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TUTORIAL here.
 * 
 * @author (Syalwa Aliya) 
 * @version (1.0)
 * ig : @syalwalyrh
 */
public class TUTORIAL extends Tombol
{
    /**
     * Act - do whatever the Tutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TUTORIAL(){
        setImage("TUTOR.png");
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            ((Menu)getWorld()).stopped();
            World Start = getWorld();
            Start = new TutorialWorld();
            Greenfoot.setWorld(Start);
        }
    } 
}
