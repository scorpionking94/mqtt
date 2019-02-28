package com.swap.MQTT_publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MqttPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqttPublisherApplication.class, args);
	}

}
