package structures;

import model.Person;

public class NodePerson {

    private String id;
    private int idx;
    private Person value;

    private NodePerson next;

    public NodePerson(String id, int idx, Person value) {
        this.id = id;
        this.idx = idx;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getValue() {
        return value;
    }

    public void setValue(Person value) {
        this.value = value;
    }

    public NodePerson getNext() {
        return next;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public void setNext(NodePerson next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodePerson{" +
                "id='" + id + '\'' +
                '}';
    }
}
