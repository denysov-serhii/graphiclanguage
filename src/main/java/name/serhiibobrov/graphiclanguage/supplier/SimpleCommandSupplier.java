package name.serhiibobrov.graphiclanguage.supplier;

import name.serhiibobrov.graphiclanguage.CommandSupplier;
import name.serhiibobrov.graphiclanguage.Lexeme;
import name.serhiibobrov.graphiclanguage.command.CommandDto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleCommandSupplier implements CommandSupplier {

    private final List<CommandDto> commands = new ArrayList<>();
    private final Iterator<CommandDto> iterator;

    public SimpleCommandSupplier() {
        commands.add(new CommandDto(Lexeme.P, new String[] {"2"}));
        commands.add(new CommandDto(Lexeme.D, new String[] {}));
        commands.add(new CommandDto(Lexeme.W, new String[] {"200"}));
        commands.add(new CommandDto(Lexeme.N, new String[] {"200"}));
        commands.add(new CommandDto(Lexeme.E, new String[] {"200"}));
        commands.add(new CommandDto(Lexeme.S, new String[] {"200"}));
        commands.add(new CommandDto(Lexeme.U, new String[] {}));

        iterator = commands.iterator();
    }


    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public CommandDto nextCommand() {
        return iterator.next();
    }
}
