package name.serhiibobrov.graphiclanguage.command;

import lombok.RequiredArgsConstructor;
import name.serhiibobrov.graphiclanguage.Command;
import name.serhiibobrov.graphiclanguage.GraphicContext;
import name.serhiibobrov.graphiclanguage.painter.PenFactory;

@RequiredArgsConstructor
public class PenSelectorCommand implements Command {

    public static final int NUMBER_OF_PEN_ARGUMENT_INDEX = 0;
    private final PenFactory penFactory;

    @Override
    public void run(GraphicContext context, String... args) {
        int indexPen = Integer.parseInt(args[NUMBER_OF_PEN_ARGUMENT_INDEX]);
        context.setCurrentPen(penFactory.getPen(indexPen));
    }
}
