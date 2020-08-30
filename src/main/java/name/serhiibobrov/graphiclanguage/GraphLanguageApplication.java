package name.serhiibobrov.graphiclanguage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import name.serhiibobrov.graphiclanguage.command.LinePainter;
import name.serhiibobrov.graphiclanguage.command.PenCleanCommand;
import name.serhiibobrov.graphiclanguage.command.PenPuttingCommand;
import name.serhiibobrov.graphiclanguage.command.PenSelectorCommand;
import name.serhiibobrov.graphiclanguage.painter.JavaFxPainter;
import name.serhiibobrov.graphiclanguage.painter.PenFactory;
import name.serhiibobrov.graphiclanguage.supplier.SimpleCommandSupplier;
import java.util.HashMap;
import static name.serhiibobrov.graphiclanguage.command.LinePainter.Direction.*;

public class GraphLanguageApplication extends Application {

    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private static final Group root = new Group();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.BLACK);
        stage.setScene(scene);

        stage.show();

        startApplication();
    }

    private static void startApplication() {
        var commands = new HashMap<Lexeme, Command>();

        commands.put(Lexeme.P, new PenSelectorCommand(new PenFactory()));
        commands.put(Lexeme.D, new PenPuttingCommand());
        commands.put(Lexeme.W, new LinePainter(WEST));
        commands.put(Lexeme.N, new LinePainter(NORTH));
        commands.put(Lexeme.E, new LinePainter(EAST));
        commands.put(Lexeme.S, new LinePainter(SOUTH));
        commands.put(Lexeme.U, new PenCleanCommand());

        var painter = new JavaFxPainter(root);

        var context = new GraphicContext(painter);
        var runner = new CommandRunner(commands, new SimpleCommandSupplier(), context);

        runner.run();
    }
}
