public abstract class Personagem {
    protected int energia;
    protected String nome;
    public abstract void mover();
    public abstract void fazerSom();
    public abstract void comer();
    void dormir(){
        energia += 10;
        System.out.println("Dormindo..... Energia: "+energia);
    }
    void cansado(){
        if(energia < 5){
            System.out.println("Animal esta cansado!");
        }
    }
}
