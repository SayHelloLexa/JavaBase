public class thisWord {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Alexey");
        human1.getInfo();

    }
}

class Human{
    String name;
    public void setName(String name){
        this.name = name;
    }
    public void getInfo(){
        System.out.println(name);
    }
}