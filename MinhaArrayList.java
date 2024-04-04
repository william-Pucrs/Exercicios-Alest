import java.util.List;

public class MinhaArrayList {

    private int capacity; // quto de espaço na lista
    private int []list; // o arranjo que armazena os valores
    private int count; // quantos valores estao salvos na lista


    public MinhaArrayList(int capacity, int[] list,int count) {
        list = new int[10];
        capacity = 10;
        count = 0;

    }


    public MinhaArrayList(int inicialCapacity) {
        if(inicialCapacity <=10){
            inicialCapacity = 10;
        }
        list = new int [inicialCapacity];
        capacity = inicialCapacity;
        count = 0;
    }
    
    private void grow(){
        int [] novaLista = new int[list.length*2];
        for(int i = 0; i < list.length; i++){
            novaLista[i] = list[i];
            list = novaLista;
        }
    }
    public boolean add(int element){
        if (count == list.length) {
            grow();

            list[count] = element;
            count++;
            return true;
        }
        return false;
    }

    public void	add(int index, int element){
        if ((index < 0) || (index >= count)) {
            throw new indexOutOFBoundsException("Posiçao invalida");
        }
        for ( int i = count; i > index; i--){
            list[i] = list [i-1];
        }
        list[index] = element;
        count++;

    }
    public void	clear(){
        capacity = 10;
        list = new int[capacity];
        count = 0;
    }
    //public boolean contains(int element){}
    //public int get(int index){}
    public int indexOf(int element){
        return 0;
    }

    public boolean isEmpty(){
        return (count == 0);
    }

    private void shrink (){
        int [] novaLista = new int [list.length/2];
        for(int i = 0; i < list.length; i++){
            novaLista[i] = list[i];
            list = novaLista;
        }
    }
    
    public int remove(int index){
        if ((index < 0) || (index >= count)) {
            throw new indexOutOFBoundsException("Posiçao invalida");
        }
        int value = list[index];
        for (int i =0; i < count ;i++){
            list[i] = list [i -1];
            return value;
        }
    }
    //public int	set(int index, int element){}
    //public int	size(){}
    //public int	capacity(){}
}