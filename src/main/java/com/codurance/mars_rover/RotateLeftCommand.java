package com.codurance.mars_rover;

public class RotateLeftCommand {
  public RotateLeftCommand() {
  }

  public void execute(Position position) {
    position.rotateLeft();
  }
}
