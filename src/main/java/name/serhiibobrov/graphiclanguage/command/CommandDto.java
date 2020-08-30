package name.serhiibobrov.graphiclanguage.command;

import lombok.Data;
import name.serhiibobrov.graphiclanguage.Lexeme;

@Data
public class CommandDto {
    private final Lexeme lexeme;
    private final String[] args;
}
