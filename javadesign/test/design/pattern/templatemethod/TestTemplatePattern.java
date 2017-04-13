package design.pattern.templatemethod;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class TestTemplatePattern {

	@Test
	public void test() {
		Animal tiger = new Tiger("tiger");
//		assertThat("sound value", tiger.sound(), CoreMatchers.is("tiger"));
		
		Animal dog = new Dog();
		assertThat("sound value", dog.sound(), CoreMatchers.is("¸Û"));
	}

}
