package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration//configuration done
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {

	@Bean(name = "hello")//bean creation done
	//@Scope("prototype")//scoping done
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I LOVE U");
		return hello;
	}
	 
}
