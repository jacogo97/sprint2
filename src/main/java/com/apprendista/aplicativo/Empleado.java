package com.apprendista.aplicativo;

public class Empleado {

    private String nombreEmpleado;
    private String correo;
    private Empresa empresa;
    private String rol;

    public Empleado(String nombreEmpleado, String correo, Empresa empresa, String rol) {
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }


    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
