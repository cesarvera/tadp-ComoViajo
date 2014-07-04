package ar.edu.tadp.viajes

class Colectivo(var linea: Int) extends Transporte {
  override def calcularTarifa(origen: Direccion, destino: Direccion): Float = {
    return 1
  }

  override def esIgual(unTransporte: Transporte): Boolean = {
    var retVal: Boolean = false

    if (unTransporte.isInstanceOf[Colectivo]) {
      retVal = unTransporte.asInstanceOf[Colectivo].linea == this.linea
    }

    return retVal
  }

  override def calcularTiempoCombinacion(origen: Direccion, destino: Direccion, unTransporte: Transporte): Double = {
    var tiempo: Double = 0
    var distanciaEntreParadas: Double = 0

    distanciaEntreParadas = ModuloTransporte.distanciaPie(origen, destino)
    tiempo = 2.5 * distanciaEntreParadas / 100

    return tiempo
  }
}