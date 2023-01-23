package at.ran.oo.list.linkedlist;

import at.ran.oo.list.HTLList;

public class LinkedList implements HTLList {
    private Node root;

    @Override
    public void add(int value) {
        Node n = new Node(value);
        if (root==null){
            root = n;
        } else {
            Node actual = root;
            while(actual.getNext()!=null){
                actual = actual.getNext();

            }
            actual.setNext(n);
        }
    }

    @Override
    public int get(int index) {
        return -1;
    }

    @Override
    public void remove(int index) {

    }
}
