class AccessExample {

    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    void display() {
        System.out.println("Private: " + a);
        System.out.println("Default: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Public: " + d);
    }
}

public class TestAccess {
    public static void main(String[] args) {

        AccessExample obj = new AccessExample();

        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}