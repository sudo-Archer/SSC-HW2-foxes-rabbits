package io.muic.ooc.fab.view;

import io.muic.ooc.fab.Field;

public class SimulatorViewObserver extends Observer {

    private SimulatorView view;

    public SimulatorViewObserver(SimulatorView view) {
        this.view = view;
    }

    @Override
    public void update(int step, Field field) {
        view.showStatus(step, field);

    }
}
