public class Servico {
    private String nome;
    private double precoPorMetroQuadrado;

    public Servico(String nome, double precoPorMetroQuadrado) {
        this.nome = nome;
        this.precoPorMetroQuadrado = precoPorMetroQuadrado;
    }

    public double aplicarDesconto(double areaTotal, double percentualDesconto) {
        double precoBruto = precoPorMetroQuadrado * areaTotal;
        double valorDesconto = precoBruto * (percentualDesconto / 100);
        return precoBruto - valorDesconto;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoPorMetroQuadrado() {
        return precoPorMetroQuadrado;
    }
}
