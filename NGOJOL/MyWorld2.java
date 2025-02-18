import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AboutWorld here.
 * 
 * @author (Syalwa Aliya) 
 * @version (1.0)
 */
public class MyWorld2 extends World
{
    private int timeLeft = 1860; // = 30 detik // 1detik=60
    /**
     * Constructor for objects of class MyWorld2.
     */
    public MyWorld2()
    {    
        // Create a new world with 960x540 cells with a cell size of 1x1 pixels.
        super(960,540, 1); 
        prepare();
        started();
        setBackground("BG.png");
    }

    /**
     * Act method for the world.
     */
    public void act()
    {
        updateTimer();
        // playerKenaRumah();
    }

    /**
     * Update the timer and check if time is up.
     */
    private void updateTimer()
    {
        if (timeLeft > 0)
        {
            timeLeft--;
            showText("Waktu: " + timeLeft / 60 + " detik", 480, 20); // Tampilan waktu dalam detik
        }
        else
        {
            Greenfoot.stop();
            Greenfoot.setWorld(new GameOver());
        }
    }
    // Jika player menyentuh rumah pada level ini maka player akan di arahkan ke turunan world bagian Win
     // public void playerKenaRumah()
     // {
         // Greenfoot.setWorld(new Win());
     // }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // k
        Apanjang apanjang = new Apanjang();
        addObject(apanjang,480,528);
        A2 a2 = new A2();
        addObject(a2,48,111);
        A3 a3 = new A3();
        addObject(a3,73,311);
        A1 a1 = new A1();
        addObject(a1,235,424);
        A1 a12 = new A1();
        addObject(a12,193,168);
        Player player = new Player();
        addObject(player,29,383);
        Seblak seblak = new Seblak();
        addObject(seblak,46,45);
        A2 a22 = new A2();
        addObject(a22,910,261);
        Rumah rumah = new Rumah();
        addObject(rumah,912,192);
        Lele lele = new Lele();
        addObject(lele,910,376);
        A4 a4 = new A4();
        addObject(a4,456,168);
        A2 a23 = new A2();
        addObject(a23,911,437);
        A3 a32 = new A3();
        addObject(a32,413,355);
        Dimsum dimsum = new Dimsum();
        addObject(dimsum,414,291);
        a4.setLocation(503,112);
        a4.setLocation(413,119);
        a4.setLocation(417,118);
        a4.setLocation(421,118);
        a4.setLocation(421,110);
        A4 a42 = new A4();
        addObject(a42,634,310);
        Rintangan rintangan = new Rintangan();
        addObject(rintangan,596,264);
        Rintangan rintangan2 = new Rintangan();
        addObject(rintangan2,650,482);
        removeObject(rumah);
        Rumah2 rumah2 = new Rumah2();
        addObject(rumah2,916,192);
        Rintangan rintangan3 = new Rintangan();
        addObject(rintangan3,688,482);
        Rintangan rintangan4 = new Rintangan();
        addObject(rintangan4,20,266);
    }
    
}
