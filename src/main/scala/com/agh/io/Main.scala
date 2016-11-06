package com.agh.io

import com.agh.io.Map.MapLoader
import com.agh.io.Sensor.SensorLoader

object Main extends App {
    val map = new MapLoader().load();
    val sensor = new SensorLoader().load();
    println(map.getPixel(0,0))
    println(sensor.data(0).date)
}