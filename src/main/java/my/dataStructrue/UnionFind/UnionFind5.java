package my.dataStructrue.UnionFind;

/**
 * 通过树型结构优化并查集
 * 使用rank 多记录一个  树的高度
 * 加上路径压缩 思路
 */
public class UnionFind5 implements UnionFind {

    private final int[] parent;
    private final int[] rank; // rank[i] 表示以i为根的树的层数
    private final int count;

    public UnionFind5(int count) {
        parent = new int[count];
        rank = new int[count];
        this.count = count;

        for (int i = 0; i < count; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    /**
     * 找到p 对应的根节点
     *
     * @param p
     * @return
     */
    public int find(int p) {

        assert p >= 0 && p < count;


        while (parent[p] != p) {

            parent[p] = parent[parent[p]];
            p = parent[p];

        }

        return p;
    }

    public boolean isConnected(int p, int q) {

        return find(p) == find(q);
    }

    public void unionElement(int p, int q) {

        int pRoot = find(p);
        int qRoot = find(q);

        if (qRoot == pRoot) {
            return;
        }

        if (rank[pRoot] < rank[qRoot]) {
            parent[pRoot] = qRoot;
        } else if (rank[pRoot] > rank[qRoot]) {
            parent[qRoot] = pRoot;
        } else {
            parent[pRoot] = rank[qRoot];
            rank[pRoot] += 1;
        }


    }

    @Override
    public String name() {
        return "UF5";
    }
}
