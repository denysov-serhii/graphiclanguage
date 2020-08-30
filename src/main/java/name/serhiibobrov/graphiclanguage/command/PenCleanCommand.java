package name.serhiibobrov.graphiclanguage.command;

import name.serhiibobrov.graphiclanguage.Command;
import name.serhiibobrov.graphiclanguage.GraphicContext;

public class PenCleanCommand implements Command {
    @Override
    public void run(GraphicContext context, String... args) {
        context.getPainter().putAwayPen();
    }
}
