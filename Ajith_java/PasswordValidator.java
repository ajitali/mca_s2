import java.util.regex.*;

public class PasswordValidator {
    public static final String REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
    public static void main(String[] args) {
        String[] passwords = {"GeeksForGeeks", "Geek007@GFG", "InvalidPassword1"};

        for (String password : passwords) {
            try {
                validatePassword(password);
                System.out.println(password + " - Valid Password");
            } catch (InvalidPasswordException e) {
                System.out.println(password + " - " + e.getMessage());
            }
        }
    }

    public static void validatePassword(String password) throws InvalidPasswordException {
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);

        if (!matcher.matches()) {
            throw new InvalidPasswordException("Invalid Password: Password should contain at least one digit(0-9), one lowercase letter, one uppercase letter, one special character ('@#$%^&+=') and have a length between 8 and 20 characters.");
        }
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}