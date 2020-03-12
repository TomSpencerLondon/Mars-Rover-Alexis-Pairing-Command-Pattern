package com.codurance.mars_rover;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RotateRightCommandShould {

  @Test
  void execute_and_call_rotate_right_on_position() {
    Position position = new Position(0, 0, "N");
    RotateRightCommand rotateRightCommand = new RotateRightCommand();
    rotateRightCommand.execute(position);
    assertEquals("E", position.getDirection());
  }

}
