import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (Syalwa Aliya) 
 * @version (1.0)
 * ig : @syalwalyrh
 */
public class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Food() {
        setImage("hotdog.png");// Set gambar pemain
        GreenfootImage image = getImage();
        image.scale(25, 25);    // nah yg ini untuk ubah ukuran gambar/ setImage("food.png");
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
