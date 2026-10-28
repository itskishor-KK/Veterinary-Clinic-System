class clinicProcess {

    int billAmount = 0;
    String patientStatus = "Not Arrived";
    String treatmentStatus = "Not Completed";

    synchronized void checkRegistration() {

        System.out.println("Receptionist is checking patient registration...");

        while (patientStatus.equals("Not Arrived")) {
            System.out.println("Waiting for pet to arrive...");

            try {
                wait();
            } catch (Exception e) {
            }
        }

        System.out.println("Pet has arrived");
        System.out.println("Patient registration completed");

        notifyAll();
    }

    synchronized void petArrives() {

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        patientStatus = "Arrived";

        System.out.println("Pet arrived at the clinic");

        notifyAll();
    }

    synchronized void assignTreatment() {

        while (!patientStatus.equals("Arrived")) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        System.out.println("Veterinarian is assigning treatment...");
        System.out.println("Treatment assigned to the patient");

        treatmentStatus = "Assigned";

        notifyAll();
    }

    synchronized void checkTreatment() {

        while (!treatmentStatus.equals("Assigned")) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        System.out.println("Treatment is in progress...");

        treatmentStatus = "Completed";

        System.out.println("Treatment completed successfully");

        notifyAll();
    }

    synchronized void generateBill(int amount) {

        while (!treatmentStatus.equals("Completed")) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        System.out.println("Generating treatment bill...");

        billAmount = amount;

        System.out.println("Total Treatment Bill: Rs. " + billAmount);
    }
}

class exp10 {

    public static void main(String[] args) {

        clinicProcess c = new clinicProcess();

        new Thread() {
            public void run() {
                c.checkRegistration();
            }
        }.start();

        new Thread() {
            public void run() {
                c.petArrives();
            }
        }.start();

        new Thread() {
            public void run() {
                c.assignTreatment();
            }
        }.start();

        new Thread() {
            public void run() {
                c.checkTreatment();
            }
        }.start();

        new Thread() {
            public void run() {
                c.generateBill(550);
            }
        }.start();
    }
}