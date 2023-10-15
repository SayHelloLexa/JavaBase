public class ObjectsInMethods {
    public static void main(String[] args) {
        Persona Kate = new Persona();
        Kate.setName("Kate");
        System.out.println(Kate.getName());
        changeName(Kate);
        System.out.println(Kate.getName());
    }
    static void changeName(Persona Kate){ // метод изменяющий имя объекта Kate. Вместо Persona Kate
        Kate.setName("Alice");            // внутри может быть Persona p  и что угодно, т.к ссылка одна и та же.
    }
}

class Persona{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
