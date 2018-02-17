package interfaces;

import interfaces.observers.ObservableTarget;

public interface Attacker {
    void attack();
    void setTarget(ObservableTarget target);
}
