package clinic;
public class Treatment {

    double consultationFee;
    double medicineFee;
    double totalFee;

    public void calculate(double consultation, double medicine) {

        consultationFee = consultation;
        medicineFee = medicine;
        totalFee = consultationFee + medicineFee;
    }

    public void displayBill() {

        System.out.println("Consultation Fee : " + consultationFee);
        System.out.println("Medicine Fee : " + medicineFee);
        System.out.println("Total Bill : " + totalFee);
    }
}