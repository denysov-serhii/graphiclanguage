package name.serhiibobrov.graphiclanguage;

import name.serhiibobrov.graphiclanguage.command.LinePainter.Direction;
import name.serhiibobrov.graphiclanguage.painter.Pen;

public interface Painter {
    void putPen(Pen pen);
    void putAwayPen();
    void paintLine(Direction direction, double length);
}
