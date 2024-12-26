
package com.promedionotas.promedionotas.repository;

import com.promedionotas.promedionotas.model.Basquetbolistas;
import java.util.ArrayList;

public interface IBasquetbolistasRepository {
    public void altaLogica(ArrayList<Basquetbolistas> listaBasquetbolistas);
    public double promedioAltura(ArrayList<Basquetbolistas> listaBasquetbolistas);
}
