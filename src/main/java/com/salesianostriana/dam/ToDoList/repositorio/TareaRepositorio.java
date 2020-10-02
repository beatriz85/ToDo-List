package com.salesianostriana.dam.ToDoList.repositorio;

import com.salesianostriana.dam.ToDoList.modelo.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TareaRepositorio
        extends JpaRepository<Tareas, Long > {
}
