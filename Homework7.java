class InkjetPrinter {
    private String a;
    private int i;

    public InkjetPrinter(String a, int i) {
        this.i =i;
        this.a = a;
    }

    public boolean print() {
        if(i==7500){
            System.out.println(a + ":" + (i + 1) + "매째 인쇄 실패 - 잉크 부족.");
        }
        return false;
    }
}
class LaserPrinter {
    private String a;
    private int i;

    public LaserPrinter(String a, int i) {
        this.i =i;
        this.a = a;
    }

    public boolean print() {
        if(i==1500){
            System.out.println(a + ":" + (i + 1) + "매째 인쇄 실패 - 토너 부족.");
        }
        return false;
    }
}



class Homework7 {
    public static void main(String[] args) {

        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW",7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw",1500);
        while(inkjet.print());
        while(laser.print());
    }
}