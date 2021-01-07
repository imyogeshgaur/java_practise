package practise_set_11;

class MonkeyPoly {
    public void bite() {
        System.out.println("Biting...!!!!");
    }

    public void jump() {
        System.out.println("Jumping...!!!!");
    }
}

interface animalPoly {
    abstract void eat();

    abstract void sleep();
}

class HumanPoly extends MonkeyPoly implements animalPoly {
    @Override
    public void eat() {
        System.out.println("Eating...!!!!");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...!!!");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Monkey h = new Human();
        h.bite();
        h.jump();
    }
}
