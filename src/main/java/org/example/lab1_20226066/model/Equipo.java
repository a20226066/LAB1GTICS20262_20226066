package org.example.lab1_20226066.model;

import java.time.LocalDate;

public class Equipo {
    private String nombreEquipo;
    private String tipoEquipo;
    private Integer codigo;
    private LocalDate fecha;

    public Equipo() {}

    public Equipo(String nombreEquipo, String tipoEquipo, Integer codigo, LocalDate fecha) {
        this.nombreEquipo = nombreEquipo;
        this.tipoEquipo = tipoEquipo;
        this.codigo = codigo;
        this.fecha = fecha;
    }


    public String getNombreEquipo() { return nombreEquipo; }
    public void setId(String id) { this.nombreEquipo = nombreEquipo; }
    public String getTipoEquipo() { return tipoEquipo; }
    public void setName(String name) { this.tipoEquipo = tipoEquipo; }
    public Integer getCodigo() { return codigo; }
    public void setCategory(String codigo) { this.codigo = codigo; }
    public LocalDate getFecha() { return fecha; }
    public void setPrice(Double fecha) { this.fecha = fecha; }

}
























