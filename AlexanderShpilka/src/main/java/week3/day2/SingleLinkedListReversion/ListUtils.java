package week3.day2.SingleLinkedListReversion;

public class ListUtils {
    public static A<String> createStringList() {
        A<String> head = new Node<>("A");
        A<String> second = new Node<>("B");
        A<String> third = new Node<>("C");
        A<String> fourth = new Node<>("D");
        A<String> fifth = new Node<>("E");
        A<String> sixth = new Node<>("F");
        A<String> seventh = new Node<>("G");
        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        return head;
    }

    public static<T> A<T> reversion(A<T> head) {
//        todo write your code
        A<T> end = head;
        A<T> sixth = end.getNext();
        A<T> fifth = sixth.getNext();
        A<T> fourth = fifth.getNext();
        A<T> third = fourth.getNext();
        A<T> second = third.getNext();
        head = second.getNext();

        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(end);
        end.setNext(null);

        return head;
    }
}
