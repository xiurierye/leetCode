package my.leetcode;

import my.leetcode.ContainerWithMostWater.Solution;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    Solution solution = new Solution();

    @Test
    public void test1() {
        int i = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(i);
        assertEquals(49, i);
    }


    @Test
    public void test2() {
        int i = solution.maxArea(new int[]{});
        System.out.println(i);
        assertEquals(4913370, i);
    }

    @Test
    public void test3() throws IOException {

        URL resource = this.getClass().getResource("/containerWithMostWater.properties");
        try (Stream<String> stream = Files.lines(Paths.get(resource.getFile()))) {
            stream.forEach(s -> {
                String[] split = s.split(",");
                int[] ints = Arrays.stream(split).mapToInt(Integer::valueOf).toArray();

                int area = solution.maxArea(ints);
                System.out.println(area);
                assertEquals(56250000, area);
            });

        }
    }

}