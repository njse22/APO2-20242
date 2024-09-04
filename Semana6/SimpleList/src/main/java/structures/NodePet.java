package structures;

import model.Person;
import model.Pet;

public class NodePet {
    private String id;
    private Pet value;

    private NodePet next;

    public NodePet(String id, Pet value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pet getValue() {
        return value;
    }

    public void setValue(Pet value) {
        this.value = value;
    }

    public NodePet getNext() {
        return next;
    }

    public void setNext(NodePet next) {
        this.next = next;
    }


}
