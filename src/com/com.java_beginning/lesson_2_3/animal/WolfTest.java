package lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("Male");
        wolf.setNickName("Bob");
        wolf.setWeight(10.0f);
        wolf.setAge(11);
        wolf.setColor("Grey");
        System.out.println("Gender - " + wolf.getGender() + "\nNickname - " + wolf.getNickName() +
                "\nWeight - " + wolf.getWeight() + "\nAge - " + wolf.getAge() + "\nColor - " + wolf.getColor());
    }
}
