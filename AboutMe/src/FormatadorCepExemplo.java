public class FormatadorCepExemplo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String cepFormatado;
        try {
            cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O cep não corresponde as regras de negócio");
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if ( cep.length()  != 8) 
        throw new CepInvalidoException();

        // simulando um cep formatado

        return "23.765.064";
                    
        }
    }
    

