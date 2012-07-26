package ar.edu.utn.frba.tadp.caminante

class Recorrido {
	def camino
	def sentido
	
	def pasos
	
	def recorre(unCaminante){
		def caminoFinal = this."$sentido"(camino)
		
		def pasoActual = 0;
		
		caminoFinal.each {
			if(pasos<=pasoActual) return
			this.daUnPaso(unCaminante, it)
			pasoActual++
		}
	}
	
	def adelante(unCamino){
		return camino;
	}
	
	def atras(unCamino){
		return unCamino.reverse();
	}
	
	def daUnPaso(unCaminante, punto){
		unCaminante.distanciaRecorrida+=unCaminante.posicion.distanciaA(punto)
		unCaminante.posicion = punto 
	}
}
