package lesson_2_3.animal;

public class Wolf {
    private String gender;
    private String nickName;
    private float weight;
    private int age;
    private String color;

    public Wolf() {
    }

    public Wolf(String gender, String nickName, float weight, int age, String color) {
        this.gender = gender;
        this.nickName = nickName;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = 10.0f;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = "Braun";
    }

    public void go() {
        System.out.println("Going.");
    }

    public void sit() {
        System.out.println("Sitting.");
    }

    public void run() {
        System.out.println("Running.");
    }

    public void howl() {
        System.out.println("Howling.");
    }

    public void hunt() {
        System.out.println("Hunting");
    }
}
