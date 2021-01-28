package my.dataStructrue.UnionFind;

public interface UnionFind {
    int find(int p);

    boolean isConnected(int p, int q);

    void unionElement(int p, int q);

    String name();
}
