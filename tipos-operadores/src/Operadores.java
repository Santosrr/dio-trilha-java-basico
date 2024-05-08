import java.sql.Date;

public class Operadores {
    public static void main(String[] args) { 
        boolean condicao1 = true;
        boolean condicao2 = true;
        if(condicao1 &&     (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");

        } 
        if(condicao1 || condicao2) {
            System.out.println("Uma da condições é verdadeiras");
           
            System.out.println("fim");        
        // calsse Operadores.java
       // String nome = "Renato";
        //int idade = 45;
        //double peso = 60.8;
        //char sexo = 'M';
        //boolean doadorOrgao = false;
        //Date dataNascimento = new Date.of(2020, 05, 20);

        // operadores aritméticos + - * /
        // Classes de operadores
        //double soma = 10.5 + 15.7;
        //int subtração = 113 - 25;
        //int multiplicacao = 20 * 7;
        //int divisao = 15 / 3;
        //int modulo = 18 % 3;
        //double resultado = (10 * 7) + (20 / 4);

        // concatenação de textos
        // classe Operadora.java

        //String concatenacao = "?";
        //System.out.println(concatenacao);
  
        //concatenacao = 1+1+1+"1";
        //System.out.println(concatenacao);

        //concatenacao = 1+"1"+1+1;
        //System.out.println(concatenacao);

        //concatenacao = 1+"1"+1+"1";
        //System.out.println(concatenacao);

        //concatenacao = "1"+1+1+1;
        //System.out.println(concatenacao);

        //concatenacao = "1"+(1+1+1);
        //System.out.println(concatenacao);

        //int numero = 5;
        //numero = - numero ;
        
        //System.out.println(numero);

        //numero =  numero * -1;

        //System.out.println(numero);

        // repetição

        //int numero = 5;

        
        //System.out.println(numero --);

        //System.out.println(numero);

        //boolean variavel = true;

        //variavel = !variavel;

        //System.out.println(variavel);

        // Exemplo de condicional utilizando uma estrutura IF/ELSE
        // if (a==b)
        // resultado = "verdadeiro";
        // else
        // resultado = "falso";
    
        //int a, b;

        //a=6;
        //b=6;
        //String resultado = a==b ?"1" : "2";


        String nomeUm = "Renato";
        String nomeDois = new String("Renato");

        System.out.println(nomeUm.equals (nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        if (numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }
        
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor que numeroDois? " + simNao);









            }
        }}
