package com.codurance.mars_rover;

public class Rover {
  public static final String DELIMITER = ":";
  private final Position position;

  public Rover(int x, int y, String direction) {
    this.position = new Position(x, y, direction);
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
    position.setDirection(Direction.valueOf(position.getDirection()).getLeft());
  }

  private void rotateRight() {
    position.setDirection(Direction.valueOf(position.getDirection()).getRight());
  }

  private String lastPosition() {
    return position.getX() + DELIMITER + position.getY() + DELIMITER + position.getDirection();
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
