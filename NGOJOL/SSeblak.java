import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SSeblak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SSeblak extends Seblak
{
    /**
     * Act - do whatever the SSeblak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public SSeblak() {
        setImage("seblak.png");// Set gambar pemain
        GreenfootImage image = getImage();
        image.scale(40,40);    // nah yg ini untuk ubah ukuran gambar/ setImage("food.png");
    }
}
