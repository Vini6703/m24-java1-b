import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada no jogo BeeWorld.
 * 
 * @author Vinicius de Oliveira 
 * @version 2024-04-20
 */
public class Abelha extends Actor
{
    //Constantes
    public static final int PONTOS = 100;
    //Campos ou Fields
    public int vidas = 0;
    public int score = 0;
    //Criando campo do tipo conjunto de imagens
    private GreenfootImage[] imagens;
    //Consructors
    public Abelha(){
        vidas = 3;
        score = 0;
        //Definir o tamanho do conjunto de imagens
        imagens = new GreenfootImage[4]; //definindo o tamanho do conjunto em 4 elementos
        //Definir as imagens
        for (int i=0;i<4;i++){
            imagens[i] = new GreenfootImage("bee0"+(i+1)+".png");
        }
    }
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
        //Verifica se foi capturada pela aranha
        capturadaPelaAranha();
        //Mostrando contagem de vidas da abelha
        mostrarVidas();
        //Mostrando score
        mostrarScore();
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
            //Aumentar score
            score += PONTOS; // score + score + pontos
            //Tocar audio ao ser capturado
            Greenfoot.playSound("outch.wav");
            //adicionando uma nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getWidth());
            getWorld().addObject(new Mosca(Greenfoot.getRandomNumber(5)+1, Greenfoot.getRandomNumber(360)), pX, pY);
        }
    }
    /**
     * Método que irá capturar a abelha pela aranha
     */
    public void capturadaPelaAranha(){
        if (isTouching(Aranha.class)){
            Greenfoot.playSound("slack.wav");
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getWidth());
            setLocation(pX, pY);
            vidas -= 1; //Diminui uma vida
            if (vidas<1) {
                Greenfoot.stop();
                getWorld().showText("GAMER OVER", 400, 300);
            }
        }
    }
    public void mostrarVidas(){
        getWorld().showText("Vidas: " + vidas, 60, 20);
    }
    
    public void mostrarScore(){
        getWorld().showText("Score: " + score, 700, 20);
    }
}

