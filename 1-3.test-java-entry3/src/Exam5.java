public class Exam5 {
    public static void main(String[] args) {
        int add = addition();
        System.out.println("足し算結果:"+add);

        int sub = subtraction();
        System.out.println("引き算結果:"+sub);

        int multi = multiplication();
        System.out.println("掛け算結果:"+multi);

        int div = division();
        System.out.println("割り算結果:"+div);

        int rem = remainder();
        System.out.println("剰余算結果:"+rem);
    }

    static int addition(){
        int num1 = 5;
        int num2 = 3;
        return num1 + num2;
    }
    static int subtraction(){
        int num1 = 5;
        int num2 = 3;
        return num1 - num2;
    }

    static int multiplication(){
        int num1 = 5;
        int num2 = 3;
        return num1 * num2;
    }

    static int division(){
        int num1 = 5;
        int num2 = 3;
        return num1 / num2;
    }
    static int remainder(){
        int num1 = 5;
        int num2 = 3;
        return num1 % num2;
}
}
