
public class ListaEstatica {

    private int [] arranjo;
    // fimDaLista tem duplo Sentido
    // 1. Aprimeira posição livre para inserção
    // 2. O numero de elementos salvos
    private int fimDaLista;

    public boolean add(int e){
        if(this.fimDaLista == this.arranjo.length){
            return false;
        }else 

        this.arranjo[this.fimDaLista] = e;
        this.fimDaLista ++;
    }
    //public void add(int index, int element){}
    //public boolean addAll(int[] c) 
    //public boolean addAll(int index, int[] c) 
    public void clear(){
        this.fimDaLista = 0;
    }
    //public boolean contains(Object o) 
    public int get(int index){

        
        return arranjo[index];
    }
    //public int indexOf(int o) 
    public boolean isEmpty(){
       return this.fimDaLista == 0;

    }
    //public int lastIndexOf(int o) 
    public int remove(int index){
         validaPosicao(index);
        // sava valor a ser retornado
        int aux = arranjo[index];
        
        // ajusata lista, remove espaçoes va\ios
        for(int i = index; i < this.fimDaLista-1; i++){
            arranjo[i] = arranjo[i+1];
        } this.fimDaLista --;
        return aux;
    }
    //public boolean remove(int o) 
    //public boolean removeAll(int[] c) 

    private void validaPosicao(int index){
        if ((index >= fimDaLista) || (index < 0)){
            throw new RuntimeException(" deu ruim");
        }
    }
    //public int set(int index, int element) 
    public int size(){

        return this.fimDaLista;
    }
    //public int[] subList(int fromIndex, int toIndex) 

   
}