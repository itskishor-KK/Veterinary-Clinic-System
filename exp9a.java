
class ClinicProcess extends Thread {

    public void run() {

        System.out.println("Patient details checked");
        System.out.println("Veterinary consultation completed");
        System.out.println("Treatment details updated");
        System.out.println("Patient record saved");
    }
}

class exp9a {

    public static void main(String[] args) {

        System.out.println("Welcome to Veterinary Clinic");

        ClinicProcess c = new ClinicProcess();

        c.start();

        System.out.println("Clinic activities completed");
    }
}