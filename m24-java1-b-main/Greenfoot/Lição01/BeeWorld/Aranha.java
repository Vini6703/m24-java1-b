import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aranha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aranha extends Inseto
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
        verificarCanto();
        acelerarAranha();
        //captura a mosca se estiver no alcance
        capturaMosca();
        //Interceptando a abelha
        interceptarAbelha();
    }
    /**
     * Método que irá acelerar a aranha em determinada area do tabuleiro
     */
    public void acelerarAranha(){
       if (getX()>=200 && getX()<=600 && getY()>=100 && getY()<=500){
           move(2);
       }
    }
    /**
     * Metodo que captura a mosca pela aranha
     */
    public void capturaMosca(){
            if (isTouching(Mosca.class)){
            //Remove a mosca tocada
            removeTouching(Mosca.class);
            //adicionando uma nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getWidth());
            getWorld().addObject(new Mosca(), pX, pY);
        }
    }

    public void interceptarAbelha(){
                    //Cast de BeeWorld, força o mundo a ser do tipo beeworld
        Abelha ab = ((BeeWorld) getWorld()).getAbelha();
        if (ab!=null){
            turnTowards(ab.getX(), ab.getY()); //persseguir abelha
        }
    }
}
