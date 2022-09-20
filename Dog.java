package assesment;

public class Dog extends Canine implements Pet{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void beFriendly() {
        System.out.println(this.getName()+ " is Being Nice");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " is Having Fun");
    }
}
