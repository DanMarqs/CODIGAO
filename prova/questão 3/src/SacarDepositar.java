/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SERVER
 */
public class SacarDepositar {
    public static void main(String[]  args){
    Conta conta;
    conta = new Conta();
    conta.setNome("Daniel");
    conta.setSaldo(900);
    conta.setNumero(1234);
    
    
    //sacar 200 Reais
    conta.saca(200);
    
    //Depositar 500 reais
    conta.deposita(400);
    
    System.out.println("Dono da Conta: " + conta.getNome());
    System.out.println("Numero da Conta: " + conta.getNumero());
    System.out.println("Seu saldo atual é de R$" + conta.getSaldo());
}
}