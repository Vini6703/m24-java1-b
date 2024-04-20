import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe mosca destinada a fzer parte do jogo BeeWorld.
 * 
 * @author Vinicius de Oliveira 
 * @version 2024-04-20
 */
public class Mosca extends Actor
{
    /**
     * Metodo Act é executado sempre que apertarmos o botão Act ou ficara em
     * execução quando apertarmos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if (isAtEdge()) {
            turn(180);
        }
        
    }
}
