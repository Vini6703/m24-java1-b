import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a Nave do Jogo.
 * 
 * @author Vinicius Oliveira 
 * @version 2024-04-27
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Verificando se foi teclado para esquerda, movemos para esquerda.
        if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        //Verificando se foi teclado para a direita, movemos para direita.
        if(Greenfoot.isKeyDown("right")){
            move(1);
        }
        //Verificando se foi teclado a barra de espaço, criamos a bala
        if (Greenfoot.isKeyDown("space")){
            getWorld().addObject(new Bala(), getX(), getY()-60);
        }
    }
}
