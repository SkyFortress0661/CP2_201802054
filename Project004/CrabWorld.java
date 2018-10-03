import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab, 231, 203);
        
        Worm[] worm = new Worm[10];
        for(int i = 0;i<10;i++){
            worm[i] = new Worm();
            addObject(worm[i],Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        }
        
        Lobster[] lobster = new Lobster[3];
        for(int i = 0;i<3;i++){
            lobster[i] = new Lobster();
        }
        addObject(lobster[0], 334, 65);
        addObject(lobster[1], 481, 481);
        addObject(lobster[2], 79, 270);
        
        Turtle turtle = new Turtle(100);
        addObject(turtle,Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
    }
}
