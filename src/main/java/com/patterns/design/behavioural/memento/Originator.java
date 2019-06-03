package com.patterns.design.behavioural.memento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Originator {
    private String state;

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
