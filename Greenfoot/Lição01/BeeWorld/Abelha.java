import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada no jogo BeeWorld.
 * 
 * @author Vinicius de Oliveira 
 * @version 2024-04-20
 */
public class Abelha extends Actor
{
    /**
     * Método que será executado quando apertado o botão Act ou Run.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        // Se teclar para a esquerda, gira-se -10º
        if (Greenfoot.isKeyDown("left")){
            turn (-10);
        }
        // Se teclar para a direita, gira-se 10º
        if (Greenfoot.isKeyDown("right")){
            turn(10);
        }
        //Verificando se esta nos cantos
        verifcarPosicao();
        //Verifica se toca em uma mosca
        capturaMosca();
    }
    /**
     * Metodo que verifica se esta na direita do mundo
     */
    public boolean isNaDireita(){
        if (getX() > getWorld().getWidth()-10){
            return true;
        }
        return false;
    }
        /**
         * Metodo que verifica se esta na esquerda do mundo
         */
    public boolean isNaEsquerda(){
        return ( getX()<10 );
    }
    /**
     * Metodo que verifica se está no topo do mundo
     */
    public boolean isNaBase(){
        return (getY() > getWorld().getHeight()-10);
    }
    /**
     * Metodo que verifica se esta no topo do mundo
     */
    public boolean isNoTopo(){
        return (getY() < 10);
    }
    /**
     * Metodo que verifica se a abelha está nos cantos e reposiciona ela
     */
    public void verifcarPosicao(){
        //verificando se a abelha está na direita
        if (isNaDireita()){
            setLocation(10, getY());
        }
        //Verifica se esta na esquerda
        if(isNaEsquerda()){
            setLocation(getWorld().getWidth()-10, getY());
        }
        //Verifica se está no topo do mundo
        if (isNoTopo()){
            setLocation(getX(), getWorld().getHeight()-10);
        }
        //Verifica se está na base do mundo
        if (isNaBase()){
                setLocation(getX(),10);
            }
        }
    /**
     * Metodo que captura a mosca
     */
    public void capturaMosca(){
        if (isTouching(Mosca.class)){
            //remove a mosca tocada
            removeTouching(Mosca.class);
            //adicionando uma nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getWidth());
            getWorld().addObject(new Mosca(), pX, pY);
        }
    }
    }

