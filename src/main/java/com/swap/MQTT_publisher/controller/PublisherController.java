package com.swap.MQTT_publisher.controller;

import com.swap.MQTT_publisher.model.Payload;
import com.swap.MQTT_publisher.service.PublisherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
/**
 * Created by Swapnil.Khandizod on 28-02-2019.
 */
@RestController
@RequestMapping("/publish")
public class PublisherController {

  @Autowired
  PublisherService publisherService;

  @ApiOperation(value = "Publish a Mqtt Msg", notes = "Publish Mqtt Msg")
  @PostMapping
  public ResponseEntity<Payload> publishMQTT(
      @Valid @RequestBody Payload payload) {
    return new ResponseEntity<Payload>(publisherService.publish(payload),
        HttpStatus.OK);
  }
}
