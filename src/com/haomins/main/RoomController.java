package com.haomins.main;

import com.haomins.main.controller.Controller;
import com.haomins.main.controller.Event;

public class RoomController extends Controller {

    private boolean light;

    public class LightOn extends Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "light is ON" + "\n";
        }
    }

    public class LightOff extends Event {

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "light is OFF" + "\n";
        }
    }

    public class Clock extends Event {

        public Clock(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Clock(delayTime));
        }

        @Override
        public String toString() {
            return "DING" + "\n";
        }
    }

    public class RestartEvent extends Event {

        private Event[] events;

        public RestartEvent(long delayTime, Event[] events) {
            super(delayTime);
            this.events = events;
            for (Event e : events) {
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event e : events) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "RESTARTING" + "\n";
        }
    }

    public static class Terminate extends Event {

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "TERMINATED" + "\n";
        }
    }
}
