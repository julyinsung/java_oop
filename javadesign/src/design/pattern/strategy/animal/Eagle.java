package design.pattern.strategy.animal;

import design.pattern.strategy.cry.BirdCry;
import design.pattern.strategy.fly.FlyWithWings;

public class Eagle extends Animal {
	
	public Eagle(){
		
		cry = new BirdCry();
		
		fly = new FlyWithWings();
	}
	
	public void display(){
		
		System.out.println("독수리");
	}

}
