public class ProbabilidadeServicos {

    public static double calcularFrequenciaRelativa(double quantidadeServico, double totalServicos) {
        if (totalServicos == 0) return 0.0;
        return quantidadeServico / totalServicos;
    }

    public static String gerarRelatorioFrequencia(
        double s1, double s2, double s3, double s4, double s5
    ) {
        double total = s1 + s2 + s3 + s4 + s5;
    
        double p1 = calcularFrequenciaRelativa(s1, total) * 100;
        double p2 = calcularFrequenciaRelativa(s2, total) * 100;
        double p3 = calcularFrequenciaRelativa(s3, total) * 100;
        double p4 = calcularFrequenciaRelativa(s4, total) * 100;
        double p5 = calcularFrequenciaRelativa(s5, total) * 100;
    
        String relatorio = "Probabilidades de escolha dos serviços:\n";
        relatorio += "1 - Plantio: " + Math.round(p1 * 100.0) / 100.0 + "%\n";
        relatorio += "2 - Poda: " + Math.round(p2 * 100.0) / 100.0 + "%\n";
        relatorio += "3 - Controle de pragas: " + Math.round(p3 * 100.0) / 100.0 + "%\n";
        relatorio += "4 - Adubação: " + Math.round(p4 * 100.0) / 100.0 + "%\n";
        relatorio += "5 - Irrigação: " + Math.round(p5 * 100.0) / 100.0 + "%\n";
    
        return relatorio;
    }
    
}
