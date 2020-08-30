package name.serhiibobrov.graphiclanguage;

import name.serhiibobrov.graphiclanguage.command.CommandDto;

public interface CommandSupplier {
    boolean hasNext();
    CommandDto nextCommand();
}
