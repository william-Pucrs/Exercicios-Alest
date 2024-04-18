public class MinhaLinkedList {

    private class Nodo {
        public int valor;
        public Nodo prox;
        public Nodo(int v){
            valor=v;
            prox=null;
        }
    }

    private Nodo head, tail;
    private int count;

    public MinhaLinkedList(){
        tail=head=null;
        count=0;
    }

    public boolean	add(int element){

        // criar o nodo da lista
        Nodo novo = new Nodo(element);

        if(isEmpty()){
            tail=head=novo;
        }
        else{
            // ***********************
            // IMPLEMENTACAO COM O TAIL
            tail.prox=novo;
            tail=novo;
            // ***********************

            // ***********************
            // IMPLEMENTACAO SEM O TAIL
            /*
            Nodo estagiario = head;
            while(estagiario.prox!=null)
                estagiario=estagiario.prox;
            estagiario.prox=novo;
            */
            // ***********************
        }
        count++;
        return true;
    }

    public void     add(int index, int element){}

    public void	    clear(){
        head=null;
        count=0;
    }

    public boolean	contains(int element){
        Nodo navegador=head;

        while(navegador!=null){
          if(navegador.valor==element)
            return true;
          navegador=navegador.prox;
        }
          
        return false;
    }

    public int 	    get(int index){
        if((index<0)||(index>=count))
            throw new IndexOutOfBoundsException("Posicao inválida na lista");

        int count=0;
        Nodo navegador=head;
        while(index!=count){
            navegador=navegador.prox;
            count++;
        }
        return navegador.valor;
    }

    public int	    indexOf(int element){
        Nodo navegador=head;
        int count=0;

        while(navegador!=null){
          if(navegador.valor==element)
            return count;
          
          navegador=navegador.prox;
          count++;
        }
          
        return -1;
    }

    public boolean	isEmpty(){
        return (count==0);
    }

    public int	    remove(int index){
        return -1;
    }

    public int	    set(int index, int element){
        if((index<0)||(index>=count))
            throw new IndexOutOfBoundsException("Posicao inválida na lista");
            
        int count=0;
        Nodo navegador=head;
        while(index!=count){
            navegador=navegador.prox;
            count++;
        }

        int aux = navegador.valor;
        navegador.valor = element;
        return aux;
    }

    public int	    size(){
        return count;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        if(! isEmpty()){
            Nodo navegador = head;
            while (navegador.prox!=null){
                sb.append(navegador.valor+", ");
                navegador=navegador.prox;
            }
            sb.append(navegador.valor+"");

        }
        sb.append("]");
        return sb.toString();
    }

}