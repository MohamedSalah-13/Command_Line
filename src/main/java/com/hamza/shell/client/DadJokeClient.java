package com.hamza.shell.client;

import com.hamza.shell.model.DadJokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface DadJokeClient {
    @GetExchange("/")
    DadJokeResponse random();
}
