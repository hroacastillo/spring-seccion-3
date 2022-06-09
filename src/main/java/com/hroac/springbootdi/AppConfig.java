package com.hroac.springbootdi;

import com.hroac.springbootdi.model.domain.ItemFactura;
import com.hroac.springbootdi.model.domain.Producto;
import com.hroac.springbootdi.model.service.IServicio;
import com.hroac.springbootdi.model.service.MiServicio;
import com.hroac.springbootdi.model.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    @Primary
    public IServicio registrarMiServicio() {
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo() {
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){

        Producto producto1 = new Producto("Camara Sony", 100.0);
        Producto producto2 = new Producto("Bicicleta Sony", 200.0);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1,linea2);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){

        Producto producto1 = new Producto("Monitor LG", 250.0);
        Producto producto2 = new Producto("Notebook ASUS", 500.0);
        Producto producto3 = new Producto("Impresora HP Multifuncional", 80.0);
        Producto producto4 = new Producto("Escritorio Oficina", 300.0);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 1);
        ItemFactura linea3 = new ItemFactura(producto3, 1);
        ItemFactura linea4 = new ItemFactura(producto4, 1);

        return Arrays.asList(linea1,linea2,linea3,linea4);
    }

}
