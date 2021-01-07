package practise_set_11;

class Monkey {
    public void bite() {
        System.out.println("Biting...!!!!");
    }

    public void jump() {
        System.out.println("Jumping...!!!!");
    }
}

interface animal {
    abstract void eat();

    abstract void sleep();
}

class Human extends Monkey implements animal {
    @Override
    public void eat() {
        System.out.println("Eating...!!!!");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...!!!");
    }
}

public class Q2 {

}
