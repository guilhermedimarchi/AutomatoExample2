/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automato;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Automato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Gramatica g = new Gramatica();
      
      String entrada = JOptionPane.showInputDialog("Entrada: ");
      int op = Integer.parseInt(JOptionPane.showInputDialog("Exercicio(1 - 5): "));
        
        
      switch(op)
      {
          case 1:
              g.ex1(entrada);
              break;
          case 2:
              g.ex2(entrada);
              break;
          case 3:
              g.ex3(entrada);
              break;
          case 4:
              g.ex4(entrada);
              break;
          default:
              g.ex5(entrada);
              break;
      }
      
      
    }
               
 
}

