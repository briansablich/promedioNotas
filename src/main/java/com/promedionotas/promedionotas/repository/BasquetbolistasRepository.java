
package com.promedionotas.promedionotas.repository;

import com.promedionotas.promedionotas.model.Basquetbolistas;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class BasquetbolistasRepository implements IBasquetbolistasRepository{

    @Override
    public void altaLogica(ArrayList<Basquetbolistas> listaBasquetbolistas) {
        System.out.println("Alta en BBDD dada");
    }

    @Override
    public double promedioAltura(ArrayList<Basquetbolistas> listaBasquetbolistas) {
        //busca en bbdd las alturas
        System.out.println("Busca en la BBDD las alturas y la devuelve a service");
        return 2.3D;
    }

}
