import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe mosca destinada a fzer parte do jogo BeeWorld.
 * 
 * @author Vinicius de Oliveira 
 * @version 2024-04-20
 */
public class Mosca extends Inseto
{
    //Campos e fields
    private int velocidade;
    //Constructor padrão (não recebe parametros)
    public Mosca(){
        velocidade = 1;
    }
    //Constructor personalizado como sobrecarga de método
    public Mosca(int vel, int ang){
        velocidade = vel;
        setRotation(ang); //colocamos no angulo que eu passar
    }
    /**
     * Metodo Act é executado sempre que apertarmos o botão Act ou ficara em
     * execução quando apertarmos o botão Run.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        verificarCanto();
        }
        
    }
