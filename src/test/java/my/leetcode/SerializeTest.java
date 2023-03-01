package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SerializeTest {
    @Test
    public void test() {
        Serialize.Codec ser = new Serialize.Codec();
        Serialize.Codec deser = new Serialize.Codec();

        String serialize = ser.serialize(null);
        deser.deserialize(serialize);




    }
}