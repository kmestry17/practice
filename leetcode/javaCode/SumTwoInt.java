package leetcode.javaCode;

public class SumTwoInt {
    public int getSum(int a, int b) {
        while (b != 0) {
            int temp = a ^ b;
            b = (a & b) << 1;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        SumTwoInt sumTwoInt = new SumTwoInt();
        System.out.println(sumTwoInt.getSum(1, 2));
    }
}
