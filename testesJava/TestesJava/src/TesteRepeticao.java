public class TesteRepeticao {
    public static void main(String[] args) {
        /*String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

        int numeros [] = {1,2,3,4,5,6,7,8};
        
            //Forma abreviada
        for(String aluno : alunos) {
          System.out.println(aluno);
        }

        for(int n : numeros){
            System.out.println(n);
        }*/

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
            
        }

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
            
        }
    }
}
