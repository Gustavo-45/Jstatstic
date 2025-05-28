public class Paciente {
    int id;
    private String nome;
    private String email;
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public Paciente(String nome, String email){
        this.email = email;
        this.nome = nome;
    }
}
