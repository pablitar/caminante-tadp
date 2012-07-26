package ar.edu.utn.frba.tadp.caminante

class Caminante {
	
	def posicion = new Punto(x:0,y:0)
	def distanciaRecorrida = 0
	
	def caminar (bloque) {
		def builder = new RecorridoBuilder()
		builder.with(bloque)
		
		builder.build().recorre(this)
	}
}
