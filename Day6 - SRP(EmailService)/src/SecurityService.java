/**
 * Created by ruplaga on 7/25/2017.
 */
public class SecurityService {

    public static boolean checkPermission(String user){
        //20 loc to check in DB
        if(user.equals("admin")) {
            return true;
        }else{
            return false;
        }
    }
}
