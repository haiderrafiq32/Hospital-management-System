
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamza
 */
public class PatientDAO {
    private MyDBConnection connection;
    
    public PatientDAO(){
        connection=new MyDBConnection();
        connection.init();
    }

  
    public void saveRecord(int id,String name,int age,String sex){
        String status=connection.insertRecord("insert into patient( Id,Name, Age,Sex) values"
               + "('"+id+"','"+name+"','"+age+"','"+sex+"')");
        System.out.println(status);
        
    }
    
//  
//    public void updateRecord(){
//        connection.updateRecord("update product set Name='"+this.name+"', Description='"+this.description+"', "
//                + "Price='"+this.price+"' where Id='"+this.id+"'");
//    }
    public void deleteRecord(int id){
        connection.deleteRecord("delete from patient where Id ="+id);
    }
    public Patient getRecord(int id){
        ResultSet rs= connection.getRecord("Select * from patient where Id="+id);
        Patient p=new Patient();
//        CustomerDAO cd=new CustomerDAO();
        try{
            while(rs.next()){
               p.setPatientId(rs.getInt("Id"));
               p.setPatientName(rs.getString("Name"));
               p.setPatientAge(rs.getInt("Age"));
               p.setPatientSex(rs.getString("Sex"));
            }
            return p;
        }
        catch(Exception ex){
            return null;
        }
    }
   
}

