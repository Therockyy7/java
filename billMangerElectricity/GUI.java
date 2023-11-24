package billMangerElectricity;

public class GUI {
    public static void main(String[] args) {
        ArrayBill arrayBill = new ArrayBill();
        arrayBill.loadBillFromFile("D:\\java_tu_hoc\\billMangerElectricity\\BillElectricList.txt");

        arrayBill.run();
    }
}
