package com.editsoft.player.manager;

public interface Message {
    void runMessage();
    void polledFromQueue();
    void messageFinished();
}
