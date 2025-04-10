package AimsProject;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Mắt Biếc", "Tình Cảm", "Victor Vũ", 120, 25.00f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Hai Phượng", "Hành Động", "Ngô Thanh Vân", 98, 30.00f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Bố Già", "Hài Hước", "Trấn Thành", 128, 35.00f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("Total Cost is: " + anOrder.totalCost());
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.println("Total Cost after removal is: " + anOrder.totalCost());
    }
}
