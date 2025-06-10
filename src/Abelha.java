public class Abelha extends Personagem {
    @Override
    public void mover() {
        System.out.println("Movendo....Energia: "+energia);
        energia -= 1;
    }
    @Override
    public void fazerSom() {
        System.out.println("fazendo som: Bzzzz!");
    }
    @Override
    public void comer() {
        energia += 1;
    }
}
