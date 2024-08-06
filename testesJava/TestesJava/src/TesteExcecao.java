import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TesteExcecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //forma de usar try catch
        try {
            //  bloco de código conforme esperado
          }
          catch(Exception e) {// precisamos saber qual exceção
            // bloco de código que captura as exceções que podem acontecer
            // em caso de um fluxo não previsto
          }
        try{
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();
            

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }
        catch(InputMismatchException e){
            System.err.println("Os campos de idade e altura precisam ser numéricos");

        }
        Number valor = Double.valueOf("a1.75");

        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        System.out.println(valor);
       
    
    }
}
