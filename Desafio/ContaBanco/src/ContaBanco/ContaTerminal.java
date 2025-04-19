package ContaBanco;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RICARDO FERREIRA
 */

public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
    Scanner entradaDeDados = new Scanner(System.in);
    
    ContaCliente novaConta = new ContaCliente();
    
    novaConta.SolicitaDados();
    novaConta.Descreve();
       
    }
    
}
