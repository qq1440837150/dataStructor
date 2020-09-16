import exception.IndexOutOfBoundOfArrayException;
import org.omg.CORBA.Object;

public class MyArrayList<E> implements MyList<E> {
    private E[] array;
    private int lastIndex;
    private int cursor;
    public MyArrayList(E[] array,int lastIndex) {
        this.array = array;
        this.lastIndex=lastIndex;
        this.cursor=0;
    }
    public MyArrayList(int length){
        this.array = (E[]) new Object[length];
        this.lastIndex=0;
        this.cursor=0;
    }
    @Override
    public void add(E element) {

    }

    @Override
    public void insert(E element, int position) {

    }

    @Override
    public E erase(int position) {
        return null;
    }

    @Override
    public E erase(E element) {
        return null;
    }

    @Override
    public int size() {
        return this.lastIndex+1;
    }

    @Override
    public Boolean isEmpty() {
        if(this.size ()==0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean isFull() {
        if(this.size ()>=array.length){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean hasNext() {
        if(cursor<lastIndex){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public E next() {
        if(cursor>=lastIndex){
            throw new IndexOutOfBoundOfArrayException ();
        }
        return array[cursor++];
    }

}
