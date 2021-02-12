package GeekBrain_Java_level1;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private float sallary;
    private int age;

    public Worker(String name, String position, String email, String phoneNumber, float sallary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.sallary = sallary;
        this.age = age;
    }

    public Worker() {

    }
    public int getAge (){
        return age;
    }

    public void writeInfo() {
        System.out.printf(" Сотрудник: %s%n Должность: %s%n Адрес электронной почты: %s%n Номер телефона: %s%n Зарплата: %s%n возраст: %d%n", name, position, email, phoneNumber, sallary, age);
    }
}
