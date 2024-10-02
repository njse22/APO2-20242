package structures;

public class BST <T extends Comparable<T>> {
    private Node<T> root;

    public void add(T value){
        Node<T> node = new Node<>(value);
        // Caso base
        if(root == null){
            root = node;
        }
        // Caso recursivo
        else {
            // Metodo recursivo
            add(node, root);
        }
    }

    public void delete(T value){
        // CASO BASE 0: EL arbol esta vacio
        if(root == null){
            // no se puede eliminar
        }else {
            // CASO 0.1: El arbol no esta vacio
            delete(null ,root, value);
        }
    }

    private void delete(Node<T> parent,  Node<T> current, T value){
        // CASO BASE:  -> encuentro el nodo
        if(current.getValue().compareTo(value) == 0){
            // CASO BASE 1: es un nodo hoja
            if(current.getLeft() == null && current.getRight() == null) {
                // CASO BASE 1.1: es un nodo hoja y es la raiz
                if(current == root){
                    root = null;
                }
                // CASO BASE 1.2: es un nodo hoja y es un hijo izquierdo
                else if(parent.getLeft() == current){
                    parent.setLeft(null);
                }
                // CASO BASE 1.3: es un nodo hoja y es un hijo derecho
                else if(parent.getRight() == current){
                    parent.setRight(null);
                }
            }
            // CASO BASE 2. tiene unicamente un hijo izquierdo
            else if (current.getLeft() != null && current.getRight() == null) {
                // CASO BASE 2.1. es la raiz
                if(current == root){
                    root = current.getLeft();
                }
                // CASO BASE 2.1. no es la raiz
                else {
                    // CASO BASE 2.1.1. el nodo actual es un hijo izquierdo
                    if(parent.getLeft() == current){
                        parent.setLeft(current.getLeft());
                    }
                    // CASO BASE 2.1.2. el nodo actual es un hijo Derecho
                    else {
                        parent.setRight(current.getLeft());
                    }
                }
            }
            // CASO BASE 3. tiene unicamente un hijo derecho
            else if (current.getLeft() == null && current.getRight() != null) {
                // CASO BASE 3.1: es la raiz
                if(root == current){
                    root = current.getRight();
                }
                // CASO BASE 3.2: no es la raiz
                else {
                    // CASO BASE 3.2.1. el nodo actual es un hijo izquierdo
                    if(parent.getLeft() == current){
                       parent.setLeft(current.getRight());
                    }
                    // CASO BASE 3.2.2. el nodo actual es un hijo derecho
                    else {
                        parent.setRight(current.getRight());
                    }
                }
            }
            // CASO BASE 4. Tiene ambos hijos
            else if (current.getLeft() != null && current.getRight() != null) {
                // Tambien se puede hacer con el SUCESSOR -> el menor de los mayores
                // PREDECESSOR -> eL Mayor de los Menores
                Node<T> predecessor = getMax(current.getLeft()); // El Mayor de los menores
                current.setValue(predecessor.getValue());
                delete(current, current.getLeft(), predecessor.getValue());
            }
        }
        // CASOS RECURSIVOS:
        // Buscar por izquierda
        else if (current.getValue().compareTo(value) > 0) {
            delete(current, current.getLeft(), value);
        }
        // Buscar por derecha
        else if (current.getValue().compareTo(value) < 0) {
            delete(current, current.getRight(), value);
        }
    }

    public Node<T> getMax(){
        return getMax(root);
    }

    private Node<T> getMax(Node<T> current){
       if(current.getRight() == null){
           return current;
       }
       else {
           return getMax(current.getRight());
       }
    }


    public String inOrder(){
        String msg = "";
        if(root == null){
            msg = "Empty Tree";
        }
        else {
            msg = inOrder(root);
        }
        return msg;
    }

    private String inOrder(Node<T> current){
        if(current == null){
            return " ";
        }
        else {
            return inOrder(current.getLeft()) + current.getValue() + inOrder(current.getRight());
        }
    }


    // Metodo recursivo
    private void add(Node<T> node, Node<T> current){
        // agregar a la izquierda
        if(node.getValue().compareTo(current.getValue()) < 0 ){
            if(current.getLeft() == null){
                current.setLeft(node);
            }
            else{
                // Caso recursivo
                add(node, current.getLeft());
            }
        }
        // agregar a la derecha
        else if (node.getValue().compareTo(current.getValue()) > 0){
            if(current.getRight() == null){
                current.setRight(node);
            }
            else {
                add(node, current.getRight());
            }
        }
        else {
            // Nodos iguales
            // -----------------------------------------
            // 1. Lanzar una excepción
            // 2. Modificar la estructura para agregarlos (agregar una lista enlazada o un arraylist)
            // 3. Sobre escribir la referencia (No recomendada)
        }
    }


    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
}
