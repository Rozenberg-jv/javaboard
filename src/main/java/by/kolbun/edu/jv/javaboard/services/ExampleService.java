package by.kolbun.edu.jv.javaboard.services;

import by.kolbun.edu.jv.javaboard.dto.ExampleEntityDto;
import by.kolbun.edu.jv.javaboard.model.ExampleEntity;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

	public ExampleEntityDto renderExampleEntityDto(ExampleEntity exampleEntity) {

		return new ExampleEntityDto(exampleEntity.getId(), exampleEntity.getName(), exampleEntity.getColor());
	}

}
