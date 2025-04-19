/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaBanco;
import java.util.Scanner;

/**
 *
 * @author RICARDO FERREIRA
 */
public class ContaCliente {
    Scanner entradaDeDados = new Scanner(System.in);
       
        int numero;
        String agencia ;
        String nomeCliente;
        double saldo;
    
    public void SolicitaDados(){
        System.out.print("Por favor, digite o número da Agência. ");
        agencia = entradaDeDados.nextLine();

        System.out.print("Digite o número da sua Conta. ");
        numero = Integer.parseInt(entradaDeDados.nextLine());

        System.out.print("Digite o nome do Cliente. ");
        nomeCliente = entradaDeDados.nextLine();
    
        System.out.print("Digite seu saldo inicial. ");
        saldo = Double.parseDouble(entradaDeDados.nextLine());
    }
   
    public void Descreve(){
        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de "+saldo+" já está disponível para saque.");
    }
   
    
}

