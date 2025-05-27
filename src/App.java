public class App {
    public static void main(String[] args) throws Exception {
        Exercicio ex1 = new Exercicio();
        ex1.nome = "kiko";
        ex1.descricao = "Exercício de aquecimento, imitar o kiko oscilando e a lingua vibrando";
        ex1.tempoMin = 3;
        ex1.som ="sons/kiko.mp3";

        Exercicio ex2 = new Exercicio();
        ex2.nome = "Vibração dos Lábios";
        ex2.descricao = "Feche os lábios e, em seguida, núcleos emita um som vibrando os lábios";
        ex2.tempoMin = 1;
        ex2.som = "sons/kiko.mp3";
        ex2.exemplo = "Som de vibração, semelhante a uma abelha, bbbrrrrr";

        Exercicio ex3 = new Exercicio();
        ex3.nome = "Exercício do Lápis";
        ex3.descricao = "Esses exercícios contribuem para o fortalecimento da musculatura da fala e qualidades vocais. É importante respeitar os limites vocais e fazer os exercícios de forma relaxada para evitar tensões.";
        ex3.exemplo = "Inspire pelo nariz e articule os fonemas “i” e “u” até esgotar o fôlego. Repita o exercício para os fonemas “i” e “o” e intercale os dois.";
        ex3.tempoMin = 5;
        ex3.som = "sons/kiko.mp3";

        Exercicio ex4 = new Exercicio();
        ex4.nome = "Articulação de Fonemas";
        ex4.descricao = "Inspire pelo nariz e articule os fonemas “i” e “u” até esgotar o fôlego";
        ex4.exemplo = "Use a fala para pronunciar claramente as palavras.";
        ex4.tempoMin = 3;
        ex4.som = "sons/kiko.mp3";


        Clinica clinica = new Clinica();
        clinica.cnpj = "102030504060";
        clinica.nome = "Manter vivo";

        Clinica clinica2 = new Clinica();
        clinica2.cnpj = "2015151";
        clinica2.nome = "Não morra";

        Paciente paciente = new Paciente();
        paciente.email = "gg@gmail.com";
        paciente.nome = "GOOD GOOD";
        
        Paciente paciente1 = new Paciente();
        paciente1.email = "g2g@gmail.com";
        paciente1.nome = " GOOD";

        Paciente paciente2 = new Paciente();
        paciente2.email = "gg3@gmail.com";
        paciente2.nome = "GOOD2";

    }
}
