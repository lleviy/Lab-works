package lab3.task1;

public class MyCollection<E> {
    Object array[] = new Object[16];
    int pointer = 0;

    public int size() {
        return pointer;
    }

    public void add(E item) {
        if (pointer == array.length - 1){
            resize();
        }
        array[pointer] = item;
        pointer++;
    }

    void resize() {
        Object[] largerArray = new Object[array.length * 2];
        System.arraycopy(array, 0, largerArray, 0, array.length);
        array = largerArray;
    }

    public void remove(int index) {
        if (index>= 0 && index < pointer){
            System.arraycopy(array, index + 1, array, index, pointer - index);
            pointer--;
        }
        else {
            throw new IndexOutOfBoundsException("Недопустимый индекс коллекции");
        }
    }

    public void remove(E item) {
        for (int i = 0; i < pointer; i++){
            if (array[i].equals(item)){
                remove(i);
            }
        }
    }

    public E get(int index) {
        return (E)array[index];
    }

    public void clear() {
        pointer = 0;
        array = new Object[16];
    }
}
