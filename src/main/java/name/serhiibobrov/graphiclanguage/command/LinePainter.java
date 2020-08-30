package name.serhiibobrov.graphiclanguage.command;

import lombok.RequiredArgsConstructor;
import name.serhiibobrov.graphiclanguage.Command;
import name.serhiibobrov.graphiclanguage.GraphicContext;

@RequiredArgsConstructor
public class LinePainter implements Command {

    public static final int LENGTH_INDEX = 0;
    private final Direction direction;

    @Override
    public void run(GraphicContext context, String... args) {
        double length = Double.parseDouble(args[LENGTH_INDEX]);
        context.getPainter().paintLine(direction, length);
    }

    public enum Direction {
        WEST, NORTH, SOUTH, EAST
    }
}
