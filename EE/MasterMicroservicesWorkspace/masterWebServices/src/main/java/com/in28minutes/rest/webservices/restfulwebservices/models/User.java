package com.in28minutes.rest.webservices.restfulwebservices.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

//Anotação pra ser utilizada junta com o swagger para mostrar a descrição da model do USER
@ApiModel(description="Essa descrição foi criada para o swagger dentro da model usuario")
@Data
@Entity
public class User {
	
	public User() {}
	
	
	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=2,message="O nome deve conter pelo menos 2 caracteres, esta mensagem esta no model User")
	@ApiModelProperty(notes="Tem que ter no minimo dois caracteres, foi criado dentro do model user para o swagger")
	private String name;
	
	
	@Past
	@ApiModelProperty(notes="O ano de aniversario não pode estar no futuro, foi criado dentro do model user para o swagger")
	private Date birthDate;
	
	@OneToMany(mappedBy = "user")
	private List<Post> posts;

}
