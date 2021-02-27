
package emailverifier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailverifier {
     public static boolean isEmailValid(String email) {
    String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
    Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();}

    
    public static void main(String[] args) {
        
    }
    String email;//declaration 
    boolean ev= isEmailValid( email);//call the function , you can give in if condition and give messege box when email is incorrect
    
}
