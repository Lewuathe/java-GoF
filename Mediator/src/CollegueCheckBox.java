import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by sasakiumi on 3/2/14.
 */
public class CollegueCheckBox extends Checkbox implements ItemListener, Collegue {
    private Mediator mediator;

    public CollegueCheckBox(String label, boolean state, CheckboxGroup group) throws HeadlessException {
        super(label, state, group);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setCollegueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.collegueChanged();
    }
}
