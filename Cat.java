package assesment;

public class Cat extends Feline implements Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void beFriendly() {
        System.out.println(this.getName() + " is Being Nice");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " is Having Fun");
    }
}
