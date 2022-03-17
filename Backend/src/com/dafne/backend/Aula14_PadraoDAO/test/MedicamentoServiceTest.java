package com.dafne.backend.Aula14_PadraoDAO.test;

import com.dafne.backend.Aula14_PadraoDAO.dao.ConfigJDBC;
import com.dafne.backend.Aula14_PadraoDAO.dao.impl.MedicamentoDaoH2;
import com.dafne.backend.Aula14_PadraoDAO.model.Medicamento;
import com.dafne.backend.Aula14_PadraoDAO.service.MedicamentoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicamentoServiceTest {

    @Test
    public void teste(){
        Medicamento medicamento1 = new Medicamento(2, "Alegra", "xxx", 32.50);
        Medicamento medicamento2 = new Medicamento(15, "Neosaldina", "zzz", 8.90);

        MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDaoH2(new ConfigJDBC()));
        medicamentoService.salvar(medicamento1);
    }

}