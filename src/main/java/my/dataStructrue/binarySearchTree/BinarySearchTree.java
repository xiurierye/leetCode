package my.dataStructrue.binarySearchTree;

public class BinarySearchTree<K extends Comparable<K>, V> {

    private Node<K, V> root;
    private int count;

    public BinarySearchTree() {
        root = null;
        count = 0;
    }

    public void insert(K key, V value) {
        this.root = this.innerInsert(root, key, value);

    }

    private Node<K,V> innerInsert(Node<K, V> root, K key, V value) {
        if (root == null) {
            root = new Node<>(key, value);
            return root;
        }

        int i = key.compareTo(root.key);
        if (i == 0) {
            root.value = value;
        } else if (i < 0) {
            root.left = innerInsert(root.left, key, value);
        } else {
            root.right =  innerInsert(root.right, key, value);
        }
        return root;

    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                ", count=" + count +
                '}';
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return root == null;
    }


    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> left;
        Node<K, V> right;


        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }
    }
}
