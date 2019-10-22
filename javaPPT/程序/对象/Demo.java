package demo;

import model.Animal;
import model.Cat;
import model.Dog;
import model.Person;

public class Demo {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setName("¹þÊ¿Ææ");
		dinner(dog);
				
		Cat cat=new Cat();
		cat.setName("hello ketty");
		dinner(cat);
		
		Animal animal=new Cat();
		if(cat instanceof Animal){
			System.out.println("true");
		}else{
			System.out.println("f");
		}
	}
	
	
	public static void dinner(Animal an){
		an.eat();
	}
}
