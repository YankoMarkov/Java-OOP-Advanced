package cresla.repositories;

import cresla.interfaces.Identifiable;
import cresla.interfaces.Reactor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hristo Skipernov on 09/05/2017.
 */
public class ReactorRepository implements Repository {
    private Map<Integer, Reactor> reactors;
    private Map<Integer, Identifiable> identifiables;

    public ReactorRepository() {
        this.reactors = new HashMap<>();
        this.identifiables = new HashMap<>();
    }

    @Override
    public void addReactor(Reactor reactor) {
        this.reactors.put(reactor.getId(), reactor);
    }

    @Override
    public void addIdentifiable(Identifiable identifiable) { this.identifiables.put(identifiable.getId(), identifiable); }

    @Override
    public Map<Integer, Reactor> getReactors() {
        return Collections.unmodifiableMap(this.reactors);
    }

    @Override
    public Map<Integer, Identifiable> getIdentifiables() {
        return Collections.unmodifiableMap(this.identifiables);
    }

    @Override
    public Reactor getReactorById(int id) {
        return this.reactors.get(id);
    }

    @Override
    public Identifiable getIdentifiableById(int id) {
        return this.identifiables.get(id);
    }
}