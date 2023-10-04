package com.tup.buensabor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Table(name = "receta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Receta extends Base{

    @NotNull
    @Column(name = "numero")
    private int numReceta;

    @NotNull
    @Column(name = "descripcion")
    private String descripcionReceta;

    @NotNull
    @Column(name = "nombre")
    private String nombreReceta;

    @NotNull
    @Column(name = "instruccion")
    private String instruccion;

    @Column(name = "duracion")
    @Temporal(TemporalType.TIMESTAMP)
    private double duracionreceta;

    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBajaReceta;

    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAltaReceta;
}