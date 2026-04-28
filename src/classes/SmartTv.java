package classes;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void mudarCanal(int novoCanal){
        if(novoCanal < 1){
            System.out.println("Canal não existe");
            return;
        }
        canal = novoCanal;
        System.out.println("Canal atual: "+canal);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        if((canal--) < 1){
            System.out.println("Canal 0 não existe, voltando para canal 1.");
        }
        else{
            canal--;
        }
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("O volume da TV foi aumentado, volume: "+volume);
    }

    public void abaixarVolume(){
        volume--;
        System.out.println("O volume da TV foi abaixado, volume: "+volume);
    }

    public void ligar(){
        ligada = true;
        System.out.println("A TV foi ligada");
    }

    public void desligar(){
        ligada = false;
    }
}

