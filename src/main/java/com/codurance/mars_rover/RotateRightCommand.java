package com.codurance.mars_rover;

public class RotateRightCommand implements Command {

    public void execute(Position position) {
        position.rotateRight();
    }
}
