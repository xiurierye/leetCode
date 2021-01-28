package my.dataStructrue;

import com.google.common.base.Stopwatch;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

public class UnionFindHelper {

    public static void testUF1(int n){
        SecureRandom secureRandom = new SecureRandom();

        UnionFind1 unionFind1 = new UnionFind1(n);

        Stopwatch started = Stopwatch.createStarted();

        for (int i = 0; i < n; i++) {
            int p = secureRandom.nextInt(n);
            int q = secureRandom.nextInt(n);
            unionFind1.unionElement(p,q);

        }

        for (int i = 0; i < n; i++) {
            int p = secureRandom.nextInt(n);
            int q = secureRandom.nextInt(n);
            unionFind1.isConnected(p,q);
        }

        long elapsed = started.stop().elapsed(TimeUnit.MILLISECONDS);
        System.out.printf("UF1, 2*n opes, %d ms%n",elapsed);

    }
}
