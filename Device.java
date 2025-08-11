class Device {
    String name;

    Device(String name) {
        this.name = name;
    }

    void powerOn() {
        System.out.println(name + " is powered on.");
    }
}

class Phone extends Device {
    Phone(String name) {
        super(name);
    }

    void call() {
        System.out.println(name + " is calling.");
    }
}

class SmartPhone extends Phone {
    SmartPhone(String name) {
        super(name);
    }

    void browse() {
        System.out.println(name + " is browsing on the internet.");
    }

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("IPhone 16 pro max");
        sp.powerOn();
        sp.call();
        sp.browse();
    }
}