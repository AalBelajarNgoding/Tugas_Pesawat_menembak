import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tewas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tewas extends Proses
{
    /**
     * Act - do whatever the Tewas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int size = 60;
    public void act()
    {
        GreenfootImage img = this.getImage();
        img.scale(size, size);
        this.setImage(img);
        size--;
        if(size <=1){
            World wrld = this.getWorld();
            wrld.removeObject(this);
            Greenfoot.stop();
        }// Add your action code here.
    }
}
