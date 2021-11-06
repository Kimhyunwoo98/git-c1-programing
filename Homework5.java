
class computer {
    private String cpu;
    private String memory;
    private String hdd;
    private String color;
    private String power;

    public computer(String cpu, String memory, String hdd,String color,String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.color = color;
        this.power = power;
    }

    public void show() {
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + cpu + "\nMemory: " + memory+ "\nHDD: " + hdd + "\nColor: " + color + "\nPower: " + power);
    }
}

class monitor {
    private String size;
    private String color;
    private String power;

    public monitor(String size, String color, String power) {
        this.size = size;
        this.color = color;
        this.power = power;
    }

    public void show() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + size + "\nColor: " + color+ "\nPower: " + power);
    }
}

class Homework5 {
    public static void main(String[] args) {
        System.out.println("Turning on the Computer");
        System.out.println("Turning on the Monitor");
        computer computer = new computer("Core i7","16GB","2TB","White","500W");
        monitor monitor = new monitor("24 inch","Black","45W");
        computer.show();
        monitor.show();
    }
}