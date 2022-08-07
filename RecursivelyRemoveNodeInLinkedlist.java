
head
|
2 -> 3 -> 3 -> null


rRemove(null)           null
rRemove(3)              3(second)
rRemove(3)              3(second)
rRemove(2)
removeDuplicates()


head
|
2   ->   3  -> null
|       /
cur    3

public void removeDuplicates() {
    head = rRemove(head);
}

private Node<T> rRemove(Node<T> curr) {
    if (curr == null) {
        return null;
    }
    curr.next = rRemove(curr.next);
    if (curr.next != null && curr.data.equals(curr.next.data) {
        return curr.next;
    }
    return curr;
}
    
    
