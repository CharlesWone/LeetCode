/*
实现 int sqrt(int x) 函数。
计算并返回 x 的平方根，其中 x 是非负整数。
由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class SqrtX_69 {
    /*
    //what the fuck
    public int mySqrt(int x) {
        long t = x;
        t = 0x5f375a86 - (t >> 1);
        while (!(t*t <= x && (t+1)*(t+1) > x))
            t = (x/t + t)/2;
        return (int)t;
    }
    
    //牛顿法
    public int mySqrt(int x) {
        long r = x;
        while (r * r > x) r = (r + x / r) / 2;
        return (int) r;
    }
    */
    
    //自欺欺人法
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}
