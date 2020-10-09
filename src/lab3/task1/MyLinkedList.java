package lab3.task1;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList<E> {
    LinkedList<E> linkedList = new LinkedList<E>();

    int len = 0;

    int size() {
        return len;
    }

    void add(E item) {
        linkedList.addLast(item);
        len++;
    }

    void remove(int index) {
        linkedList.remove(index);
        len--;
    }

    void remove(E item) {
        remove(linkedList.indexOf(item));
    }

    E get(int index) {
        ListIterator listIter = linkedList.listIterator(index);
        return (E)listIter.next();
    }

    void clear() {
        len = 0;
        linkedList = new LinkedList<E>();
    }
}
