import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    
    /**
     * Create a crab and initialize its two images.
     */
    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        wormsEaten = 0;
    }
    
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeypress();
        lookForWorm();
        switchImage();
        if(isAtEdge())
            turn(10);
        if( Greenfoot.getRandomNumber(100) < 10) 
            turn(Greenfoot.getRandomNumber(90) - 45);
        move(5);
    }
    
    /**
     * Alternate the crab's image between image1 and image2.
     */
    public void switchImage()
    {
        if (getImage() == image1) 
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
    
    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    {
        if(Greenfoot.isKeyDown("left")){
            turn(-4);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(4);
        }
    }
    
    /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing. If we have
     * eaten eight worms, we win.
     */
    public void lookForWorm()
    {
        if(isTouching(Worm.class)){
            removeTouching(Worm.class);
            wormsEaten++;
            Greenfoot.playSound("slurp.wav");
            if(wormsEaten==8){
            getWorld().showText("Congratulation!!",270, 270);
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.stop();
            }
        }
    }  
}
