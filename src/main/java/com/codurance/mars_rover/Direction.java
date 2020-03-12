package com.codurance.mars_rover;

enum Direction {
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
