package Lesson2;

public class Main {
    public static String getNameMethod() {
        return new Exception().getStackTrace()[1].getMethodName();
    }

    public static void main(String[] args) {
        NotBooleanMethod notBooleanMethod = new NotBooleanMethod();
        notBooleanMethod.notBooleanMethod();

        BooleanMethod booleanMethod = new BooleanMethod();
        booleanMethod.booleanMethod();

        System.out.println(Main.getNameMethod());

        System.out.println(StaticName.getMethodName());
    }
}
