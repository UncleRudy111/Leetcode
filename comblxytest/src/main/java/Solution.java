import cn.hutool.crypto.digest.MD5;

/**
 *
 */
public class Solution {
    public static void main(String[] args) {
        String str = "ak@QJ&pS&1&187581361xx,185xxxx,183xxx";
        String md5 = MD5.create().digestHex(str);
        System.out.println(md5);//29ecc0c795405c23c10167e58d1cb73c

    }
}
