package team.unnamed.gui.menu.type;

import net.kyori.adventure.text.Component;

public class DefaultMenuInventoryBuilder
        extends MenuInventoryBuilderLayout<DefaultMenuInventoryBuilder> {

    protected DefaultMenuInventoryBuilder(Component title) {
        super(title);
    }

    protected DefaultMenuInventoryBuilder(Component title, int rows) {
        super(title, rows);
    }

    @Override
    protected DefaultMenuInventoryBuilder back() {
        return this;
    }

}
