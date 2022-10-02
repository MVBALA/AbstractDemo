public class Main {
    public static void main(String[] args) {
       Dog dog=new Dog("caps");
       dog.eat();
       dog.breath();
       Parrot parrot=new Parrot("Austalian ringneck");
       parrot.eat();
       parrot.breath();
       parrot.fly();
       Penguin penguin=new Penguin("Emperor");
       penguin.fly();


    }
}