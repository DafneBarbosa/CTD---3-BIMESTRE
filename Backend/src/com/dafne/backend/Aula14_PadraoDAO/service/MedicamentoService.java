package com.dafne.backend.Aula14_PadraoDAO.service;

import com.dafne.backend.Aula14_PadraoDAO.dao.IDao;
import com.dafne.backend.Aula14_PadraoDAO.model.Medicamento;

public class MedicamentoService {

    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public Medicamento salvar(Medicamento medicamento){
        return medicamentoIDao.salvar(medicamento);
    }


}
