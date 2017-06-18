package ar.com.caeycae;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by christianengler on 16/06/17.
 */
@RestController
@Api(value="Emplados", description="Operaciones sobre empleados")
public class TestController {

    @RequestMapping(value = "/empleado/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Empleado empleado(final @PathVariable("id") String id)
    {
        Empleado e = new Empleado();
        e.setApellido("Engler");
        e.setNombre("Chrsitan");
        return e;
    }
}
