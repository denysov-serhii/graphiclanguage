package name.serhiibobrov.graphiclanguage;

import java.util.Map;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandRunner {

    private final Map<Lexeme, Command> commandMap;
    private final CommandSupplier commandSupplier;
    private final GraphicContext context;

    public void run() {
        while (commandSupplier.hasNext()) {
            var nextCommand = commandSupplier.nextCommand();

            System.out.println("next command is " + nextCommand);

            commandMap.get(nextCommand.getLexeme()).run(context, nextCommand.getArgs());
        }
    }
}
