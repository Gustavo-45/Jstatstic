public class Clinica {
    int id;
    private String cnpj;
    private String nome;
    public String getCnpj() {
        return cnpj;
    }
    public String getNome() {
        return nome;
    }
    public Clinica(String nome, String cnpj){
        this.cnpj = cnpj;
        this.nome = nome;
    }
}
