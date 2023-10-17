public class objectsAndToString {
    public static void main(String[] args) {
        Human1 human1 = new Human1("Alex", 18);
        System.out.println(human1.toString()); // по-умолчанию выводит хеш-код объекта

    }
}

// существует невидимый класс Object внизу приведенный класс наследует поля и методы класса Object.
// так происходит абсолютно со всеми классами.
class Human1{
    private String name;
    private int age;
    public Human1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){ // таким способом можно изменить метод toString();
        return name + "," + age;
    }

}
