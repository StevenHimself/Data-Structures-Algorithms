package DoublyLinkedList;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    //O(1) complexity
    public void addToFront(Employee employee) { //add employee to the beginning of the list
        EmployeeNode node = new EmployeeNode(employee); //creates node for new employee

        if(head == null) { //if the list is empty
            tail = node; //make insert employee tail as well
        }
        else { //else if list is not empty
            head.setPrevious(node); //set the current head's previous to the insert node
            node.setNext(head); //set insert employee's next to the current head
        }
        head = node; //assign head to new employee
        size++; //increment the size of the list
    }

    public void addToBack(Employee employee) { //add employee to the end of the list
        EmployeeNode node = new EmployeeNode(employee);

        if( tail == null) { //if list is empty
            head = node; //make insert employee head as well
        }
        else { //else if list is not empty
            tail.setNext(node); //set current tail's next to insert employee
            node.setPrevious(tail); //set insert employee's previous to current tail
        }
        tail = node; //assign tail to insert employee
        size++; //increment the size of the list
    }

    public EmployeeNode removeFromFront(){
        if (isEmpty()){ //if list empty
            return null; //nothing to remove
        }

        if(head.getNext() == null){ //if only one employee in the list
            tail = null; //update tail to null
        }
        else { //else if not empty
            head.getNext().setPrevious(null); //set second employee's previous to null
        }

        EmployeeNode removedNode = head; //make a new node "removedNode" to store the employee to be removed
        head = head.getNext(); //make the second employee the new head
        size--; //decrement the size of the list
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty()){ //if list is empty
            return null; //nothing to remove
        }

        if(tail.getPrevious() == null){ //if only one employee in the list
            head = null; //update to head to null
        }
        else { //else if not empty
            tail.getPrevious().setNext(null); //set second last employee's next to null
        }
        EmployeeNode removedNode = tail; //make a new node "removedNode" to store the employee to be removed
        tail = tail.getPrevious(); //make the second last employee new tail
        size--; //decrement the size of the list
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
            if(current.getNext() == null) {
                System.out.println("->");
            }
            else {
                System.out.println("<=>");
            }
            current = current.getNext();
        }
        System.out.println("null");
    }
}
