package com.dafne.backend.Aula14_exemploPG.dao.impl;

import com.dafne.backend.Aula14_exemploPG.dao.IDao;
import com.dafne.backend.Aula14_exemploPG.model.Estudante;

import java.util.List;

public class EstudanteDaoEmMemoria implements IDao<Estudante> {
    private List<Estudante> estudanteRepositorio;

    public EstudanteDaoEmMemoria(List<Estudante> estudanteRepositorio) {
        this.estudanteRepositorio = estudanteRepositorio;
    }

    @Override
    public Estudante salvar(Estudante estudante) {
        estudanteRepositorio.add(estudante);
        return estudante;
    }

    @Override
    public void eliminar(String id) {
        estudanteRepositorio.removeIf(estudante -> estudante.getId().equals(id));
    }

    //Utilizamos streams para buscar uma matéria por id, y tomamos el primero si hay, si no, devolvemos null.
    @Override
    public Estudante buscar(String id) {
        return estudanteRepositorio.stream().filter(estudante -> estudante.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Estudante> buscarTodos() {
        return estudanteRepositorio;
    }
}
