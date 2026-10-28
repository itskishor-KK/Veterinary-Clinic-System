class TreatmentApproval {

    private final Object doctor = new Object();
    private final Object pharmacist = new Object();

    void processTreatment(String petName) {

        // Deadlock prevention:
        // Both threads lock Doctor first, then Pharmacist.

        synchronized (doctor) {

            System.out.println(petName +
                    " got Doctor approval.");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

            synchronized (pharmacist) {

                System.out.println(petName +
                        " got Pharmacist verification.");

                System.out.println(petName +
                        " : Treatment Approved.");
            }
        }
    }
}

class patient extends Thread {

    TreatmentApproval treatment;
    String petName;

    patient(TreatmentApproval treatment, String petName) {
        this.treatment = treatment;
        this.petName = petName;
    }

    public void run() {

        System.out.println(petName +
                " thread is running.");

        treatment.processTreatment(petName);

        System.out.println(petName +
                " thread completed.");
    }
}

public class exp11 {

    public static void main(String[] args) {

        TreatmentApproval treatment = new TreatmentApproval();

        patient p1 = new patient(treatment, "Bruno");
        patient p2 = new patient(treatment, "Kitty");

        // NEW state
        System.out.println("Patient 1 State : " + p1.getState());
        System.out.println("Patient 2 State : " + p2.getState());

        // Start threads
        p1.start();
        p2.start();

        // RUNNABLE state
        System.out.println("Patient 1 State : " + p1.getState());
        System.out.println("Patient 2 State : " + p2.getState());

        try {
            Thread.sleep(500);

            // State depends on thread scheduling
            System.out.println("Patient 1 State : " + p1.getState());
            System.out.println("Patient 2 State : " + p2.getState());

            // Wait for threads to finish
            p1.join();
            p2.join();

        } catch (Exception e) {
            System.out.println(e);
        }

        // TERMINATED state
        System.out.println("Patient 1 State : " + p1.getState());
        System.out.println("Patient 2 State : " + p2.getState());

        System.out.println("\nAll Treatment Approval Processes Completed.");
    }
}