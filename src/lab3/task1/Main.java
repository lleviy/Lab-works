package lab3.task1;

public class Main {
    public static void main(String[] args) {
        MyCollection<Integer> arr = new MyCollection<Integer>();
        arr.size();
        arr.add(6);
        arr.add(9);
        arr.add(732);
        arr.add(20);
        arr.add(736);
        arr.add(0);
        arr.remove(2);
        arr.remove((Integer) 736);
        arr.clear();

        MyLinkedList<Integer> ll = new MyLinkedList<Integer>();
        ll.add(7);
        ll.add(90);
        Integer a = ll.get(1);
        ll.add(33);
        ll.remove(0);
        ll.remove((Integer) 33);
        ll.clear();
    }
}
