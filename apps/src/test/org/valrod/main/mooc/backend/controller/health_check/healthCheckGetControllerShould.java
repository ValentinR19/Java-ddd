package org.valrod.main.mooc.controller.health_check;



import org.junit.jupiter.api.Test;
import org.valrod.main.RequestTestCase;

final class healthCheckGetControllerShould extends RequestTestCase {

    @Test
    void check_health_check_is_working() throws Exception{
        assertResponse  ("/health-check",200,"{'status': 'ok'}");
    }

}