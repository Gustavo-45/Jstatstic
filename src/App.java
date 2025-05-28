public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------Exercicios---------------------");
        Exercicio ex1 = new Exercicio("kiko","Exercício de aquecimento, imitar o kiko oscilando e a lingua vibrando","sons do kiko chorando","/",3);
        System.out.println("Nome do exercicio: "+ex1.getNome()+"\ndescrição: "+ex1.getDescricao()+"\nexemplo: "+ex1.getExemplo()+"\nTempo mininimo: "+ex1.getTempoMin());

        System.out.println("\n--------------------Clinicas---------------------");
        Clinica clinica = new Clinica("Manter vivo","12351511");
        System.out.println("Nome da clinica: "+clinica.getNome()+"\nCnpj: "+clinica.getCnpj());

        Clinica clinica2 = new Clinica("Não morra","20212151");
        System.out.println("Nome da clinica: "+clinica2.getNome()+"\nCnpj: "+clinica2.getCnpj());

        System.out.println("\n--------------------Pacientes---------------------");
        Paciente paciente = new Paciente("GOOD","g@gmail.com");
        System.out.println("Nome do paciente: "+paciente.getNome()+"\nE-mail: "+paciente.getEmail());

        Paciente paciente2 = new Paciente("GOOD GOOD","gg@gmail.com");
        System.out.println("Nome do paciente: "+paciente2.getNome()+"\nE-mail: "+paciente2.getEmail());

    }
}
