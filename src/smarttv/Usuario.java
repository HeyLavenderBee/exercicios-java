package smarttv;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        Scanner scan = new Scanner(System.in);

        System.out.println("A TV está: "+(smartTv.ligada ? "ligada" : "desligada"));
        System.out.println("Você deseja ligar a TV? (s/n): ");
        String resposta = scan.nextLine();
        if("s".equals(resposta)){
            smartTv.ligar();
        }
        else{
            System.out.println("A TV continua desligada");
        }

        while(!"sair".equals(resposta)){
            System.out.println("Digite sua próxima ação");
            System.out.println("c - mudar canal;\n v+ - aumentar volume\n v+ - aumentar volume\n v- - abaixar volume\n s - sair): ");
            resposta = scan.nextLine();
            if("c".equals(resposta)){
                System.out.println("Escolha o canal para mudar: ");
                smartTv.mudarCanal(Integer.parseInt(scan.nextLine()));
            }
            else if("v+".equals(resposta)){
                smartTv.aumentarVolume();
            }
            else if("v-".equals(resposta)){
                smartTv.abaixarVolume();
            }
        }
    }
}
