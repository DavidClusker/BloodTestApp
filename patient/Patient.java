/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patient;

/**
 *
 * @author David
 */
public class Patient {
    private String name;
    private String priority;
    private String gpDetails;
    private int age;
    private boolean fromHospital;

    public Patient(String name, String priority, String gpDetails, int age, boolean fromHospital) {
        this.name = name;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.age = age;
        this.fromHospital = fromHospital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public void setGpDetails(String gpDetails) {
        this.gpDetails = gpDetails;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFromHospital() {
        return fromHospital;
    }

    public void setFromHospital(boolean fromHospital) {
        this.fromHospital = fromHospital;
    }
    @Override
    public String toString() {
        return name + " (" + priority + ", Age: " + age + ", GP: " + gpDetails + ")";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
