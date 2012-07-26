package ar.edu.utn.frba.tadp.caminante

class RecorridoBuilder {
	Recorrido recorrido = new Recorrido()
	
	def en(articulo){ this }
	
	def camino(bloque){
		def builder = new CaminoBuilder()
		builder.with(bloque)
		recorrido.camino = builder.build()
		this
	}
	
	def dando(pasos){
		recorrido.pasos = pasos
		this
	}
	
	def pasos(direccion){
		recorrido.sentido = direccion
		this
	}
	
	def build(){
		return recorrido;
	}
	
}
