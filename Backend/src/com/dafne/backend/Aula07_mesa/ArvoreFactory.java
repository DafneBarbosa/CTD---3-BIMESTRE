package com.dafne.backend.Aula07_mesa;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ArvoreFactory {

    private static Map<String, Arvore> ARVORE_MAP    = new HashMap<>();

    public static Arvore getArvore(String tipoArvore){
        Arvore arvore = ARVORE_MAP.get(tipoArvore);

        if(Objects.isNull(arvore)){
            arvore = new Arvore(tipoArvore);
            ARVORE_MAP.put(tipoArvore, arvore);
            //System.out.println("Criando um objeto Arvore tipo: "+tipoArvore);
            return arvore;
        }

        //System.out.println("Recuperando objeto Arvore tipo: "+tipoArvore);
        return arvore;
    }
}
