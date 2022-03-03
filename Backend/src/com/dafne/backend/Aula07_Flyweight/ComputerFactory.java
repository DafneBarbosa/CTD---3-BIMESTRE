package com.dafne.backend.Aula07_Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {

    private static Map<String, Computer> macFlyweight = new HashMap<>();

    public static Computer getComputer(String tipo){
        Computer computador = (Computer) macFlyweight.get(tipo);
        return null;
    }
}
