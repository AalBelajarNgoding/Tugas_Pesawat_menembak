import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boolets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boolets extends Proses
{
    int speed = 10;
    
    public Boolets(){
        GreenfootImage img = this.getImage();
        img.scale(20, 20);
        this.setImage(img);
    }
    
    public Boolets(int bulletSpeed){
        GreenfootImage img = this.getImage();
        img.scale(30, 20);
        this.setImage(img);
        this.speed = bulletSpeed;
    }
    
    public void act()
    {
        this.move(speed);
        
        if(this.isAtEdge()){
            DuniaGweh wrld = (DuniaGweh)this.getWorld();
            wrld.incShotMiss();
            wrld.removeObject(this);
        }
        
        // Add your action code here.
    }
}
