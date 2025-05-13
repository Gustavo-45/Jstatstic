public class Jardim {
    private Double largura;
    private Double comprimento;

    public Jardim(Double largura,Double comprimento){
        this.comprimento = comprimento;
        this.largura = largura;

    }

    public Double calcularArea(){
        return largura * comprimento;
    }
    public void setComprimento(Double comprimento){
        this.comprimento = comprimento;
    }
    public Double getCompreimento(){
        return comprimento;
    }
    public void setLargura(Double largura){
        this.largura = largura;
    }
    public Double getLargura(){
        return largura;
    }


}
