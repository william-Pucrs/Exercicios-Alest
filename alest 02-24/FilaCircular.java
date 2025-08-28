public class FilaCircular {
    int vetor[];
    int inicio,fim;

    public FilaCircular(){
        vetor = new int [10];
        inicio =0;
        fim = 0;
    }

    // insere no final da fila
    public void enqueue(int e) throws Exception{
        // analisar a condicao de fila cheia 
        int proxFim = (fim + 1)% vetor.length;
        if (proxFim == inicio) {
            throw new Exception("a fila esta cheia");
        }
        vetor[fim] = e;
        fim = proxFim;
    }

    // retorna e remove o elemento E do inicio e da erro se tiver vazio
    public int dequeue() throws Exception{
        if (inicio == fim) {
            throw new Exception(" a fila esta vazia");
        }
         int aux = vetor[inicio];
            inicio = (inicio +1)%vetor.length;
            return aux;
        
    }

    // retorna mas não remove o primeiro elemento da fila e da erro se estiver vazia
    public int head () throws Exception{
        if (inicio == fim) {
            throw new Exception("A fila esta cheia");
        }
        return vetor[inicio];
    }

    // retorna a quantos tem na fila
    public int size (){
    return 0;
    }

    public boolean isEmpty(){
        
           return false;
    }

    public void clear(){
        inicio = 0;
        fim = 0;
    }
}
