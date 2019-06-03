package com.patterns.design.behavioural.visitor;

import java.util.Arrays;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        Arrays.stream(parts).forEach(item->item.accept(computerPartVisitor));
       /* for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }*/
        computerPartVisitor.visit(this);
    }
}
