package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration//configuration done
public class PetConfigurationClass {

	@Bean(name = "dog")
	public Dog getDog() {
		return new Dog();
	}
	@Bean(name = "cat")
	public Cat getCat() {
		return new  Cat();
	}
	
	@Bean(name = "pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Bittu");
		pet.setAnimal(getDog());//Will not create another object instead sends the same object.....
		return pet;
	}
}
