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

            CommandFactory commandFactory = new CommandFactory();
            Command command = commandFactory.create(c);
            command.execute(position);

//            if (c.equals("L")) {
//                new RotateLeftCommand().execute(position);
//            }
//
//            if (c.equals("R")) {
//                new RotateRightCommand().execute(position);
//            }
        }

        return lastPosition();
    }

    private String lastPosition() {
        return position.getX() + DELIMITER + position.getY() + DELIMITER + position.getDirection();
    }

}
