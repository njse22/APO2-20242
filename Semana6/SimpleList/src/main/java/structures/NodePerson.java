package structures;

import model.Person;

public class NodePerson {

    private String id;
    private Person value;

    private NodePerson next;

    public NodePerson(String id, Person value) {
        this.id = id;
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
