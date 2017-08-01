/**
 * Created by ruplaga on 7/25/2017.
 */
public class EmailService {

    public static void sendEmail(String user,String email,String message){
        if(LocationService.checkLocation(LocationService.retrieveLocation(email))){
            if(SecurityService.checkPermission(user)){
                if(exists(email)){
                    System.out.println("Email is sent to "+email+ " with message : "+message);
                }
            }
        }
    }

    public static boolean exists(String email){
        //20 loc to check in DB
        if(email.endsWith("@yahoo.com")) {
            return true;
        }else{
            return false;
        }
    }
}
