package my.dataStructrue.UnionFind;

/**
 * 通过树型结构优化并查集
 * 使用size
 */
public class UnionFind3 implements UnionFind{

    private final int[] parent;
    private final int[] size; // size[i] 表示以i为根的集合中元素的个数
    private final int count;

    public UnionFind3(int count) {
        parent = new int[count];
        size = new  int [count];
        this.count = count;

        for (int i = 0; i < count; i++) {
            parent[i] = i;
            size[i]=1;
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

        if (size[pRoot] <=size[qRoot]){
            parent[pRoot] = qRoot;
            size[qRoot] = size[pRoot] + size[qRoot];
        }else {
            parent[qRoot]=pRoot;
            size[pRoot] = size[pRoot] + size[qRoot];
        }


    }

    @Override
    public String name() {
        return "UF2";
    }
}
