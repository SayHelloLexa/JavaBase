public class Classes {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Mike", 40);


        }
}
class Person {
    String name;
    int age;

    void setName(String username, int userage) {
        name = username;
        age = userage;
    }

    void speak() {
        System.out.println(name + " " + age);
    }
}


