package ar.edu.tadp.viajes

class Usuario(var descuento: Descuento, var criterio: Criterio) {
  def calcularDescuento(camino: List[Tramo]): Float = {
    return descuento.calcularDescuento(camino, this)
  }

  def seleccionarRecorrido(origen: Direccion, destino: Direccion, recorridos: List[List[Tramo]]): List[Tramo] = {
    return criterio.seleccionarRecorrido(origen, destino, recorridos, this)
  }
}