package com.salesianostriana.dam.ToDoList.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tareas {

    @Id
    @GeneratedValue
    private long ID;
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaCaducidad;

}
