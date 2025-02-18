import greenfoot.*;

/**
 * Write a description of class AboutWorld here.
 * 
 * @author (Syalwa Aliya) 
 * @version (1.0)
 * ig : @syalwalyrh
 */
public class Player extends Actor
{
    private int vSpeed = 0; //kecepatan vertikal
    private int acceleration = 1; //percepatan yang akan diterapkan pada kecepatan vertikal
    public boolean jumping;
    private int jumpStrength = 16;
    private int speed = 4;
    private boolean punyaFood = false;
    private int direction = 1; 
    private int defaultSpeed = 4; // Kecepatan standar
    private int slowSpeed = 1; // Kecepatan lambat
    private int totalFood = 3; // Total makanan yang harus dikumpulkan
    private int collectedFood = 0; // Makanan yang sudah terkumpul
    private int teleportCooldown = 0; // Cooldown untuk teleportasi

    public Player(){
        this.totalFood = totalFood; // Inisialisasi total makanan yang harus dikumpulkan
        setImage("PKanan.png");
        GreenfootImage image = getImage();
        image.scale(50,50); 
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKey();
        checkFall();        
        platformAbove();
        checkRightWalls();
        checkLeftWalls();
        checkCollision();
        NextLevel();
        Food();
        NyentuhRumahLvl2();
        NyentuhRumahLvl3();
        checkPortalTeleport(); 
    }   
    
    public void Food()
    {
        if (canSee(Food.class) )
        {
            get(Food.class);
            collectedFood++; // Tambahkan jumlah makanan yang sudah terkumpul
        }
    }

    public void NextLevel()
    {
        if(canSee(Rumah.class) && collectedFood >= totalFood)
        {
            // Greenfoot.stop();
            Greenfoot.setWorld(new MyWorld2());
        }
    }
    // tanda
    public void checkKey()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            direction = 1;
            setLocation(getX() + speed, getY());
            setImage("PKanan.png");
            GreenfootImage image = getImage();
            image.scale(50,50); 
        }
        if(Greenfoot.isKeyDown("a"))
        {
            direction = -1;
            setLocation(getX() - speed, getY());
            setImage("PKiri.png");
            GreenfootImage image = getImage();
            image.scale(50,50); 
        }
        if(Greenfoot.isKeyDown("w") && jumping == false)
        {
            jump();
        }
    }

    public boolean platformAbove()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        Actor ceiling = getOneObjectAtOffset(0, yDistance, Platform.class);
        if(ceiling != null)
        {
            vSpeed = 1;
            bopHead(ceiling);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean checkRightWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/2);
        Actor rightWall = getOneObjectAtOffset(xDistance, 0, Platform.class);
        if(rightWall == null)
        {
            return false;
        }
        else
        {
            stopByRightWall(rightWall);
            return true;
        }
    }

    public void stopByRightWall(Actor rightWall)
    {
        int wallWidth = rightWall.getImage().getWidth();
        int newX = rightWall.getX() - (wallWidth + getImage().getWidth())/2;
        setLocation(newX - 5, getY());
    }

    public boolean checkLeftWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/-2);
        Actor leftWall = getOneObjectAtOffset(xDistance, 0, Platform.class);
        if(leftWall == null)
        {
            return false;
        }
        else
        {
            stopByLeftWall(leftWall);
            return true;
        }
    }

    public void stopByLeftWall(Actor leftWall)
    {
        int wallWidth = leftWall.getImage().getWidth();
        int newX = leftWall.getX() + (wallWidth + getImage().getWidth())/2;
        setLocation(newX + 5, getY());
    }

    public void bopHead(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }

    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <=9)
        {
            vSpeed = vSpeed + acceleration;
        }
        jumping = true;
    }

    public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        if(ground == null)
        {
            jumping = true;
            return false;
        }
        else
        {
            moveToGround(ground);
            return true;
        }
    }

    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
    }

    public void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }

    public void jump()
    {
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall();
    }
    
    public boolean getJump()
    {
        return jumping;
    }
  
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }

    public void get(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }   
 

    public void checkCollision()
    {
        if(canSee(Rintangan.class))
        {
            speed = slowSpeed;
        }
        else
        {
            speed = defaultSpeed;
        }
    }
    
    private void NyentuhRumahLvl2()
    {
         if (canSee(Rumah2.class) && collectedFood >= totalFood)
         {
             Greenfoot.setWorld(new MyWorld3());
         }
    }
     
    private void NyentuhRumahLvl3()
    {
        if (canSee(Rumah3.class) && collectedFood >= totalFood)
        {
            Greenfoot.setWorld(new Win());
        }
    }
    
    private void checkPortalTeleport()
    {
        if (teleportCooldown == 0)
        {
            if (canSee(Portal1.class))
            {
                setLocation(getWorld().getObjects(Portal2.class).get(0).getX(), getWorld().getObjects(Portal2.class).get(0).getY());
                teleportCooldown = 30; // Set cooldown untuk 30 frame
            }
            else if (canSee(Portal2.class))
            {
                setLocation(getWorld().getObjects(Portal1.class).get(0).getX(), getWorld().getObjects(Portal1.class).get(0).getY());
                teleportCooldown = 30; // Set cooldown untuk 30 frame
            }
        }
    }
}
