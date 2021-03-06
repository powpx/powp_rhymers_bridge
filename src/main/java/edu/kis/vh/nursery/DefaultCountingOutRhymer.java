package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackImplementation.IntArrayStack;
import edu.kis.vh.nursery.stackImplementation.IntLinkedList;
import edu.kis.vh.nursery.stackImplementation.Stack;

public class DefaultCountingOutRhymer {

    private IntArrayStack stack;
    private Stack list;

    public DefaultCountingOutRhymer(IntArrayStack stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer(IntLinkedList list) {
        this.list = list;
    }

    public DefaultCountingOutRhymer(){
        list = new IntLinkedList();
    }

    public void countIn(int in) {
        list.push(in);
    }

    public boolean callCheck() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.isFull();
    }

    public int peekaboo() {
        return list.top();
    }

    public int countOut() {
        return list.pop();
    }

}
