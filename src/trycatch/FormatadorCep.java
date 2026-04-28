package trycatch;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");
            System.out.println("Cep Formatado!");
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde ao formato de 8 caracteres");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return "23.765-064";
    }
}
