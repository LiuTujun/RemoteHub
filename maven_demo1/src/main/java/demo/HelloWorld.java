package demo;

public class HelloWorld {
    private String name;
    private Integer age;

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello World! ");
        HelloWorld h = new HelloWorld();

        System.out.println(Class.forName("demo.HelloWorld").hashCode());
        System.out.println(h.getClass().hashCode());
        System.out.println(HelloWorld.class.hashCode());
    }
}
