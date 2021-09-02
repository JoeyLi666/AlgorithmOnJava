package chart1;

/**
 * @Classname Gcd
 * @Description 欧几里德算法
 * @Date 2021/9/2 17:37
 * @Created by JoeyLi
 */
public class Gcd {
    public static void main(String[] args) {
        int p = 8;
        int q = 4;
        int gcd = gcd(p, q);
        System.out.println(gcd);
    }


    /*
    * 计算两个非负整数 p 和 q 的最大公约数： 若q 是 0， 则最大公约数为 p。 否则， 将 p 除以
    * q 得到余数 r， p 和 q 的最大公约数即为 q 和r 的最大公约数。
    * */
    private static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
