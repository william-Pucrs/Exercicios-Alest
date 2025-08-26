public class Pilha {

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
  public boolean push(int e){
    
    if(topo >= arranjo.length){
        return false;
    }else
    arranjo[topo] = e;
    topo++;

    return true;
  }

  //remove e retorna o elemento do topo da pilha (erro se a pilha estiver vazia)
   public int pop(){

    if(topo > 0){
        return arranjo[topo--];
    }else
    throw new ArrayIndexOutOfBoundsException ("Inpossivel remover!! A pilha esta vazia");
   
   }

   //retorna, mas não remove, o elemento do topo da pilha (erro se a pilha estiver vazia)
    public int top(){

        return 0;
    } 

    // retorna o número de elementos da pilha
    public int size(){

        return 0;
    }

    //: retorna true se a pilha estiver vazia, e false caso contrário
    public boolean isEmpty(){

        return true;
    }

    // esvazia a pilha
    public void clear(){

    }
}
