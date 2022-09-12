/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SERVER
 */
public class Funcionario {
    //atributos
    private double salario;
	private String nome;
        private String sexo;
        private String departamento;
	String dataDeEntrada;             
        String cpf;
	String rg;
	private boolean estaNaEmpresa;
        String bonifica;
        String demite;

           

public double getSalario(){
return salario;
}
public void setSalario(double Salario){
salario = Salario;
}            
        
public String getNome(){
    return nome;
}
public void setNome(String n){
    nome = n;
}
public String getSexo(){
    return sexo;
}
public void setSexo(String s){
    sexo = s;
}
public String getdepartemento(){
    return departamento;
}
public void setdepartamento(String depart){
    departamento = depart;
}
public String getdataDeEntrada(){
    return dataDeEntrada;
}
public void setdataDeEntrada(String data){
    dataDeEntrada = data;
}
 public String getcpf(){
        return cpf;
    }    
    public void setcpf(String Cpf){
        cpf = Cpf;
    } 
     public String getrg(){
        return rg;
    }    
    public void setrg(String RG){
        rg = RG;
    }
public boolean getestaNaEmpresa(){
    return estaNaEmpresa;
}
public void setestaNaEmpresa(boolean EstaNaEmpresa){
    estaNaEmpresa = EstaNaEmpresa;
}
public void bonifica(double aumento){
    salario += aumento;
}
public boolean demite(boolean valor){
    if(valor){
        System.out.println("funcionario demitido");
    }else{
        System.out.println("funcionario ativo");
    }
    return valor;
}

}

