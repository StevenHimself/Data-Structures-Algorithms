package SinglyLinkedList;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    //O(1) complexity
    public void addToFront(Employee employee) { //add employee to the beginning of the list
        EmployeeNode node = new EmployeeNode(employee); //creates node for new employee
        node.setNext(head); //set the original head to the next field
        head = node; //assign head to new employee
        size++; //tracks the size of the list
    }

    public EmployeeNode removeFromFront(){ //remove employee from the beginning of the list
        if (isEmpty()) { //nothing to remove
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.println("HEAD -> ");
        while(current != null){
            System.out.println(current);
            System.out.println("->");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
