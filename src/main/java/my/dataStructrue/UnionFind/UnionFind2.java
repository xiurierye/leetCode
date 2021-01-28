package my.dataStructrue.UnionFind;

/**
 * 通过树型结构优化并查集
 */
public class UnionFind2 implements UnionFind{

    private final int[] parent;
    private final int count;

    public UnionFind2(int count) {
        parent = new int[count];
        this.count = count;

        for (int i = 0; i < count; i++) {
            parent[i] = i;
        }
    }

    /**
     * 找到p 对应的根节点
     * @param p
     * @return
     */
    public int find(int p){

        assert  p>=0 && p<count;

        while (parent[p] != p ){
            p = parent[p];
        }

        return p;
    }

    public boolean isConnected(int p,int q){
        return  find(p) == find(q);
    }

    public void unionElement(int p,int q){
        int pRoot = find(p);
        int qRoot = find(q);

        if (qRoot == pRoot) {
            return;
        }

        parent[pRoot] = qRoot;
    }

    @Override
    public String name() {
        return "UF2";
    }
}
