package ar.edu.utn.frba.tadp.caminante

import org.junit.Before;
import org.junit.Test

class CaminanteTest extends GroovyTestCase{
	
	def caminante
	
	@Before
	void setUp(){
		this.caminante = new Caminante()
	}
	
	@Test
	void testCaminanteCaminaDosPasosAdelante(){
		caminante.caminar {
			en camino {
				x 3 y 4
				x (-1) y 7
				x 2 y 11
			}
			dando 2 pasos "adelante"
		}
		
		assertEquals(10, caminante.distanciaRecorrida,0.001)
		assertEquals(new Punto(x:(-1), y:7), caminante.posicion)
	}
	
	@Test
	void testCaminanteCaminaTresPasosAtras(){
		caminante.caminar {
			en camino {
				x 2 y 14
				x 5 y 10
				x 8 y 6
			}
			dando 3 pasos "atras"
		}
		
		assertEquals(20, caminante.distanciaRecorrida,0.001)
		assertEquals(new Punto(x:2, y:14), caminante.posicion)
	}
}
