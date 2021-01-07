package practise_set_11;

interface TVremoteUsed {
    abstract void off();

    abstract void channelChange();
}

interface SmartTVremoteUsed extends TVremoteUsed {
    abstract void watchYoutube();

    abstract void connectBluetooth();
}

abstract class TV implements SmartTVremoteUsed {
    @Override
    public void watchYoutube() {
        System.out.println("Connecting To Youtube Server.....!!!!");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Connecting To Devices....!!!!");

    }
}

public class Q6 {

}
