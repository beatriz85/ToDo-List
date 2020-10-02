package com.salesianostriana.dam.ToDoList.controlador;

import com.salesianostriana.dam.ToDoList.modelo.Tareas;
import com.salesianostriana.dam.ToDoList.servicio.TareaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor

public class TareaControlador {

    private final TareaServicio tareaServicio;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("lista", tareaServicio.findAll());

        return "index";



    }
    @GetMapping ("/new")
    public String showFormNewProduct (Model model){
        model.addAttribute("tareas", new Tareas());
        return "tareas/formulario";
    }

}
