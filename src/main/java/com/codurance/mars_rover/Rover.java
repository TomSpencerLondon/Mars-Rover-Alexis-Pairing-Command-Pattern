package com.codurance.mars_rover;

public class Rover {
  private int x;
  private int y;
  private String direction;
  private final String[] directions = new String[]{"N", "W", "S", "E"};

  public Rover(int x, int y, String direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public String execute(String commands) {
    String[] commandsArray = commands.split("");
    int count = 0;
    for (String c : commandsArray) {
      count = rotateLeft(count, c);
    }

    return x + ":" + y + ":" + direction;
  }

  private int rotateLeft(int count, String command) {
    if (command.equals("L")) {
      direction = directions[++count % 4];
    }
    return count;
  }
}
