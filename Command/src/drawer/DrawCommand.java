package drawer;

import command.Command;

import java.awt.*;

/**
 * Created by sasakiumi on 3/4/14.
 */
public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;

    public DrawCommand(DrawCanvas drawable, Point position) {
        this.position = position;
        this.drawable = drawable;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
