package structures;

import model.Person;

public class SimpleLinkedListPerson {

    //public static int MAX_SIZE = 10;
    private NodePerson first;
    private int size;

    public void add(String id,  Person value){
       NodePerson node = new NodePerson(id, 0,value);

       //if (this.size <= MAX_SIZE){
       //    // Agregue un nodo
       //}

       // Caso Base -> La lista esta vacia
       if(first == null){
           first = node;
           this.size++;
       }

       // Caso Base -> La lista no esta vacia
       else {
           if(first.getNext() == null){
               first.setNext(node);
               // se actualiza el indice y se aumenta el tamaño de la lista
               first.getNext().setIdx(1);
               this.size++;
           }
           // Caso Iterativo
           else {
               // nodo actual
               NodePerson current = first.getNext();
               while (current.getNext() != null){
                   current = current.getNext();
               }
               current.setNext(node);
               this.size++;
               current.getNext().setIdx(size-1);
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

    public NodePerson get(int idx){
        NodePerson found = null;

        // Caso Base
        if(first.getIdx() == idx){
            found = first;
        }

        // Caso Iterativo
        else {
            NodePerson current = first;
            boolean isFound = false;

            while (current.getNext() != null && !isFound) {
                if (current.getIdx() == idx) {
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

    public int getSize() {
        return size;
    }
}
