import java.awt.*;

/**
 * Created by sasakiumi on 3/2/14.
 */
public class CollegueButton extends Button implements Collegue {
    private Mediator mediator;

    public CollegueButton(String label) throws HeadlessException {
        super(label);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setCollegueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
