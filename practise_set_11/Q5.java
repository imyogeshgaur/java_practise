package practise_set_11;

interface TVremote {
    abstract void off();

    abstract void channelChange();
}

interface SmartTVremote extends TVremote {
    abstract void watchYoutube();

    abstract void connectBluetooth();
}
