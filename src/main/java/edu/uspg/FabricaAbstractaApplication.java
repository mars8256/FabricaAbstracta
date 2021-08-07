package edu.uspg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.uspg.factory.AbstractFactory;
import edu.uspg.factory.FactoryProducer;
import edu.uspg.inter.IShape;

@SpringBootApplication
public class FabricaAbstractaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FabricaAbstractaApplication.class, args);
		
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		AbstractFactory shapeFactoryRounded = FactoryProducer.getFactory(true);
		
		IShape rectangulo = shapeFactory.getIShape("RECTANGLE");
		IShape cuadrado = shapeFactory.getIShape("SQUARE");
		
		IShape rectanguloRedondeado = shapeFactoryRounded.getIShape("RECTANGLE");
		IShape cuadradoRedondeado = shapeFactoryRounded.getIShape("SQUARE");
		
		rectangulo.draw();
		cuadrado.draw();
		
		rectanguloRedondeado.draw();
		cuadradoRedondeado.draw();
		
		
	}

}
