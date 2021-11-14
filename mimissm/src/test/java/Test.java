import com.bjpowernode.utils.MD5Util;

public class Test {
    @org.junit.Test
    public void testMD5() {
        String s = "000000";
        System.out.println(MD5Util.getMD5(s));
    }

}
