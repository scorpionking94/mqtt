package com.swap.MQTT_publisher.model;


/**
 * Created by Swapnil.Khandizod on 28-02-2019.
 */

public class Payload {
  private String device;
  private String action;

  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  @Override
  public String toString() {
    return "{" +
        "device='" + device + '\'' +
        ", action='" + action + '\'' +
        '}';
  }
}
