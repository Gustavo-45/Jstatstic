public class Formiga extends Personagem implements IArmamento{
    @Override
    public void mover(){
        energia -= 2;
        System.out.println("Movendo....Energia: "+energia);     
        
    }
    @Override
    public void fazerSom() {
        System.out.println("Fazendo som: Fzzzz!");
    }
    @Override
    public void comer() {
        energia += 2;
        System.out.println("Comendo... Energia: "+energia);
    }
    @Override
    public void atacar() {
     System.out.println("Ataca de duas formas");
    }
    public Formiga(){
        super();
    }
    public Formiga(int energia,String nome){
        super(energia,nome);
        super.getEnergia();
        super.getNome();
    }
}
