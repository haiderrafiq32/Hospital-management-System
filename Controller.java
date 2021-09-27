/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
public class Controller {
Patient p=new Patient();
    public void addPatient(int id,String name,int age,String Sex)
    {
       
        p.save(id, name, age, Sex);
    }
    public String display(int id)
    {
    String str =   p.displayData(id);
        return str;
    }
    public void delete(int id)
    {
        p.delete(id);
    }
}
