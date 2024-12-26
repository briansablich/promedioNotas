
package com.promedionotas.promedionotas.controller;

import com.promedionotas.promedionotas.model.Basquetbolistas;
import com.promedionotas.promedionotas.service.BasquetbolistasService;
import com.promedionotas.promedionotas.service.IBasquetbolistasService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasquetbolistasController {
    
    private final IBasquetbolistasService IBS;

    @Autowired
    public BasquetbolistasController(IBasquetbolistasService IBS) {
        this.IBS = IBS;
    }
    

    @PostMapping("/alturapromedio")
    public String alturaPromedio(@RequestBody ArrayList<Basquetbolistas> listaBasquetbolistas){
        IBS.altaLogica(listaBasquetbolistas);
        return "El promedio de altura es: " + IBS.promedioAltura(listaBasquetbolistas);
        
    }
}
