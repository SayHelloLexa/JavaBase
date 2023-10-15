public class staticWord {
    public static void main(String[] args) {
        HumanStatic human1 = new HumanStatic("Alex", 18);
        HumanStatic human2 = new HumanStatic("Denis", 18);
        HumanStatic.description = "Alex"; // относится ко всему классу
        HumanStatic.getDescription();
        HumanStatic.description = "Denis";
        HumanStatic.getDescription();
        human1.getAllFields();
        human2.getAllFields();
    }
}

class HumanStatic{
    private String name;
    private int age;
    public static String description; // статическая перемаенная, относящаяся ко всему классу
    public static int countHuman;
    public static void getDescription(){
        System.out.println(description);
    }

    public HumanStatic(String name, int age){
        this.name = name;
        this.age = age;
        countHuman ++;
    }
    public void getAllFields(){
        System.out.println(name + " " + age + " " + countHuman); // для определенного объекта
    }

}
