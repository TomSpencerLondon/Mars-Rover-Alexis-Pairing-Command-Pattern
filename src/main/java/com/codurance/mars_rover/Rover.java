package com.codurance.mars_rover;

public class Rover {

    public static final String DELIMITER = ":";
    private final Position position;
    private CommandFactory commandFactory;

    public Rover(int x, int y, String direction) {
        this.position = new Position(x, y, direction);
        commandFactory = new CommandFactory();
    }

    public String execute(String commands) {
        String[] commandsArray = commands.split("");
        for (String c : commandsArray) {
            commandFactory.create(c).execute(position);
        }

        return lastPosition();
    }

    private String lastPosition() {
        return position.getX() + DELIMITER + position.getY() + DELIMITER + position.getDirection();
    }

}
