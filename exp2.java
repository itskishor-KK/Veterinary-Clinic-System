
class Records {

    String patientId;
    String petName;
    String species;
    String breed;
    int age;
    String ownerName;
    String healthIssue;

    // Default Constructor
    Records() {
        patientId = "V101";
        petName = "Bruno";
        species = "Dog";
        breed = "Husky";
        age = 4;
        ownerName = "Arjun";
        healthIssue = "Skin Allergy";
    }

    // Parameterized Constructor
    Records(String patientId, String petName, String species, String breed,
            int age, String ownerName, String healthIssue) {

        this.patientId = patientId;
        this.petName = petName;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.ownerName = ownerName;
        this.healthIssue = healthIssue;
    }

    void display() {
        System.out.println("\nPatient Details");
        System.out.println("Patient ID    : " + patientId);
        System.out.println("Pet Name      : " + petName);
        System.out.println("Species       : " + species);
        System.out.println("Breed         : " + breed);
        System.out.println("Age           : " + age);
        System.out.println("Owner Name    : " + ownerName);
        System.out.println("Health Issue  : " + healthIssue);
    }
}

class exp2 {

    public static void main(String[] args) {

        // Object using Default Constructor
        Records r1 = new Records();
        r1.display();

        // Object using Parameterized Constructor
        Records r2 = new Records(
                "V102",
                "Kitty",
                "Cat",
                "Persian",
                2,
                "Meena",
                "Fever"
        );

        r2.display();
    }
}
