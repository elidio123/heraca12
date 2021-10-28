public class Teste{

    public static void main(String args[]){
        //criando o objeto empregado
        Empregado empregado=new Empregado();

        empregado.setCodigoSetor(1);
        empregado.setSalarioBase(1000);
        empregado.setImposto(100);
        empregado.setNome("Rosa - Luan - Eric - Samuel - Dabrielas - Felipes");
        empregado.setEndereco("Marilia - Pompeia - Oriente - Tupa");
        empregado.setTelefone("todos os telefones da area 14");

        //nota-se os métodos setNome, setEndereco, setTelefone são herdados da classe pessoa

        //iremos apresentar o salario liquido
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.calcularSalario());

    }
}