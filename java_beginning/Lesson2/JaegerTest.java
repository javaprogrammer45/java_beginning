package Lesson2;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger bracerPhoenix = new Jaeger();
        Jaeger gipsyAvenger = new Jaeger("Gipsy Avenger", "Mark-6", "USA", 81.77f, 45.270f, 13, 11);

        bracerPhoenix.setModelName("Bracer Phoenix");
        bracerPhoenix.setMark("Mark-5");
        bracerPhoenix.setOrigin("USA");
        bracerPhoenix.setHeight(70.7f);
        bracerPhoenix.setWeight(2.1f);
        bracerPhoenix.setStrength(8);
        bracerPhoenix.setArmor(9);

        System.out.printf("%s%n%s%n%s%n%f%n%f%n%d%n%d%n", bracerPhoenix.getModelName(),
                bracerPhoenix.getMark(), bracerPhoenix.getOrigin(), bracerPhoenix.getHeight(),
                bracerPhoenix.getWeight(), bracerPhoenix.getStrength(), bracerPhoenix.getArmor());
        bracerPhoenix.move();
        System.out.println(bracerPhoenix.scanKaiju() + "\n");
        System.out.printf("%s%n%s%n%s%n%f%n%f%n%d%n%d%n", gipsyAvenger.getModelName(),
                gipsyAvenger.getMark(), gipsyAvenger.getOrigin(), gipsyAvenger.getHeight(),
                gipsyAvenger.getWeight(), gipsyAvenger.getStrength(), gipsyAvenger.getArmor());
        gipsyAvenger.useVortexCannon();
        gipsyAvenger.move();
    }
}
