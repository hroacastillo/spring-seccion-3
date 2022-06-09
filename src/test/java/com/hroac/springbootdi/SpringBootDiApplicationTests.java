package com.hroac.springbootdi;

import com.hroac.springbootdi.controller.FacturaController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDiApplicationTests {

    @Autowired
    private FacturaController facturaController;

    @Test
    void contextLoads() {
        Assertions.assertThat(facturaController).isNotNull();
    }

}
