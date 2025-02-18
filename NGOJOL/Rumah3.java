import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rumah3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rumah3 extends Rumah
{
    /**
     * Act - do whatever the Rumah3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Rumah3() {
        setImage("Rumah.png");// Set gambar pemain
        GreenfootImage image = getImage();
        image.scale(60,60);    // nah yg ini untuk ubah ukuran gambar/ setImage("food.png");
    }
}
