public class Empregado extends Pessoa{
    //codigoSetor (inteiro), salarioBase (vencimento base) e imposto
    //(porcentagem retida dos impostos).

    private int codigoSetor;
    private double salarioBase;
    private double imposto;
  
    //metodo de alteração
    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor=codigoSetor;
    }
    //metodo de consulta
    public int getCodigoSetor(){
        return this.codigoSetor;
    }
    //metodo de alteração
    public void setSalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
    }
    //metodo de consulta
    public double getSalarioBase(){
        return this.salarioBase;
    }
    //metodo de alteração
    public void setImposto(double imposto){
        this.imposto=imposto;
    }
    //metodo de consulta
    public double getImposto(){
        return this.imposto;
    }
    public double calcularSalario(){
        double salarioLiquido=0;

        salarioLiquido=this.salarioBase-this.imposto;
        //iremos fazer o calculo do salario liquido

        return salarioLiquido;
    }
}