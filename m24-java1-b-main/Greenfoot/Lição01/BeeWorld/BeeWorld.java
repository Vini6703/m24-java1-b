import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da abelha no jogo.
 * 
 * @author Vinicius de Oliveira 
 * @version 2024-04-20
 */
public class BeeWorld extends World
{
    //Campos e fields
    private Abelha abelha = null;
    
    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Criar abelha
        abelha = new Abelha();
        addObject(abelha,48,55);
        //Criar aranha
        Aranha aranha = new Aranha();
        addObject(aranha,513,273);
        //Utilizando o For para criar as moscas.
        for (int i=0; i<20; i++){
            int pX = Greenfoot.getRandomNumber(getWidth());
            int pY = Greenfoot.getRandomNumber(getWidth());
            int vel = Greenfoot.getRandomNumber(5)+1;
            int ang = Greenfoot.getRandomNumber(360);
            //Adicionando no mundo e criando a mosca ao mesmo tempo
            addObject(new Mosca(vel,ang), pX, pY);
        }
    }
    /**
     * Getter para obter a instancia da abelha criada no mundo.
     */
    public Abelha getAbelha(){
        return abelha;
    }
}
