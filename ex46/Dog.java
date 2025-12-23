package ex46;

public class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.printf("Woof");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }

    public void greets(Dog another){
        System.out.printf("Woooof");

    }
}
