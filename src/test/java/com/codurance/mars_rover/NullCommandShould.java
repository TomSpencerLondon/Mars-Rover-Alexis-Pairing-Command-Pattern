package com.codurance.mars_rover;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NullCommandShould {

  @Test
  void do_nothing() {
    Position position = new Position(0, 0, "N");
    NullCommand nullCommand = new NullCommand();
    nullCommand.execute(position);
    assertEquals("N", position.getDirection());
  }

}
