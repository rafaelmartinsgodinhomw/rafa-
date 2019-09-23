/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.pkg07;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Solicite ao usuario que informe o Nome de um aluno e suas tres notas 
        (de 0 a 10), e calcule a media e teste as condicoes:
        1) se a media for menor ou igual a 5.0 (Reprovado) 
        2) se a media for menor ou igual a 7.0 (Aprovado)
        3) se a media for menor ou igual a 9.0 (Muito bom!)
        4) se a media for menor ou igual a 10.0 (Execelente)
         */
          String nome = "Anderson";
        Scanner entrada = new Scanner(System.in);
        
        double n1, n2, n3, med;
        System.out.println("Digite a primeira nota");
        n1 = entrada.nextFloat();
          System.out.println("Digite a segunda nota");
        n2 = entrada.nextFloat();
          System.out.println("Digite a terceira nota");
        n3 = entrada.nextFloat();
        med = ((n1+n2+n3)/3);
        System.out.println("A media e: " + med);
        if (med <= 5)
        {
            System.out.println("Aluno reprovado");
        }
        else
        {
            if (med <= 7)
            {
            System.out.println("Aprovado");
             }
            else 
            {
            if (med <= 9)
            {
            System.out.println("Muito bom!");
             }
            else
            {
            if (med <= 10)
            {
            System.out.println("Execelente");
             }
                 
            }
            }
}
    }
        
