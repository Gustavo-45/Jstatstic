import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
      //Classe é um conjunto de objetos  
        Mamiferos m1 = new Mamiferos();
        m1.setNomeCientifico("Bos Tauros");
        JOptionPane.showMessageDialog(null, "Nome cientifico: "+m1.getNomeCientifico(), "VACA", 1);

        Mamiferos m2 = new Mamiferos();
        m2.setNomeCientifico("Macrofilos");
        JOptionPane.showMessageDialog(null, "Nome cientifico: "+m2.getNomeCientifico(), "CANGURU", 1);

        Mamiferos m3 = new Mamiferos();
        m3.setNomeCientifico("Trichichus");
        JOptionPane.showMessageDialog(null, "Nome cientifico: "+m3.getNomeCientifico(), "PEIXE BOI", 1);

    }
}
