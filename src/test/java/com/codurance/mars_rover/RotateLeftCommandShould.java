package com.codurance.mars_rover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateLeftCommandShould {

  @Test
  void execute_and_call_rotate_left_on_position() {
    Position position = new Position(0, 0, "N");
    RotateLeftCommand rotateLeftCommand = new RotateLeftCommand();
    rotateLeftCommand.execute(position);
    assertEquals("W", position.getDirection());
  }
}
