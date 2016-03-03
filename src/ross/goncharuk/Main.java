package ross.goncharuk;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        EthernetAdapter ethernetAdapter = new EthernetAdapter("Broadcom", 100, "123OMFG", 100500, "DefaultAddress");

        System.out.println(device);
        System.out.println(monitor);
        System.out.println(ethernetAdapter);

        Device[] arr = {device,monitor,ethernetAdapter};

        for(Device arrayElement : arr){
            System.out.println(arrayElement);
        }
    }
}
