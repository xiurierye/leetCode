package my.dataStructrue.binarySearchTree;

public class BinarySearchTree<K, V> {

    private Node<K, V> root;
    private int count;

    public BinarySearchTree() {
        root = null;
        count = 0;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return root==null;
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> left;
        Node<K, V> right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }
    }
}
