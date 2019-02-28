package com.swap.MQTT_publisher.service;

import com.swap.MQTT_publisher.model.Payload;
import java.util.UUID;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MQTT_Publisher {
	 public static void publishMessage(Payload payload) {

         String topic        = "swapnil";
         int qos             = 2;
         String broker       = "tcp://iot.eclipse.org:1883";
         String clientId     = UUID.randomUUID().toString();
         MemoryPersistence persistence = new MemoryPersistence();
         try {
             MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
             MqttConnectOptions connOpts = new MqttConnectOptions();
             connOpts.setCleanSession(true);
             System.out.println("Connecting to broker: "+broker);
             sampleClient.connect(connOpts);
             System.out.println("Connected");
             System.out.println("Publishing message: \n"+payload);
             MqttMessage message = new MqttMessage(payload.toString().getBytes());
             message.setQos(qos);
             sampleClient.publish(topic, message);
             System.out.println("Message published");
             sampleClient.disconnect();
             System.out.println("Disconnected");

             
         } catch(MqttException me) {
             System.out.println("reason "+me.getReasonCode());
             System.out.println("msg "+me.getMessage());
             System.out.println("loc "+me.getLocalizedMessage());
             System.out.println("cause "+me.getCause());
             System.out.println("excep "+me);
             me.printStackTrace();
         }
     }
}
