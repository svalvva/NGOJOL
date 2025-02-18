import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AboutWorld here.
 * 
 * @author (Syalwa Aliya) 
 * @version (1.0)
 */
public class MyWorld3 extends World
{
    private int timeLeft = 1860; // = 30 detik // 1detik=60
    /**
     * Constructor for objects of class MyWorld2.
     */
    public MyWorld3()
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

        Spanjang spanjang = new Spanjang();
        addObject(spanjang,480,522);
        Portal1 portal1 = new Portal1();
        addObject(portal1,251,447);
        portal1.setLocation(251,476);
        portal1.setLocation(251,465);
        S5 s5 = new S5();
        addObject(s5,748,83);
        portal1.setLocation(933,156);
        portal1.setLocation(940,483);
        portal1.setLocation(945,459);
        portal1.setLocation(940,410);
        portal1.setLocation(936,470);
        Spanjang spanjang2 = new Spanjang();
        addObject(spanjang2,480,414);
        portal1.setLocation(927,463);
        portal1.setLocation(927,469);
        Portal2 portal2 = new Portal2();
        addObject(portal2,23,56);
        portal2.setLocation(23,372);
        portal2.setLocation(857,142);
        portal2.setLocation(562,144);
        S3 s3 = new S3();
        addObject(s3,616,198);
        S2 s2 = new S2();
        addObject(s2,780,291);
        A2 a2 = new A2();
        addObject(a2,50,373);
        A1 a1 = new A1();
        addObject(a1,25,325);
        S2 s22 = new S2();
        addObject(s22,211,261);
        S3 s32 = new S3();
        addObject(s32,80,116);
        A1 a12 = new A1();
        addObject(a12,267,218);
        removeObject(a12);
        S1 s1 = new S1();
        addObject(s1,265,222);
        S2 s23 = new S2();
        addObject(s23,373,187);
        S1 s12 = new S1();
        addObject(s12,427,148);
        S1 s13 = new S1();
        addObject(s13,482,148);
        S1 s14 = new S1();
        addObject(s14,506,111);
        s14.setLocation(507,111);
        Player player = new Player();
        addObject(player,39,461);
        Rintangan rintangan = new Rintangan();
        addObject(rintangan,806,249);
        Rintangan rintangan2 = new Rintangan();
        addObject(rintangan2,754,249);
        Rintangan rintangan3 = new Rintangan();
        addObject(rintangan3,612,374);
        S1 s15 = new S1();
        addObject(s15,320,296);
        Rintangan rintangan4 = new Rintangan();
        addObject(rintangan4,511,374);
        Rintangan rintangan5 = new Rintangan();
        addObject(rintangan5,409,374);
        Rintangan rintangan6 = new Rintangan();
        addObject(rintangan6,211,374);
        Rintangan rintangan7 = new Rintangan();
        addObject(rintangan7,216,220);
        Rintangan rintangan8 = new Rintangan();
        addObject(rintangan8,380,145);
        Rumah3 rumah3 = new Rumah3();
        addObject(rumah3,919,22);
        rumah3.setLocation(940,44);
        rumah3.setLocation(928,34);
        SSate sSate = new SSate();
        addObject(sSate,34,53);
        SLele sLele = new SLele();
        addObject(sLele,318,244);
        SDim sDim = new SDim();
        addObject(sDim,916,146);
        Rintangan rintangan9 = new Rintangan();
        addObject(rintangan9,23,278);
        Rintangan rintangan10 = new Rintangan();
        addObject(rintangan10,88,74);
        rintangan10.setLocation(90,80);
        rintangan10.setLocation(86,77);
        rintangan10.setLocation(86,75);
        Rintangan rintangan11 = new Rintangan();
        addObject(rintangan11,942,373);
        rintangan11.setLocation(936,373);
        rintangan11.setLocation(941,375);
    }
    
}
