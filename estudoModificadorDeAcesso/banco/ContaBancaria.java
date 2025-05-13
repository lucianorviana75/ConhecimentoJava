/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author ribei
 */
public class ContaBancaria {
   private Autenticador autenticador = new Autenticador();
   
    public void acessarConta(String senha){
        if(autenticador.autenticar(senha)){
            System.out.println("Acesso autorizado!");
        }else{
            System.out.println("Senha incorreta.");
        }
    }    
}
