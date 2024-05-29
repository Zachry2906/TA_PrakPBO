package Controller;

import ApotekObject.AccountAccess;
import Model.DataAkun;
import java.util.List;
import projekakhir.CreateAccountView;
import projekakhir.LoginView;

/**
 *
 * @aryaz
 */
public class AccountController {
    CreateAccountView frame;
    LoginView f;
    AccountAccess implement;

    public AccountController(CreateAccountView frame) {
        this.frame = frame;
        implement = new AccountAccess();
    }

    public AccountController(LoginView f) {
        this.f = f;
        implement = new AccountAccess();
    }

    public void createAccount(){
        DataAkun db = new DataAkun();
        db.setUsername(frame.getTFUsername().getText());
        db.setPassword(frame.getTFPassword().getText());
        implement.insert(db);
    }

    public void verifyAccount(){
        DataAkun db = new DataAkun();
        db.setUsername(f.getTFUsername().getText());
        db.setPassword(f.getTFPassword().getText());
        implement.verifyAccount(db);
    }

}
