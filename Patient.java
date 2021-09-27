
public class Patient {

    private int patientAge;
    private int patientId;
    private String patientName;
    private String patientSex;
    public Receptionist m_Receptionist;
  PatientDAO pd=new PatientDAO();
    public Patient() {

    }

    public Patient(int patientAge, int patientId, String patientName, String patientSex, Receptionist m_Receptionist) {
        this.patientAge = patientAge;
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientSex = patientSex;
        this.m_Receptionist = m_Receptionist;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public Receptionist getM_Receptionist() {
        return m_Receptionist;
    }

    public void setM_Receptionist(Receptionist m_Receptionist) {
        this.m_Receptionist = m_Receptionist;
    }

    public int payBills() {
        return 0;
    }
    public void save(int id,String Name,int age,String Sex)
    {
      
       pd.saveRecord(id,Name,age,Sex);
    
    
    }
      
    public String displayData(int id)
    {
        String str="";
        str= str+"id:              "+pd.getRecord(id).getPatientId()+"\n";
       str= str+"Name:        "+pd.getRecord(id).getPatientName()+"\n";
       str= str+"Age:        "+pd.getRecord(id).getPatientAge()+"\n";
       str= str+"Email:  "+pd.getRecord(id).getPatientSex()+"\n"+"\n";

  
       
   return str;
}
    public void delete(int id)
    {
        pd.deleteRecord(id);
    }

}
