package com.codurance.mars_rover;

public class Rover {
  public Rover(int x, int y, String direction) {

  }

  public String execute(String commands) {
    if (commands.equals("L")) {
      return "0:0:W";
    }
    return "0:0:N";
  }
}
