package name.serhiibobrov.graphiclanguage;

public interface Command {
    void run(GraphicContext context, String... args);
}
