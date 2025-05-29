public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------Exercicios---------------------");
        //POR MEIO DE CONSTRUTOR
        Exercicio ex1 = new Exercicio("kiko","Exercício de aquecimento, imitar o kiko oscilando e a lingua vibrando","sons do kiko chorando","/",3);
        System.out.println("Nome do exercicio: "+ex1.getNome()+"\ndescrição: "+ex1.getDescricao()+"\nexemplo: "+ex1.getExemplo()+"\nTempo mininimo: "+ex1.getTempoMin());
        //POR MEIO DO METODO SET
        Exercicio ex2 = new Exercicio();
        ex2.setNome("Soprar bolinha");
        ex2.setTempoMin(4);
        ex2.setExemplo("Assopre");
        ex2.setDescricao("Por meio de um canudo assopre em uma garrafa contendo uma bolinha de algodao");
        System.out.println("Nome do exercicio: "+ex2.getNome()+"\ndescrição: "+ex2.getDescricao()+"\nexemplo: "+ex2.getExemplo()+"\nTempo mininimo: "+ex2.getTempoMin());

        System.out.println("\n--------------------Clinicas---------------------");
        //POR MEIO DE CONSTRUTOR
        Clinica clinica = new Clinica("Manter vivo","12351511");
        System.out.println("Nome da clinica: "+clinica.getNome()+"\nCnpj: "+clinica.getCnpj());
        //POR MEIO DO METODO SET
        Clinica clinica2 = new Clinica();
        clinica2.setCnpj("20212151");
        clinica2.setNome("Não morra");
        System.out.println("Nome da clinica: "+clinica2.getNome()+"\nCnpj: "+clinica2.getCnpj());

        System.out.println("\n--------------------Pacientes---------------------");
        //POR MEIO DE CONSTRUTOR
        Paciente paciente = new Paciente("g@gmail.com","GOOD");
        System.out.println("Nome do paciente: "+paciente.getNome()+"\nE-mail: "+paciente.getEmail());
        //POR MEIO DO METODO SET
        Paciente paciente2 = new Paciente();
        paciente2.setNome("GOOD GOOD");
        paciente2.setEmail("gg@gmail.com");
        System.out.println("Nome do paciente: "+paciente2.getNome()+"\nE-mail: "+paciente2.getEmail());

        System.out.println("\n--------------------Profissionais---------------------");
        //POR MEIO DE CONSTRUTOR
        Profissional prof = new Profissional("Gustavo","61998568402");
        System.out.println("Profissional: "+prof.getNome()+"\nTelefone: "+prof.getTelefone());
        //POR MEIO DO METODO SET
        Profissional prof2 = new Profissional();
        prof2.setNome("Guilherme");
        prof2.setTelefone("61998546032");
        System.out.println("Profissional: "+prof2.getNome()+"\nTelefone: "+prof2.getTelefone());
    }
}
