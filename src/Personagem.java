public abstract class Personagem {
    protected int energia;
    protected String nome;

    public abstract void mover();
    public abstract void fazerSom();
    public abstract void comer();

    
    public Personagem(){
        super();
     }
     public Personagem(int energia,String nome) {
        this.energia = energia;
        this.nome = nome;
      }
    void dormir(){
        energia += 10;
        System.out.println("Dormindo..... Energia: "+energia);
    }
    void cansado(){
        if(energia < 5){
            System.out.println("Animal esta cansado!");
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
