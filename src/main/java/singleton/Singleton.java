package singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        System.out.println("인스턴스 생성");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
