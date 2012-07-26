package ar.edu.utn.frba.tadp.caminante

import groovy.transform.EqualsAndHashCode

//Magia groovy
@EqualsAndHashCode(includeFields=true)
class Punto {
	def x
	def y

	def isCompleted(){
		return x != null && y != null
	}
	
	def distanciaA(otroPunto){
		return Math.sqrt((otroPunto.x-this.x)**2 + (otroPunto.y-this.y)**2)
	}
}
