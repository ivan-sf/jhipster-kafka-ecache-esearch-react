package com.be4tech.b4collect.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface KafkaSseConsumer {
    String CHANNELNAME = "binding-in-sse";

    @Input(CHANNELNAME)
    MessageChannel input();
}
