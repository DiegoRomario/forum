package br.com.demo.forum.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class HelloController implements ErrorController {

	@Override
	public String getErrorPath() {
		return "/error";
	}

	@RequestMapping("/error")
	public void handleErrorWithRedirect(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui.html");
	}

	@RequestMapping(value = "/")
	public void redirect(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui.html");
	}

}