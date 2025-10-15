package com.workshop.controller;

import com.workshop.model.Team;
import com.workshop.service.TeamService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/team")
public class TeamController {
    private TeamService teamService;
    public TeamController(TeamService teamService){
        this.teamService=teamService;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("title", "Listar Equipos");
        model.addAttribute("teams", teamService.findAll());
        return "team/list";
    }

    @GetMapping("/lop")
    public String pdf(Model model){
        return "lop";
    }

    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("title", "Equipo");
        model.addAttribute("team", new Team());
        return "team/create";
    }

    @GetMapping("/show/{id}")
    public String show(@PathVariable long id, Model model){
        if (!teamService.findById(id).isPresent())
            return "redirect:/";
        model.addAttribute("title", "Detalles de Equipo");
        model.addAttribute("team", teamService.findById(id).get());
        return "team/show";
    }

    @PostMapping("/save")
    public String save(@Valid  @ModelAttribute("team") Team team, BindingResult result,Model model){
        if(result.hasErrors()){
            model.addAttribute("title", "Crear");
            return "team/create";
        }
        teamService.createTeam(team);
        return "team/succes";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable long id, Model model){
        teamService.deleteById(id);
        return "redirect:/";
    }
}
