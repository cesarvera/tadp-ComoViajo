package ar.edu.tadp.viajes

class Subte(var linea: String) extends Transporte {
  override def calcularTarifa(origen: Direccion, destino: Direccion): Float = {
    return 1
  }
  
  override def esIgual(unTransporte: Transporte): Boolean = {
    var retVal: Boolean = false

    if (unTransporte.isInstanceOf[Subte]) {
      retVal = unTransporte.asInstanceOf[Subte].linea == this.linea
    }

    return retVal
  }

  override def calcularTiempoCombinacion(origen: Direccion, destino: Direccion, unTransporte: Transporte): Double = {
    var tiempo: Double = 0
    var distanciaEntreParadas: Double = 0

    if (unTransporte.isInstanceOf[Colectivo]) {
      distanciaEntreParadas = ModuloTransporte.distanciaPie(origen, destino)
      tiempo = 2.5 * distanciaEntreParadas / 100
    } else if (unTransporte.isInstanceOf[Subte]) {
      tiempo = 4
    } else if (unTransporte.isInstanceOf[Tren]) {
      tiempo = 5
    }

    return tiempo
  }
}