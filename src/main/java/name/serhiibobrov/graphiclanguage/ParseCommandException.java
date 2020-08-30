package name.serhiibobrov.graphiclanguage;

public class ParseCommandException extends RuntimeException {
    public ParseCommandException(String commandName) {
        super(String.format("Such command name(%s)  is not supported", commandName));
    }
}
