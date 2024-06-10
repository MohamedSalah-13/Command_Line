package com.hamza.shell.commands;

import com.hamza.shell.client.DadJokeClient;
import com.hamza.shell.model.DadJokeResponse;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class DadJokeCommands {

    private final DadJokeClient dadJokeClient;

    public DadJokeCommands(DadJokeClient dadJokeClient) {
        this.dadJokeClient = dadJokeClient;
    }

    @ShellMethod(key = "random", value = "I will return a random dad joke!")
    public String getRandomDadJoke() {
        DadJokeResponse client = dadJokeClient.random();
        return client.joke();
    }
}
