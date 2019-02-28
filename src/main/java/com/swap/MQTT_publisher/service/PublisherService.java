package com.swap.MQTT_publisher.service;

import com.swap.MQTT_publisher.model.Payload;
import javax.validation.Valid;
import org.springframework.stereotype.Service;

/**
 * Created by Swapnil.Khandizod on 28-02-2019.
 */
@Service
public class PublisherService {

  public Payload publish(@Valid Payload payload) {
    MQTT_Publisher.publishMessage(payload);
    return payload;
  }
}
