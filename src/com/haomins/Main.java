package com.haomins;

import com.haomins.main.RoomController;
import com.haomins.main.controller.Event;

public class Main {

    public static void main(String[] args) {
        RoomController roomController = new RoomController();
        roomController.addEvent(roomController.new Clock(200));
        Event [] events = {
            roomController.new LightOn(100),
            roomController.new LightOff(100),
            roomController.new LightOn(100),
            roomController.new LightOff(100),
        };
        roomController.addEvent(roomController.new RestartEvent(7750, events));
        if(args.length == 1)
            roomController.addEvent(
                new RoomController.Terminate(
                    new Integer(args[0])));
        roomController.run();
    }
}