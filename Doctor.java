
public class Doctor {

    private String dept;
    private int id;
    private String name;
    private String specialization;
    public Patient m_Patient;

    public Doctor() {

    }

    public Doctor(String dept, int id, String name, String specialization, Patient m_Patient) {
        this.dept = dept;
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.m_Patient = m_Patient;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Patient getM_Patient() {
        return m_Patient;
    }

    public void setM_Patient(Patient m_Patient) {
        this.m_Patient = m_Patient;
    }

    public void checkReports() {

    }

    public void prescribeMeds() {

    }

    public void prescribeTest() {

    }

}
