/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SERVER
 */
public class Conta {
    private int numero;
    private double saldo;
    private String nome;
    String cpf;
    private String sexo;
    private double limite;
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int Numero){
        numero = Numero;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String Nome){
        nome = Nome;
    }
    public String getcpf(){
        return cpf;
    }    
    public void setcpf(String Cpf){
        cpf = Cpf;
    } 
    public String getSexo(){
    return sexo;
}
public void setSexo(String s){
    sexo = s;
}
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double Saldo){
        saldo = Saldo;
    }
    public double getLimite(){
        return limite;
    }
    public void setLimite(double Limite){
        limite = Limite;
    }
    boolean sacar(double quantidade){
        if(saldo<quantidade)
            return false;
        else{
            saldo = saldo - quantidade;
            return true;
        }
    }
    
    void depositar(double quantidade){
        saldo = saldo + quantidade;
    }
    
    void inserirDados(String a, int b, float c, float l){
        nome = a;
        numero = b;
        saldo = c;
        limite = 1;
    }
    
    
    public void saca(double valorSacar) {
    saldo -= valorSacar;
}

public void deposita(double valorDepositar) {
    saldo += valorDepositar;
}
    
}
