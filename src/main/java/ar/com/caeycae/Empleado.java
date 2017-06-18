package ar.com.caeycae;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by christianengler on 16/06/17.
 */
@ApiModel(value="Empleado")
public class Empleado {

    @ApiModelProperty(notes = "El nombre del empleado")
    private String nombre;

    @ApiModelProperty(notes = "El apellido del empleado")
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
