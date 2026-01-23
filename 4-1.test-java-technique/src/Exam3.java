public class Exam3 {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.NotFoundClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("例外が発生しました!");
        }
    }
}
