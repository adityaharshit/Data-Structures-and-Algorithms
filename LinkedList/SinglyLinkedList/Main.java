package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        sll.insertInLinkedList(6, 0);
        sll.insertInLinkedList(7, 3);
        sll.insertInLinkedList(8, 2);
        sll.insertInLinkedList(9, 1);
        sll.traverseLinkedList();
        sll.searchNode(7);
        sll.deleteNode(2);
        sll.traverseLinkedList();
        sll.deleteSLL();
        sll.traverseLinkedList();
    }
}
