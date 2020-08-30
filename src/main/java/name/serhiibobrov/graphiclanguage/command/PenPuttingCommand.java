package name.serhiibobrov.graphiclanguage.command;

import name.serhiibobrov.graphiclanguage.Command;
import name.serhiibobrov.graphiclanguage.GraphicContext;

public class PenPuttingCommand implements Command {
    @Override
    public void run(GraphicContext context, String... args) {
        context.getPainter().putPen(context.getCurrentPen());
    }
}
