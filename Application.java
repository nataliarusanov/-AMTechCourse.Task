import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Application {
    public static void main(String args[])
    { 
        String SName[] = { "Diana", "Andrei", "Ion", "Anna", "Tatiana"}; 
        String SSurename[] = { "Panzaru", "Rusu", "Croitor", "Uzun", "Grecu"};  
        String SyourStatus[] ={"ACTIVE", "INACTIVE", "BLOCKED", "NEW"};
 
        ArrayList< User> users = new ArrayList<User>();
      ////Creating users////  
        User user1 = new User ("Natalia","Rusanov",21, "natali.rusanov@gmail.com" , "NEW", Calendar.getInstance());
        users.add(user1);
        for (int a=0; a<6;a++)
        {
            int i=(new Random()).nextInt(SName.length);
            int j=(new Random()).nextInt(SSurename.length); 
            int k=(new Random()).nextInt(SyourStatus.length); 
             Calendar cal = Calendar.getInstance();
              cal.set(2020, i*1, k*3);
            User user = new User (SName[i], SSurename[j], i+18, SName[i]+"@gmail.com" , SyourStatus[k], cal);
            users.add(user);  
        }
        
      
        
    System.out.print(users); 
    System.out.print("\n\n");
    
    ///////NewToActive///////
         for (int counter = 0; counter < users.size(); counter++) { 	
             
          users.get(counter).NewToActive(users.get(counter));
      }
         
    System.out.print(users);
    System.out.print("\n\n");
       ///////InactiveToBlocked///////
          for (int counter = 0; counter < users.size(); counter++) { 	
             
          users.get(counter).InactiveToBlocked(users.get(counter));
      }
         
    System.out.print(users);
    
    } 
}
