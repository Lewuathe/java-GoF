import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by sasakiumi on 3/2/14.
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {
    private CollegueCheckBox checkGuest;
    private CollegueCheckBox checkLogin;
    private CollegueTextField textUser;
    private CollegueTextField textPass;
    private CollegueButton buttonOk;
    private CollegueButton buttonCancel;

    public LoginFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 2));
        createCollegues();
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username: "));
        add(textUser);
        add(new Label("Password: "));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        collegueChanged();
        pack();
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }

    @Override
    public void createCollegues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new CollegueCheckBox("Guest", true, g);
        checkLogin = new CollegueCheckBox("Login", false, g);
        textUser = new CollegueTextField("", 10);
        textPass = new CollegueTextField("", 10);
        textPass.setEchoChar('*');
        buttonOk = new CollegueButton("OK");
        buttonCancel = new CollegueButton("Cancel");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);

    }

    @Override
    public void collegueChanged() {
        if (checkGuest.getState()) {
            textUser.setCollegueEnabled(false);
            textPass.setCollegueEnabled(false);
            buttonOk.setCollegueEnabled(true);
        } else {
            System.err.println("user mode");
            textUser.setCollegueEnabled(true);
            userpassChanged();
        }
    }

    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setCollegueEnabled(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setCollegueEnabled(true);
            } else {
                buttonOk.setCollegueEnabled(false);
            }
        } else {
            textPass.setCollegueEnabled(false);
            textUser.setCollegueEnabled(false);
        }
    }
}
