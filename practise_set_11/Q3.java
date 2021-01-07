package practise_set_11;

abstract class Telephone {
    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    @Override
    void lift() {
        System.out.println("Recieved by Samrter one...!!!!");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnected by Smarter One...!!!!");

    }
}

public class Q3 {
    public static void main(String[] args) {
        Telephone t = new SmartTelephone();
        t.lift();
        t.disconnect();
    }
}
