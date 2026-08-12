public class Main2 {
    int a;
    Main2() {
        System.out.println("i am default constructor");
        this(5);
    }
    Main2(int b) {
        System.out.println("i am para constructor");
    }
    public static void main(String[] args) {
        Main2 m =new Main2();
    }
}

