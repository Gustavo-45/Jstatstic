public class Kalango extends Personagem implements IArmamento{
    @Override
    public void mover() {
        energia -= 3;
        System.out.println("Movendo....Energia: "+energia);
        
    }
    @Override
    public void fazerSom() {
        System.out.println("Fazendo som: Tsssss!");
    }
    @Override
    public void comer() {
        energia += 3;
        System.out.println("Comendo... Energia: "+energia);
    }
    @Override
    public void atacar() {
        System.out.println("Ataca de três formas");
    }
    public Kalango(){
        super();
    }
    public Kalango(int energia, String nome){
        super(energia,nome);
        super.getNome();
        super.getEnergia();
    }
}
