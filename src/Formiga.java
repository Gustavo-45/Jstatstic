public class Formiga extends Personagem{
    @Override
    public void mover(){
        System.out.println("Movendo....Energia: "+energia);     
           energia -= 2;
    }
    @Override
    public void fazerSom() {
        System.out.println("Fazendo som: Fzzzz!");
    }
    @Override
    public void comer() {
        energia += 2;
    }
}
