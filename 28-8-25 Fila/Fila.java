public class Fila {


private int[] arranjo;
private int fimDaFila;
    
public Fila(){
    this.arranjo = new int[10];
}

public Fila(int capacidade){
    this.arranjo = new int[capacidade];
    this.fimDaFila = 0;

}
//: insere o elemento e no final da fila
public boolean enqueue(int e){

    if(fimDaFila >= arranjo.length){
        return false;
    }
    arranjo[fimDaFila] = e;
    fimDaFila++;
    return true;

}

// : remove e retorna o elemento e do início da fila, e dá erro se a fila estiver vazia
// o ultimo elemento da fila é o anterior ao fimDaFila
public int dequeue(){

    if( fimDaFila == 0){
        throw new RuntimeException("A fila esta vazia");
    }else{
        int elementoAserRetornado = arranjo[0];

        //processo de "passinho para frente
        for(int idx=0; idx < fimDaFila; idx++){
            arranjo[idx]=arranjo[idx+1];
            fimDaFila--;
        }
        return elementoAserRetornado;
    
    }
   
}

// : retorna, mas não remove, o primeiro elemento da fila, e dá erro se a fila estiver vazia

public int head(){

    if(fimDaFila == 0){
        throw new RuntimeException("A fila esta vazia");
    }else{
        return arranjo[0];
    }
}
//: retorna o número de elementos da fila
public  int size(){
    return fimDaFila;
}
//: retorna true se a fila estiver vazia, e false caso contrário
public boolean isEmpty(){

    return( fimDaFila == 0);
}

// : esvazia a fila
public void clear(){

    fimDaFila = 0;
}
}
