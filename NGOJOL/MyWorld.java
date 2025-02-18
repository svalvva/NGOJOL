import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AboutWorld here.
 * 
 * @author (Syalwa Aliya) 
 * @version (1.0)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        prepare();
        started();
        setBackground("BG.png");

    }
 
    public void prepare()
    {
        // k
        Apanjang apanjang = new Apanjang();
        addObject(apanjang,480,517);
        Rumah rumah = new Rumah();
        addObject(rumah,879,449);
        A4 a4 = new A4();
        addObject(a4,146,471);
        a4.setLocation(146,470);
        a4.setLocation(52,469);
        a4.setLocation(53,469);
        A3 a3 = new A3();
        addObject(a3,72,422);
        a3.setLocation(72,421);
        A2 a2 = new A2();
        addObject(a2,50,373);
        Apanjang apanjang2 = new Apanjang();
        addObject(apanjang2,697,333);
        apanjang2.setLocation(414,333);
        apanjang2.setLocation(644,319);
        apanjang2.setLocation(468,335);
        removeObject(apanjang2);
        addObject(apanjang2,690,323);
        A3 a32 = new A3();
        addObject(a32,889,275);
        A2 a22 = new A2();
        addObject(a22,910,229);
        A1 a1 = new A1();
        addObject(a1,934,180);
        a1.setLocation(938,189);
        a1.setLocation(935,181);
        Apanjang apanjang3 = new Apanjang();
        addObject(apanjang3,284,144);
        A2 a23 = new A2();
        addObject(a23,485,96);
        A2 a24 = new A2();
        addObject(a24,484,275);
        Sate sate = new Sate();
        addObject(sate,592,83);
        Seblak seblak = new Seblak();
        addObject(seblak,39,206);
        Dimsum dimsum = new Dimsum();
        addObject(dimsum,386,453);
        Player player = new Player();
        addObject(player,50,13);
    }
    
}
