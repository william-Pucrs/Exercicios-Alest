public class ListaSimplesmenteEncadeada {

    // define o nodo a ser alocado na lista
    private class Nodo{
        int valor;
        Nodo proximo;
        public Nodo(int valor) {
            this.valor=valor;
            this.proximo=null;
        }        
    }

    // atributos de controle da lista
    private Nodo head, tail;
    private int nNodos;

    public ListaSimplesmenteEncadeada() {
        this.head=null;
        this.tail=null;
        this.nNodos=0;
    }

    public boolean add(int e){

        //1. cria o nodo
        Nodo aux = new Nodo(e);
        
        // alternativa 1 (só tem head) 
        //2. novo nodo referencia o head - Inserção no início da lista
        //aux.proximo=this.head;
        
        // alternativa 2 (tem head e tail) 
        //2. novo nodo inserido no final da lista
        //   O novo nodo não precisa de atualização
        //   <<Nenhum código específico>>            
        
        // alternativa 1 (só tem head)
        //3. head referencia o novo nodo
        //this.head=aux;

        // alternativa 2 (tem head e tail)
        //3. o tail tem de ser atualizado
        //   Se for o primeiro elemento da lista
        if(nNodos==0){
            this.head=aux;
            this.tail=aux;
        }
        //   Se NÃO for o primeiro elemento da lista
        else{
            this.tail.proximo=aux;
            this.tail=aux;
        }

        this.nNodos++;

        return true;
    }

    //public void add(int index, int element){    } <-2
    
    //public boolean addAll(int[] c) 
    
    //public boolean addAll(int index, int[] c) 

    public void clear(){
        this.head=null;
        this.tail=null;
        this.nNodos=0;
    }

    //public boolean contains(int o){    } <-1

    public int get(int index){  

        Nodo aux = this.head;
        int count = 0;

        if(( index < 0) || (index >= nNodos)){
            throw new IndexOutOfBoundsException("foi jão, indice invalido");
        }

        while (index !=  count) {
            
            aux = aux.proximo;
            count++;
        }
        return aux.valor;
      } 

    public int indexOf(int o){  

        Nodo aux = this.head;
        int count = 0;

        while(aux != null ){
            
           if(aux.valor == o){
            return count;
           }
           aux = aux.proximo;
           count ++;
        }
        return -1;
      }

    public boolean isEmpty(){
        //return (this.tail==null);
        //return (this.head==null);
        return (this.nNodos==0);
    }

    // verifica em qual index o valor repete 
    public int lastIndexOf(int o){ 

        Nodo aux = this.head;
        int index = 0;
        int ultimo = -1;

        if(( o < 0) || (o >= nNodos)){
            throw new IndexOutOfBoundsException("foi jão, indice invalido");
        }

        while( aux != null){

            if (aux.valor == o) {
                
                ultimo = index;
            }
            aux = aux.proximo;
            index++;

        }
        return ultimo;
      }

    //public int removeByIdx(int index){    }  <- 2

    //public boolean removeByValue(int o) {    } <- 2

    //public boolean removeAll(int[] c) 

    //public int set(int index, int element){    }  <- 1

    public int size(){
        return this.nNodos;
        // tail-head não faz sentido neste contexto
    }

    //public int[] subList(int fromIndex, int toIndex) 

    public String toString(){

        // se a lista estiver vazia
        if(this.nNodos==0) // (this.head==null) ou ainda (this.tail=null)
            return "A lista está vazia";
        
        // do contrário imprimo o conteúdo
        StringBuilder sb = new StringBuilder();

        sb.append("0:[");
        // passo por cada elemento da lista
        Nodo johnyWalker = this.head;
        while (johnyWalker!=null) {
            sb.append(johnyWalker.valor+",");
            johnyWalker=johnyWalker.proximo;
        }

        sb.append("]:"+(this.nNodos-1)+":"+(this.nNodos-1)+"("+this.nNodos+")");

        // retorno a string
        return sb.toString();

        
    }

    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lse = new ListaSimplesmenteEncadeada();

        System.out.println(lse);

        lse.add(32);
        System.out.println(lse);

        lse.add(14);
        System.out.println(lse);

        lse.add(-1);
        System.out.println(lse);

        lse.add(98);
        System.out.println(lse);

        //System.out.println("O conteudo da posicao 2 é "+lse.get(2));

        //lse.remove(1);
        //System.out.println(lse);

    }
   
}