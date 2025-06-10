public class App {
    public static void main(String[] args) throws Exception {
        
        Formiga f = new Formiga();
        System.out.println("----------Formiga----------");
        f.energia = 10;
        f.nome = "Formiga trabalhadora";
        for (int i = 0;i<3;i++){ 
            f.mover();
        }
        f.cansado();
        f.fazerSom();
        f.dormir();
        System.out.println("Energia Final da "+f.nome + ": "+f.energia+"\n");

        Abelha a = new Abelha();
        System.out.println("----------Abelha----------");
        a.energia = 5;
        a.nome ="Abelha";
        for (int i = 0;i<3;i++){ 
            a.mover();
        }
        a.cansado();
        a.fazerSom();
        a.dormir();
        System.out.println("Energia Final da "+a.nome + ": "+a.energia+"\n");

        Kalango k = new Kalango();
        System.out.println("----------Kalango----------");
        k.energia = 10;
        k.nome ="kalango";
        for (int i = 0;i<3;i++){ 
            k.mover();
        }
        k.cansado();
        k.fazerSom();
        k.dormir();
        System.out.println("Energia Final da "+k.nome +": "+k.energia+"\n");
    }
}
