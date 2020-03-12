package com.codurance.mars_rover;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverShould {

  @Test
  public void empty_string_returns_starting_position() {
    Rover rover = new Rover(0, 0, "N");
    String result = rover.execute("");
    assertEquals("0:0:N", result);
  }

  @Test
  void empty_string_returns_specific_starting_position() {
    Rover rover = new Rover(1, 1, "W");
    String result = rover.execute("");
    assertEquals("1:1:W", result);
  }

  @ParameterizedTest
  @CsvSource({
          "L, 0:0:W"
  })
  public void rotate_left(String instructions, String position) {
    Rover rover = new Rover(0, 0, "N");
    String result = rover.execute(instructions);

    assertEquals(position, result);
  }
}
