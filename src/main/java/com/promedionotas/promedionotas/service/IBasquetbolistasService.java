package com.promedionotas.promedionotas.service;

import com.promedionotas.promedionotas.model.Basquetbolistas;
import java.util.ArrayList;

public interface IBasquetbolistasService {
    public void altaLogica(ArrayList<Basquetbolistas> listaBasquetbolistas);
    public double promedioAltura(ArrayList<Basquetbolistas> listaBasquetbolistas);
}
