package ar.edu.tadp.viajes

object MenorTiempo extends Criterio {
  override def seleccionarRecorrido(origen: Direccion, destino: Direccion, recorridos: List[List[Tramo]], unUsuario: Usuario): List[Tramo] = {
    var tiempoAnterior: Double = 0
    var tiempoActual: Double = 0
    var recorridoSeleccionado: List[Tramo] = null
    var first: Boolean = true

    for (unRecorrido <- recorridos) {
      if (first) {
        recorridoSeleccionado = unRecorrido
        first = false
      } else {
        tiempoActual = calcularTiempo(origen, destino, unRecorrido)
        tiempoAnterior = calcularTiempo(origen, destino, recorridoSeleccionado)

        if (tiempoActual < tiempoAnterior) {
          recorridoSeleccionado = unRecorrido
        }
      }
    }

    return recorridoSeleccionado
  }

  private def calcularTiempo(origen: Direccion, destino: Direccion, unRecorrido: List[Tramo]): Double = {
    var tiempoTotal: Double = ModuloTransporte.distanciaPie(origen, unRecorrido.head.origen)

    tiempoTotal = tiempoTotal + ModuloTransporte.distanciaPie(unRecorrido.last.destino, destino)

    for (unTramo <- unRecorrido) {
      tiempoTotal = tiempoTotal + unTramo.calcularDistancia()
    }

    if (!unRecorrido.head.transporte.esIgual(unRecorrido.last.transporte)) {
      tiempoTotal = tiempoTotal + unRecorrido.head.transporte.calcularTiempoCombinacion(unRecorrido.head.destino, unRecorrido.last.origen, unRecorrido.last.transporte)
    }

    return tiempoTotal
  }
}