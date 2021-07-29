package algorithm.base;

public class Array<E> {

    private E[] data;
    private int size;

    /**
     * Initial constructor
     * @param capacity
     */
    public Array(int capacity){

        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * Default constructor
     */
    public Array(){

        this(10);
    }

    //get the size of array
    public int getSize() {
        return size;
    }

    //get the capacity of the array
    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    //insert a item in this array
    public void insert(int index, E e){

        if (size == data.length) {
            resize(2 * data.length);
        }
        if (index < 0 || index > size){
            throw new IllegalArgumentException("index is out of bound");
        }

        for (int i = size - 1; i >= index; i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public void addFirst(E e){
        this.insert(0,e);
    }

    public void addLast( E e){
        this.insert(size, e);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array : size: %d; capacity: %d\n",size,data.length));
        res.append('[');
        for (int i = 0 ; i < size; i++){
            res.append(data[i]);
            if(i != size -1){
                res.append(", ");
            }
        }
        res.append(']');

        return res.toString();
    }
    public E get(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("index is out of bound");
        }
        return  data[index];
    }
    public  void set(int index, E e){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("index is out of bound");
        }
        data[index] = e;
    }

    public boolean contains(E e){
        for(int i = 0; i < size; i++){
            if (data[i].equals(e)){
                return true;
            }
        }
        return false;
    }
    public int find(E e){
        for (int i = 0; i < size; i++) {
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    public E remove(int index){
        if(index <0 || index > size){
            throw new IllegalArgumentException("index is out of bound");
        }
        E ret = data[index];
        for(int i = size-1; i > index; i--){
            data[i-1] = data[i];
        }
        size--;
        data[size] = null;

        if (size == data.length / 2){
            resize(data.length / 2);
        }
        return ret;
    }

    private void resize(int newCapacity){
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
