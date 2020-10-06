

import java.util.Calendar;
/**
 *
 * @author natasha
 */
public class User {
          String firstname ;
          String lastname ;  
          int age ;  
          String mail ;
          String status;//={"ACTIVE", "INACTIVE", "BLOCKED", "NEW"};
          Calendar timestamp;
          
  User(String name, String surename, int yourAge, String yourMail, String yourStatus, Calendar timestamp)
  {    
     firstname=name;
     lastname=surename;     
     age=yourAge;    
     mail= yourMail;    
     status=yourStatus;
     this.timestamp= timestamp;         
  }
  ///////////
  static void println(String s)   
  {
        System.out.println(s);
  }
 static void print(String s)    
  {
        System.out.print(s);
   }
  //////
     public String getFirstname()       
        {   
               return firstname;           
         }
        
     public String getLastname()       
        {   
               return lastname;           
         }
     public int getAge()       
        {   
               return age;           
         }
     public String getStatus()       
        {   
               return status;           
         }
 /*    public Date getDate()       
        {   
               return timestamp;           
         }*/
/////////////
     public void setFirstname (String  newFirstname)
        {
           if (newFirstname != firstname )   
                  
                firstname = newFirstname;             
          else
            {
                   println("New value is equal with the old one"); 
             }
         }
      public void setLastname (String  newLastname)
        {
           if (newLastname != lastname )   
                  
                lastname = newLastname;             
          else
            {
                   println("New value is equal with the old one"); 
             }
         }
      
       public void setAge (int  newAge)
        {
           if (newAge > 0 && newAge != age )   
                  
                age = newAge;             
          else
            {
                   println("New value is equal with the old one"); 
             }
         }
       
        public void setStatus (String  newStatus)
        {
           if (newStatus != status )   
                  
                status = newStatus;             
          else
            {
                   println("New value is equal with the old one"); 
             }
         }
    /*     public void setTimestamp(Date newTimestamp)
        {
           if (newTimestamp != timestamp )   
                  
                timestamp=newTimestamp;             
          else
            {
                   println("New value is equal with the old one"); 
             }
         }*/
        
     public String toString(){//overriding the toString() method  
   
         return "\n User's name:"+firstname+"\n User's surename:"+lastname+"\n Age:"+age+"\n E-mail:"+mail+"\n Status:"+status+"\n Registration date: "+timestamp.getTime();  
 } 
     
  public void NewToActive(User User1)
   {  Calendar toDate = Calendar.getInstance();
     toDate.add(Calendar.DATE, -1);

       if (User1.timestamp.before(toDate) && User1.status == "NEW")
          User1.status="ACTIVE";

  }   

 public void InactiveToBlocked  (User User2)
  {   Calendar toDate = Calendar.getInstance();
        toDate.add(Calendar.MONTH, -1);

       if (User2.timestamp.before(toDate) && User2.status == "INACTIVE")
          User2.status="BLOCKED";

  }  
}
