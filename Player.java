import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Karakter
{
    int speed = 10;
    int bulletSpeed = 15;
    int cooldown = 20;
    int lastShotTimer = 0;
    
    public Player()
    {
        GreenfootImage img = this.getImage();
        img.scale(60, 60);
        this.setImage(img);// Add your action code here.
    }
    
    public void tembak(){
        DuniaGweh wrld = (DuniaGweh)this.getWorld();
        Boolets bullet = new Boolets();
        bullet.setRotation(this.getRotation());
        wrld.inShotDone();
        wrld.addObject(bullet, this.getX(), this.getY()); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY()-speed);
        }
        
        if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY()+speed);
        }
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() -speed, this.getY());
        }
        
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() +speed, this.getY());
        }
        
        System.out.println(lastShotTimer);
        
        if(lastShotTimer < cooldown && lastShotTimer > 0){
            lastShotTimer ++;
        }
        
        if(Greenfoot.isKeyDown("space") && lastShotTimer == 0){
            tembak();
            lastShotTimer++;
        }
        
        if(lastShotTimer == cooldown){
            lastShotTimer = 0;
        }
        
        if(this.isTouching(Enemies.class)){
            World wrld = this.getWorld();
            Tewas d = new Tewas();
            wrld.addObject(d, this.getX(), this.getY());
            wrld.removeObject(this);
        }
    }
}

