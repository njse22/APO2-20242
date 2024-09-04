package structures;

import model.Person;

public class SimpleLinkedListPerson {

    private NodePerson first;

    public void add(String id,  Person value){
       NodePerson node = new NodePerson(id, value);

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
               NodePerson current = first.getNext();
               while (current.getNext() != null){
                   current = current.getNext();
               }
               current.setNext(node);
           }
       }
    }

    // buscar por nombre de persona | value = name
    public NodePerson search(String value){
        NodePerson found = null;

        // Caso Base
        if(first.getValue().getName().equals(value)){
            found = first;
        }

        // Caso Iterativo
        else {
            NodePerson current = first;
            boolean isFound = false;

            while (current.getNext() != null && !isFound) {
                if (current.getValue().getName().equals(value)) {
                    found = current;
                    isFound = true;
                }
                current = current.getNext();
            }
        }
        return found;
    }

    public NodePerson getFirst() {
        return first;
    }
}
