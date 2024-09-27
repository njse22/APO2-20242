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
