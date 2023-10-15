public class Constructors {
    public static void main(String[] args) {
        Humann humann1 = new Humann();

    }
}

class Humann{
    String name;
    int age;
    public Humann(){
       this.name = "Имя по-умолчанию";
       this.age = 0;
       System.out.println(name + " " + age);
   }
    /*
   public Humann(){
        System.out.println("Первый конструктор");
    }
    */
    public Humann(String name, int age){
        System.out.println("Второй конструктор");
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }

}