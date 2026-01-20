public class Exam4 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        int add = Calculation.addition(num1, num2);
        int sub = Calculation.subtraction(num1, num2);
        int mul = Calculation.multiplication(num1, num2);
        int div = Calculation.division(num1, num2);
        int rem = Calculation.remainder(num1, num2);

        System.out.println("足し算結果："+add);
        System.out.println("引き算結果："+sub);
        System.out.println("掛け算結果："+mul);
        System.out.println("割り算結果："+div);
        System.out.println("剰余算結果："+rem);
    }
}
