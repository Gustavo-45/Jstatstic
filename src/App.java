import br.com.jkalango.view.JSplash;

public class App {
    public static void main(String[] args) throws Exception {
        
        Formiga f = new Formiga(10,"Formiga");
        new JSplash();
        System.out.println("----------Formiga----------");
        for (int i = 0;i<3;i++){ 
            f.mover();
        }
        f.cansado();
        f.fazerSom();
        f.dormir();
        f.comer();
        f.atacar();
        System.out.println("Energia Final da "+f.getNome() + ": "+f.getEnergia()+"\n");

        Abelha a = new Abelha(5,"Abelha");
        System.out.println("----------Abelha----------");
        for (int i = 0;i<3;i++){ 
            a.mover();
        }
        a.cansado();
        a.fazerSom();
        a.dormir();
        a.comer();
        a.atacar();
        System.out.println("Energia Final da "+a.getNome() + ": "+a.getEnergia()+"\n");

        Kalango k = new Kalango(10,"kalango");
        System.out.println("----------Kalango----------");
        for (int i = 0;i<3;i++){ 
            k.mover();
        }
        k.cansado();
        k.fazerSom();
        k.dormir();
        k.comer();
        k.atacar();
        System.out.println("Energia Final da "+k.getNome() +": "+k.getEnergia()+"\n");
    }
}
