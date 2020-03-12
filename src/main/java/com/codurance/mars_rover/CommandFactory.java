package com.codurance.mars_rover;

public class CommandFactory {

    public Command create(String type) {
        if (type.equals("L")) {
            return new RotateLeftCommand();
        }
        if (type.equals("R")) {
            return new RotateRightCommand();
        }
        return new NullCommand();
    }
}
