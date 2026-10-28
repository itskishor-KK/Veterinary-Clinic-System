
class ClinicProcess2 implements Runnable {

    public void run() {

        System.out.println("Patient details checked");
        System.out.println("Veterinary consultation completed");
        System.out.println("Treatment details updated");
        System.out.println("Patient record saved");
    }
}

class exp9b {

    public static void main(String[] args) {

        System.out.println("Welcome to Veterinary Clinic");

        ClinicProcess c = new ClinicProcess();

        Thread t = new Thread(c);

        t.start();

        System.out.println("Clinic activities completed");
    }
}