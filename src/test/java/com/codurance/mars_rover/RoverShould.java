package com.codurance.mars_rover;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RoverShould {

  @ParameterizedTest
  @CsvSource({
          "'', 0, 0, N, 0:0:N",
          "'', 1, 1, W, 1:1:W"
  })
  public void empty_string_returns_starting_position(String commands, int x, int y, String direction, String newPosition) {
    Rover rover = new Rover(x, y, direction);
    String result = rover.execute(commands);
    assertEquals(newPosition, result);
  }

  @ParameterizedTest
  @CsvSource({
          "L, 0:0:W",
          "LL, 0:0:S",
          "LLL, 0:0:E",
          "LLLL,0:0:N",
          "LLLLL, 0:0:W"
  })
  public void rotate_left(String instructions, String position) {
    Rover rover = new Rover(0, 0, "N");
    String result = rover.execute(instructions);

    assertEquals(position, result);
  }

  @ParameterizedTest
  @CsvSource({
          "R, 0:0:E",
          "RR, 0:0:S",
          "RRR, 0:0:W",
          "RRRR, 0:0:N"
  })
  public void rotate_right(String instructions, String position) {
    Rover rover = new Rover(0, 0, "N");
    String result = rover.execute(instructions);

    assertEquals(position, result);
  }

  @ParameterizedTest
  @CsvSource({
          "RLRR, 0:0:S"
  })
  public void rotate_left_and_right(String instructions, String position) {
    Rover rover = new Rover(0, 0, "N");
    String result = rover.execute(instructions);

    assertEquals(position, result);
  }

}
