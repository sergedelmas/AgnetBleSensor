package com.delmass.agnetblesensor;

import java.util.HashMap;

/**
 * GATT attributes utility class
 */
public class GattAttributes {

    private static HashMap<String, String> attributes = new HashMap();

    // UUID
    public static String UUID_SERVICE_HEART_RATE = "0000180d-0000-1000-8000-00805f9b34fb";
    public static String UUID_SERVICE_DEVICE_INFO = "0000180a-0000-1000-8000-00805f9b34fb";
    public static String UUID_CHAR_HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String UUID_CHAR_MANUFACTER_NAME = "00002a29-0000-1000-8000-00805f9b34fb";
    public static String UUID_CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        // Services.
        attributes.put(UUID_SERVICE_HEART_RATE, "Heart Rate Service");
        attributes.put(UUID_SERVICE_DEVICE_INFO, "Device Information Service");
        // Characteristics.
        attributes.put(UUID_CHAR_HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put(UUID_CHAR_MANUFACTER_NAME, "Manufacturer Name String");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
