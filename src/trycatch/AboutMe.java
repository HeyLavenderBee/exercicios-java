package trycatch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args){
        try {
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu nome");
            String nome = scan.nextLine();
            System.out.println("Digite seu sobrenome");
            String sobrenome = scan.nextLine();
            System.out.println("Digite sua idade");
            int idade = scan.nextInt();
            System.out.println("Digite sua altura");
            double altura = scan.nextDouble();

            System.out.println("Seu nome completo: "+nome+" "+sobrenome+". Sua idade: "+idade+". Sua altura: "+altura);
            scan.close();
        } 
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}
