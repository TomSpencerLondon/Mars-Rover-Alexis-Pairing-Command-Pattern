package com.codurance.mars_rover;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CommandFactoryShould {

    @Test
    public void create_rotate_left_instance() {
        CommandFactory commandFactory = new CommandFactory();
        Command command = commandFactory.create("L");
        assertEquals(RotateLeftCommand.class, command.getClass());
    }

    @Test
    public void create_rotate_right_instance() {
        CommandFactory commandFactory = new CommandFactory();
        Command command = commandFactory.create("R");
        assertEquals(RotateRightCommand.class, command.getClass());
    }

    @Test
    public void create_null_command_on_default() {
        CommandFactory commandFactory = new CommandFactory();
        Command command = commandFactory.create("Dummy");
        assertEquals(NullCommand.class, command.getClass());
    }

}
