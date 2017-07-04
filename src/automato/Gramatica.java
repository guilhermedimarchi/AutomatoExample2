/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automato;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Guilherme
 */
public class Gramatica {
    
    public void ex1(String entrada)
    {

       //correcao: (bbb*ab*ab*)|(babb*ab*)|(baabb*)|(ababb*)|(aabbb*)|(abbb*ab*)
        String padrao = "(a{2}b{2,}){0,1}(b{2,}a{2}){0,1}(b{1,}a{1}b{1,}a{1}b{0,}){0,1}(b{0,}a{1}b{1,}a{1}b{1,}){0,1}(a{1}b{2,}a{1}){0,1}";


         Pattern pattern = Pattern.compile(padrao);
         Matcher matcher = pattern.matcher(entrada);

         if(matcher.matches())
         {
             System.out.println("Deu match");
         }
         else
         {
             System.out.println("Nao deu match");
         }

    }
    
    public void ex2(String entrada)
    {
        String padrao = "[01]{0,}0";
        //correcao: [01]*0
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(entrada);

        if(matcher.matches())
        {
            System.out.println("Deu match");
        }
        else
        {
            System.out.println("Nao deu match");
        }
    }
    
    public void ex3(String entrada)
    {
        String padrao = "0(\\d{2})(\\s)(\\d{4,5})-(\\d{4})";
        //correcao: 
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(entrada);

        if(matcher.matches())
        {
            System.out.println("Deu match");
        }
        else
        {
            System.out.println("Nao deu match");
        }
    }
    
    public void ex4(String entrada)
    {
        //  12a3:1f31:1233:1221:1233:1231:1231:12a4
        String padrao = "(([\\da-f]{4}):){7}([\\da-f]{4})";
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(entrada);
        String[] group;
        
        if(matcher.matches())
        {
                pattern = Pattern.compile(":");
                group = pattern.split(entrada);
                for(String s : group)
                {
                    System.out.println(s);
                }
        }
        else
            System.out.println("Nao deu match");

    }
    public void ex5(String entrada)
    {
        //String padrao = "[\\D2-9]{0,}([01]{0,}0{1,})";
        String padrao = "[[01]{0,}1]";
        Pattern pattern = Pattern.compile(padrao);
        
        Matcher matcher = pattern.matcher(entrada);
        
        
        while(matcher.find())
        {
            System.out.println(matcher.group());
        }
        
        

    }
    
    
}
