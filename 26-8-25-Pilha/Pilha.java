import javax.management.RuntimeErrorException;

public class Pilha {
    // dado a analise a Pilha é constante
    private int []arranjo;
    private int topo;

    public Pilha(){
        this.arranjo = new int[10];
        this.topo = 0;
    }

    public Pilha(int capacidade){
        this.arranjo = new int[capacidade];
    }


    // valido lembrar que é inserido de baixo para cima, o topo é a primeira posição livre 
  // insere o elemento e no topo da pilha

  // ---- Complexidade 1 (constante)
  public boolean push(int e){
    
    if(topo >= arranjo.length){
        return false;
    }else
    arranjo[topo] = e;
    topo++;

    return true;
  }

  //remove e retorna o elemento do topo da pilha (erro se a pilha estiver vazia)

   // ---- Complexidade 1 (constante)
   public int pop(){

    if(topo > 0){
        return arranjo[topo--];
    }else
    throw new ArrayIndexOutOfBoundsException ("Inpossivel remover!! A pilha esta vazia");
   
   }

   //retorna, mas não remove, o elemento do topo da pilha (erro se a pilha estiver vazia)
    // ---- Complexidade 1 (constante)
    public int top(){

        if(topo == 0){
            throw new RuntimeErrorException(null, "A pilha esta cheia");
        }
    
        return arranjo[topo-1];
    } 

    // retorna o número de elementos da pilha
     // ---- Complexidade 1 (constante)
    public int size(){

        return top();
    }

    //: retorna true se a pilha estiver vazia, e false caso contrário
     // ---- Complexidade 1 (constante)
    public boolean isEmpty(){
        if(topo == 0){
            return true;
        }return false;
    }

    // esvazia a pilha
     // ---- Complexidade 1 (constante)
    public void clear(){

        topo = 0;
    }

}
