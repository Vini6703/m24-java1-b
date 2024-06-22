import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe responsavel pelo alien.
 * 
 * @author Vinicius de Oliveira 
 * @version 2024-04-27
 */
public class Alien extends Actor
{
    int pX = 1;
    /**
     * Act - do whatever the Alienigena wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(pX);
        if(isAtEdge()){
            pX *= -1; //pX = pX * -1;
        }
    }
}
