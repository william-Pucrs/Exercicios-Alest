public class App{

    public static void main(String[] args) {
        
        potencia(2,4);
        int array[] = {1,2,3,4};

        int total = somaVetorRecursivo (array, 0);

        System.out.println("deu isso" + total );
    }
    
    
    public static int potencia(int potencia,int num){
        int resultado =0;
        int notação = 0;
        for(int i =0; i < potencia; i++){
            resultado = num *= potencia;
            System.out.println(resultado);
            System.out.println("Num operação: " + notação++);
        }
        return resultado;
    }

 public int recursaoPotencia(int base, int expoente){
        
        if(expoente == 0){
            return base;
        }
        else if( base == 0){
            return -1;
        }

        return base*recursaoPotencia(base, expoente-1);
    }

    public static int somaVetorRecursivo(int array[], int posição){

        if( posição == array.length){
            return 0;
        }else
        return array[posição] + somaVetorRecursivo (array, posição+1);
    }

    // desafio, fazer um que inverte um vetor

    ////////////////////////////////// ORDENAÇÃO //////////////////////////////////////////
   
    public static int QuickSort(int vetor[]){
        
        int pivo = vetor.length-1;

        return 0;
    }
}

