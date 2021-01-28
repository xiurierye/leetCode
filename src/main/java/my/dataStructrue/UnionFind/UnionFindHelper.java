package my.dataStructrue.UnionFind;

import com.google.common.base.Stopwatch;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

public class UnionFindHelper {

    public static void testUF(int n, UnionFind unionFind){
        SecureRandom secureRandom = new SecureRandom();

        Stopwatch started = Stopwatch.createStarted();

        for (int i = 0; i < n; i++) {
            int p = secureRandom.nextInt(n);
            int q = secureRandom.nextInt(n);
            unionFind.unionElement(p,q);

        }

        for (int i = 0; i < n; i++) {
            int p = secureRandom.nextInt(n);
            int q = secureRandom.nextInt(n);
            unionFind.isConnected(p,q);
        }

        long elapsed = started.stop().elapsed(TimeUnit.MILLISECONDS);
        System.out.printf("%s, %d opes, %d ms%n",unionFind.name(),2*n,elapsed);

    }

}
