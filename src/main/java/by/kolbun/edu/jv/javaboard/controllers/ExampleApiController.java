package by.kolbun.edu.jv.javaboard.controllers;

import by.kolbun.edu.jv.javaboard.dto.ExampleEntityDto;
import by.kolbun.edu.jv.javaboard.model.ExampleEntity;
import by.kolbun.edu.jv.javaboard.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/example")
public class ExampleApiController {

	private final ExampleService exampleService;

	@Autowired
	public ExampleApiController(ExampleService exampleService) {

		this.exampleService = exampleService;
	}

	@PostMapping("/ex")
	public ResponseEntity<ExampleEntityDto> exampleEndpoint(@RequestBody ExampleEntity exampleEntity) {

		System.out.println(exampleEntity);

		return ResponseEntity.ok().header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).body(exampleService.renderExampleEntityDto(exampleEntity));
	}
}
