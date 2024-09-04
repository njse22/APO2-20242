package structures;

import model.Person;
import model.Pet;

public class SimpleLinkedListPet {

    private NodePet first;

    public void add(String id,  Pet value){
        NodePet node = new NodePet(id, value);

        // Caso Base -> La lista esta vacia
        if(first == null){
            first = node;
        }

        // Caso Base -> La lista no esta vacia
        else {
            if(first.getNext() == null){
                first.setNext(node);
            }
            // Caso Iterativo
            else {
                NodePet current = first.getNext();
                while (current.getNext() != null){
                    current = current.getNext();
                }
                current.setNext(node);
            }
        }
    }

    public NodePet search(String value){
        NodePet found = null;

        // Caso Base
        if(first.getValue().equals(value)){
            found = first;
        }

        // Caso Iterativo
        else {
            NodePet current = first;
            boolean isFound = false;

            while (current.getNext() != null && !isFound) {
                if (current.getValue().equals(value)) {
                    found = current;
                    isFound = true;
                }
                current = current.getNext();
            }
        }
        return found;
    }
}
