public class Exercicio {
    private int id;
    private String nome;
    private String descricao;
    private String som;
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void setTempoMin(int tempoMin) {
        this.tempoMin = tempoMin;
    }

    public void setExemplo(String exemplo) {
        this.exemplo = exemplo;
    }

    private int tempoMin;

    public String getDescricao() {
        return descricao;
    }

    public String getSom() {
        return som;
    }

    public int getTempoMin() {
        return tempoMin;
    }

    public String getExemplo() {
        return exemplo;
    }

    private String exemplo;

    public String getNome() {
        return nome;
    }

    public Exercicio(){
        
    }

    public Exercicio(String nome, String descricao, String exemplo){
        this.nome = nome;
        this.descricao = descricao;
        this.exemplo = exemplo;
    }
    public Exercicio(String nome, String descricao, String exemplo, String som, int tempoMin){
        this.nome = nome;
        this.descricao = descricao;
        this.exemplo = exemplo;
        this.tempoMin = tempoMin;
        this.som = som;
    }
}
