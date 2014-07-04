package ar.edu.tadp.tests

import org.junit.Before
import ar.edu.tadp.viajes.Usuario
import ar.edu.tadp.viajes.Discapacitado
import org.junit.Test
import org.junit.Assert
import ar.edu.tadp.viajes.MenorCosto

class ViajesTest {

  @Test
  def moduloTransporteTest() = {
    var unUsuario: Usuario = new Usuario(new Discapacitado(), MenorCosto)

    Assert.assertEquals(0, unUsuario.descuento)
  }
}