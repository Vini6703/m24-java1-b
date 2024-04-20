import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aranha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aranha extends Actor
{
    /**
     * Act - do whatever the Aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        //Verifica se o numero aleatorio de 1 a 100 esta menos ou igual a 10
        if (Greenfoot.getRandomNumber(100)+1 <=10) {
            //Adiciona aleatoriamente de 1 a 20º para rotacionar
            turn(Greenfoot.getRandomNumber(91)-45);
        }
        
    }
}
