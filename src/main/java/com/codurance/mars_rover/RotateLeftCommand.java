package com.codurance.mars_rover;

public class RotateLeftCommand implements Command {

    public void execute(Position position) {
        position.rotateLeft();
    }
}
