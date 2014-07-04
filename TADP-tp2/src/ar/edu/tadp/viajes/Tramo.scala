package ar.edu.tadp.viajes

class Tramo(var transporte: Transporte, var origen: Direccion, var destino: Direccion) {
  def calcularDistancia(): Int = {
    return transporte.calcularDistancia(origen, destino)
  }
}