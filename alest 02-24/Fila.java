public class Fila {
    
    int fila [];
    int ultimo;
    
    public Fila() {
        this.fila = new int [10];
        this.ultimo = -1;
    }

    // insere no final da fila
    public void enqueue(int e) throws Exception{
            if( ultimo == fila.length -1){
                throw new Exception("Limite Atingido, a fila esta cheia");
            }
            ultimo++;
            fila[ultimo] = e;
    }

    // retorna e remove o elemento E do inicio e da erro se tiver vazio
    public int dequeue() throws Exception{
        if (ultimo == -1) {
            throw new Exception("A fila esta vazia");  
        }
        int aux = fila[0];
        for (int i = 0; i < ultimo; i++){
            fila[i] = fila[i+1];
            ultimo --;
        }
        return aux ;
    }

    // retorna mas não remove o primeiro elemento da fila e da erro se estiver vazia
    public int head () throws Exception{
        if (ultimo == -1) {
            throw new Exception("A fila esta vazia");  
        }
        return fila[0];
    }

    // retorna a quantos tem na fila
    public int size (){
        return ultimo+1;
    }
    
    public boolean isEmpty(){
        return ultimo == -1;
            
    }

    public void clear(){
        ultimo =-1;
    }

}
