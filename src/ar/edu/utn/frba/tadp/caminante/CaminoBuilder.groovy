package ar.edu.utn.frba.tadp.caminante

import java.awt.Point

class CaminoBuilder {
	def camino = []
	Punto puntoActual = new Punto()
		
	def methodMissing(String name, args)  {
		if(name in ["x", "y"]){
			puntoActual."$name" = args[0]
			if(puntoActual.isCompleted()){
				camino.add(puntoActual)
				puntoActual = new Punto()
			}
			this
		} else {
			throw new MissingMethodException(name, this.class, args)
		}
	}
	
	def build(){
		return camino
	}
}
