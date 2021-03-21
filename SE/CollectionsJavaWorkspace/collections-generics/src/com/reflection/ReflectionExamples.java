package com.reflection;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class classePessoa = Person.class;

		System.out.println("\n Classe");
		System.out.println(classePessoa.getName());
		System.out.println(classePessoa.getPackageName());

		Field[] fields = classePessoa.getFields();

		System.out.println("\n Campos");
		for (Field f : fields) {
			System.out.println(f.getName() + " - " + f.getType());
		}

		Method[] methods = classePessoa.getMethods();

		System.out.println("\nMetodos:");
		for (Method method : methods) {

			if (method.isAnnotationPresent(MinhaAnotacao.class)) {
				System.out.println("Custom annotation esta presente no metodo: " + method.getName());
			} else {
				System.out.println(method.getName() + " . Tipo de retorno:  " + method.getReturnType());
			}

		}

		Field[] campos = classePessoa.getDeclaredFields();

		System.out.println("\n Campos privados e publicos juntos");

		for (Field field : campos) {
			field.setAccessible(true);
			System.out.println(field.getName());
		}

		System.out.println("\n Pegar o super e as interfaces da classe");

		System.out.println(classePessoa.getSuperclass().getName());

		System.out.println("\n Pegar as interfaces");

		Class[] interfaces = classePessoa.getInterfaces();

		for (Class c : interfaces) {
			System.out.println(c.getName());
		}
	}

}

class Empregado {

}

//Para criar minha propria anotação, posso criar com @interface
//Essa anotation Retention é para que a nossa anotação MINHAANOTACAO seja vista pelo reflection
//A anotação Target permite que vc escolha o alvo dessa anotação(Metodos, campos, atributos)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MinhaAnotacao {
	public String nome();
}

//Se os atributos estão privados não conseguiremos pegar com o reflection
class Person extends Empregado implements Comparable<Person>, Serializable {

	public String name;
	private Integer age;
	public int telefone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	// Utilizando a custon annotation

	@MinhaAnotacao(nome = "minhaanotacaoo")
	public String returnName() {
		return this.name + " é o nome.";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
