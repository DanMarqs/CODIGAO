/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SERVER
 */
public class demissão {
    public static void main(String[]  args){
       Funcionario funcionario;
       
       funcionario = new Funcionario ();
       funcionario.setSalario(1200);
       funcionario.setNome("Daniel");
       funcionario.setSexo("masculino");
       funcionario.setdepartamento("ifms");
       funcionario.setdataDeEntrada("06/02/2020");
       funcionario.setcpf("123.456.789=10");
       funcionario.setrg("1.234.567");
       funcionario.setestaNaEmpresa(true);
       funcionario.demite(true);
       
       System.out.print(funcionario.demite(true));
       
   
        
    }
}
