package my.dataStructrue;

/**
 * 基础unionFind
 */
public class UnionFind1 {

    private int[] id;
    private int count;


    public UnionFind1(int count) {
        this.count = count;
        id = new int[count];

        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    /**
     * 返回p对应的id
     *
     * @param p
     * @return
     */
    public int find(int p) {
        assert p >= 0 && p < count;
        return id[p];
    }

    /**
     * 更具p，q对应的连接下标 如果一样表示连接 否则 不连接
     * @param p
     * @param q
     * @return
     */
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public void unionElement(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) {
            return;
        }

        for (int i = 0; i < count; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }

    }


}
