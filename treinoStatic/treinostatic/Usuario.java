/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinostatic;

/**
 *
 * @author ribei
 */
public class Usuario {
    static int usuariosConectados =0;
    String nome;
    
    public Usuario(){
        usuariosConectados++;
    }
    public String usuarioNome(String nome){
        return nome;
    }
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        Usuario usuario3 = new Usuario();
        
        new Usuario();
        new Usuario();
        new Usuario();
        
        
        System.out.println("Usarios conectados "+ usuariosConectados);
        System.out.println("Usuario conectado : "+ usuario1.usuarioNome("Luciano"));
        System.out.println("Usuario conectado : "+ usuario2.usuarioNome("Tatiane"));
        System.out.println("Usuario conectado : "+ usuario3.usuarioNome("Gabriel"));
    }
}
