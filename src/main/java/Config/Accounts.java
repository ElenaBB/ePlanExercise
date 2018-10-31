package Config;

public class Accounts {

    private String accountName = "jhallowaytest";
    private String accountPassword = "MozotoEqueta123";
    private String fullAccountName = "Jack Holloway";
    private String invalidPassword1 = "MozotoEqueta12";
    private String invalidPassword2 = "MozotoEqueta";
    private String invalidPassword3 = "Mozoto";


    public String getAccountName() {
        return accountName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public String getFullAccountName() {
        return fullAccountName;
    }

    public String getWrongPassword1() {
        return invalidPassword1;
    }

    public String getWrongPassword2() {
        return invalidPassword2;
    }

    public String getWrongPassword3() {
        return invalidPassword3;
    }
}
