package polymorphism;

public class polymorphismmethodOverrinding {
    public static void main(String[] args)
    {
        Animal a=new Animal();
        Animal dog=new Dog();
        Animal cat=new Cat();
        Animal pig=new Pig();
        a.displaysound();
        dog.displaysound();
        cat.displaysound();
        pig.displaysound();
    }
}
