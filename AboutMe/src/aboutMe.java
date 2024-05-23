import java.util.Locale;
import java.util.Scanner;

public class aboutMe {

    public static void main(String[] args) {
        try{
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário

        System.out.println("Olá, me chamo "  +  nome.toUpperCase(null) + " "  +  sobrenome);
        System.out.println("Tenho"  + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        }
        
        catch(java.util.InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos e com pontos");
        }
        
    




        
    }
}