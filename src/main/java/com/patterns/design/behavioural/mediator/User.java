package com.patterns.design.behavioural.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {

    private String name;

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
