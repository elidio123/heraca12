pubic class Pessoa{
    private String nome;
    private String telefone;
    private String endereço;
//fazer os métodos de acesso público
//set
pubic void setNome(String){
    this.nome=nome;
}
//get
pubic String getNome(){
    return this.nome;
}
//set
pubic void setTelefone(String){
    this.telefone=telefone;
}
//get
pubic String getTelefone(){
    return this.telefone;
}
//set
pubic void setEndereco(String){
  this.endereco=endereco;  
}
//get
pubic String getEndereco(){
   return this.endereco; 
}
//construtor padrão tem o nome da classe e sem os parámetros
public Pessoa(){

}
//construtor com um parámetro
pubic Pessoa(String nome){
    this.nome-nome;
}
//construtor com dois parámetros
pubic Pessoa(String nome, String telefone){
    this.nome=nome;
    this.telefone=telefone;
}
}
