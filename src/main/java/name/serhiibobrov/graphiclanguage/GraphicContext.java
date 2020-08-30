package name.serhiibobrov.graphiclanguage;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import name.serhiibobrov.graphiclanguage.painter.Pen;

@RequiredArgsConstructor
@Data
public class GraphicContext {
    private Pen currentPen;
    private final Painter painter;
}
