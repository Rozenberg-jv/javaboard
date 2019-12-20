package by.kolbun.edu.jv.javaboard.dto;

import by.kolbun.edu.jv.javaboard.model.Color;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
public class ExampleEntityDto {

	private Long id;

	private String name;

	private Color color;

}
