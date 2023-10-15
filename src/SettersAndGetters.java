public class SettersAndGetters {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setName("Alex");
        person1.setAge(18);
        System.out.println(person1.getName() + " " + person1.getAge() + " years");
    }
}
class Person1 {
    private String name;
    private int age;
    public void setName(String username) {
        name = username;
    }

    public String getName() {
       return name;
    }
    public void setAge(int userage){
        age = userage;
    }
    public int getAge(){
        return age;
    }
}
