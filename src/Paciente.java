public class Paciente {
    int id;
    private String nome;
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public Paciente(String nome,String email){
        this.email = email;
        this.nome = nome;
    }
    public Paciente(){
        
    }
}
