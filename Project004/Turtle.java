import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Lobster implements Freezable
{
    private int counter;
    
    public Turtle(int count) {
        freeze(count);
    }
    
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(counter==0){
            super.act();
        }
        else
            counter--;
        // counter가 0이 되면 Lobster와 동일하게 움직임
    }
    
    public void freeze(int count) {
        counter=count;
    }
}
