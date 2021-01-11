package br.com.demo.forum.controller;

import br.com.demo.forum.controller.dto.TopicoDto;
import br.com.demo.forum.modelo.Curso;
import br.com.demo.forum.modelo.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {
    @RequestMapping("/topicos")
    @ResponseBody
    public List<TopicoDto> Lista() {
        Topico topico = new Topico("Dúvida", "Dúvida em String", new Curso("Spring", "Programação"));
        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}

