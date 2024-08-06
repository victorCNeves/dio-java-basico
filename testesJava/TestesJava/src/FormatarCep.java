public class FormatarCep {
    public static void main(String[] args) {
        try {
            String cep = formatarCep("23765061");
            System.err.println(cep);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
