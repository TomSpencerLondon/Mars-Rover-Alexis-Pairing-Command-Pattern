package com.codurance.mars_rover;

public class Position {
  private int x;
  private int y;
  private String direction;

  public Position(int x, int y, String direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }


  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public void rotateLeft() {
  }
}