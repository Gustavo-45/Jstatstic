public class Abelha extends Personagem implements IArmamento {
    @Override
    public void mover() {
        energia -= 1;
        System.out.println("Movendo....Energia: "+energia);
        
    }
    @Override
    public void fazerSom() {
        System.out.println("fazendo som: Bzzzz!");
    }
    @Override
    public void comer() {
        energia += 1;
        System.out.println("Comendo... Energia: "+energia);
    }
    @Override
    public void atacar() {
        System.out.println("Ataca de uma forma");
    }
    public Abelha(){
        super();
    }
    public Abelha(int energia,String nome){
        super(energia,nome);
        super.getEnergia();
        super.getNome();
    }
}
