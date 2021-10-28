//nome da classe
public class Pessoa{

 //atributos   
    private String nome;
    private String telefone;
    private String endereco;
//fazer os métodos de acesso público
//set
//metodo alteração
public void setNome(String nome){
    this.nome=nome;
}
//get
//método de consulta
public String getNome(){
    return this.nome;
}
//set
//metodo alteraçao
public void setTelefone(String telefone){
    this.telefone=telefone;
}
//get
//metodo consulta
public String getTelefone(){
    return this.telefone;
}
//set
//metodo alteraçao
public void setEndereco(String endereco){
   this.endereco=endereco;  
}
//get
//metodo consulta
public String getEndereco(){
   return this.endereco; 
}
//construtor padrão tem o nome da classe e sem os parámetros
public Pessoa(){

}
//construtor com um parámetro
public Pessoa(String nome){
    this.nome=nome;
}
//construtor com dois parámetros
public Pessoa(String nome, String telefone){
    this.nome=nome;
    this.telefone=telefone;
}
}
