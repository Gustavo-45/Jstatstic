public class Profissional {
     private int id;
     private String nome;
     private String telefone;

    
     public void setTelefone(String telefone){
          this.telefone = telefone;
     }
     public void setNome(String nome){
          this.nome = nome;
     }
     public String getNome(){
          return nome;
     }
     public String getTelefone(){
          return telefone;
     }
     public int getId() {
          return id;
     }
     public Profissional(){
          
     }
     public Profissional(String nome,String telefone){
          this.telefone = telefone;
          this.nome = nome;
     }
}
