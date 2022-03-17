package com.dafne.backend.Aula10_Log4j.model;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.platform.commons.function.Try;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();

        Leao leao1 = new Leao("Simba", 4, true);
        Leao leao2 = new Leao("Mufasa", 15, true);
        Leao leao3 = new Leao("Scar", 17, false);

        leao1.correr();
        leao1.ehMaiorQue10();

        leao2.correr();
        leao2.ehMaiorQue10();

        leao3.correr();
        leao3.ehMaiorQue10();




    }
}
