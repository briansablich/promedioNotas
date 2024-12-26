
package com.promedionotas.promedionotas.service;

import com.promedionotas.promedionotas.model.Basquetbolistas;
import com.promedionotas.promedionotas.repository.IBasquetbolistasRepository;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class BasquetbolistasService implements IBasquetbolistasService {
    
    private final IBasquetbolistasRepository IBR;

    public BasquetbolistasService(IBasquetbolistasRepository IBR) {
        this.IBR = IBR;
    }

    @Override
    public void altaLogica(ArrayList<Basquetbolistas> listaBasquetbolistas) {
        System.out.println("Enviando a repository la lista:");
        for(Basquetbolistas b : listaBasquetbolistas){
            System.out.println(b.toString());
        }
        IBR.altaLogica(listaBasquetbolistas);
    }

    @Override
    public double promedioAltura(ArrayList<Basquetbolistas> listaBasquetbolistas) {
        double suma = 0;
        for (Basquetbolistas b : listaBasquetbolistas){
            suma += b.getEstatura();
        }
        IBR.promedioAltura(listaBasquetbolistas);
        return suma / listaBasquetbolistas.size();
    }

}
