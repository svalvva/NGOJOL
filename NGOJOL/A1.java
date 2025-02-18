import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A1 extends Platform
{
    /**
     * Act - do whatever the A1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("1.png");// Set gambar pemain
        GreenfootImage image = getImage();
        image.scale(50,50);    // nah yg ini untuk ubah ukuran gambar
    }
}
