package my.dataStructrue.binarySearchTree;

public class BinarySearchTree<K extends Comparable<K>, V> {

    private Node<K, V> root;
    private int count;

    public BinarySearchTree() {
        root = null;
        count = 0;
    }

    public void insert(K key, V value) {



    }

    private void innerInsert(Node<K,V> root, K key,V value) {
        int i = key.compareTo(root.key);
        if (i ==0){
            root.value = value;
        }
        else if (i<0){
            if (root.left==null){
                root.left= new Node<>(key, value);
                return;
            }
            innerInsert(root.left,key,value);
        }else {
            if (root.right==null){
                root.right= new Node<>(key, value);
                return;
            }
            innerInsert(root.right,key,value);
        }



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
