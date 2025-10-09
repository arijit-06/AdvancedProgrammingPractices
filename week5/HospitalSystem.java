class Patient {
    private String name;
    private String medicalHistory;
    private String diagnosis;
    
    public Patient(String name, String medicalHistory, String diagnosis) {
        this.name = name;
        this.medicalHistory = medicalHistory;
        this.diagnosis = diagnosis;
    }
    
    // Authorized method for doctors to access patient data
    public String getPatientRecord(String doctorId) {
        if (doctorId != null && doctorId.startsWith("DR")) {
            return "Patient: " + name + ", History: " + medicalHistory + ", Diagnosis: " + diagnosis;
        }
        return "Access Denied: Unauthorized access to patient records";
    }
    
    public String getName() {
        return name;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient patient = new Patient("John Doe", "Diabetes", "Type 2 Diabetes");
        
        // Doctor accessing patient record (authorized)
        System.out.println(patient.getPatientRecord("DR001"));
        
        // Unauthorized access attempt
        System.out.println(patient.getPatientRecord("STAFF001"));
        
        System.out.println("\nPrinciple Used: ENCAPSULATION");
        System.out.println("Private data is protected and accessed only through authorized methods");
    }
}