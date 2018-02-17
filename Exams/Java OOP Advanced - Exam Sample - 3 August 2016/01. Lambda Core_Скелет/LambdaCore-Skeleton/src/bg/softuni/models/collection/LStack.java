package bg.softuni.models.collection;

import bg.softuni.models.models.cores.SystemCore;

import java.util.LinkedList;

public class LStack {

    private LinkedList<SystemCore> innerList;

    public LStack() {
        this.innerList = new LinkedList<SystemCore>();
    }

    public Integer size() {
        return this.innerList.size();
    }

    public SystemCore push(SystemCore item) {
        this.innerList.addLast(item);
        return item;
    }

    public SystemCore pop() {
        SystemCore removedItem = this.innerList.removeLast();
        return removedItem;
    }

    public SystemCore peek() {
        SystemCore peekedItem = this.innerList.getFirst();
        return peekedItem;
    }

    public Boolean isEmpty() {
        return !this.innerList.isEmpty();
    }
}