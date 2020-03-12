package com.codurance.mars_rover;

public class Rover {
  public static final String DELIMITER = ":";
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
    for (String c : commandsArray) {
      if (c.equals("L")) {
        rotateLeft();
      }

      if (c.equals("R")) {
        rotateRight();
      }
    }

    return lastPosition();
  }

  private void rotateLeft() {
    direction = Direction.valueOf(direction).getLeft();
  }

  private void rotateRight() {
    direction = Direction.valueOf(direction).getRight();
  }

  private String lastPosition() {
    return x + DELIMITER + y + DELIMITER + direction;
  }

  private enum Direction {

    N("W", "E"),
    W("S", "N"),
    S("E", "W"),
    E("N", "S");


    private final String left;
    private final String right;

    Direction(String left, String right) {
      this.left = left;
      this.right = right;
    }

    public String getLeft() {
      return left;
    }

    public String getRight() {
      return right;
    }
  }
}
