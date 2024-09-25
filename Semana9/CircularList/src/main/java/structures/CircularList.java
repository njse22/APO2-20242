package structures;

public class CircularList <T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public void add(T value){
        Node<T> node = new Node<>(0, value);

        // Caso Base -> La lista esta vacia
        if(first == null){
            first = node;
            // lista Circular
            last = node;
            this.size++;
        }

        // Caso Base -> La lista no esta vacia
        else {
            if(first.getNext() == null){
                first.setNext(node);

                // lista circular
                first.getNext().setPrevious(first); // doblemente enlazada
                last = first.getNext(); // doblemente enlazada
                // circular
                first.setPrevious(last);
                last.setNext(first);

                // se actualiza el indice y se aumenta el tamaño de la lista
                first.getNext().setPosition(1);
                this.size++;
            }
            // Caso Iterativo
            else {
                // Agregar el nuevo nodo al final de la lista
                last.setNext(node);

                // Actualizar las conexiones del nuevo nodo
                node.setPrevious(last);

                // Actualizar el apuntador al ultimo de la lista
                last = node;

                // Actualizar conexiones de la lista circular
                last.setNext(first);
                first.setPrevious(last);

                // Actualizar tamaño y posición
                last.setPosition(size-1);
                size++;
            }
        }
    }


    public String printList(){
        String msg = "";

        Node<T> current = first;
        if(current != null){
            msg += first + " ";
        }
        while (current.getNext() != null && current != last){
            msg += current.getNext() + " ";
            current = current.getNext();
        }

        return msg;
    }


    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
