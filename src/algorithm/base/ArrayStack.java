package algorithm.base;

public class ArrayStack<E> implements Stack{

    Array<E> array;

    public ArrayStack(int capacity){
        array = new Array<>(10);
    }

    public ArrayStack(){
        array = new Array<>();
    }
    @Override
    public int getSize() {
        return array.getSize();
    }
    public int getCapacity(){
        return  array.getCapacity();
    }
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(Object o) {

    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }
}
