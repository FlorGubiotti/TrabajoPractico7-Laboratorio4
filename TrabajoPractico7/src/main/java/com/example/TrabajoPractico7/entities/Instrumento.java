package com.example.TrabajoPractico7.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "instrumento")
public class Instrumento extends BaseEntity{

    private String instrumento;
    private String marca;
    private String modelo;
    private String imagen;
    private double precio;
    private String costoEnvio;
    private int cantidadVendida;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    @JsonIgnoreProperties("instrumentos")
    private Categoria categoria;

    @OneToMany(mappedBy = "instrumento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default //Builder no sobreescribe la inicializacion de la lista
    @JsonIgnoreProperties("instrumento")
    private List<DetallePedido> detallePedidos = new ArrayList<>();
}
