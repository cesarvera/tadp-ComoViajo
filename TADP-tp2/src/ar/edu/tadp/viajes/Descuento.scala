package ar.edu.tadp.viajes

abstract class Descuento {
  def calcularDescuento(camino: List[Tramo], unUsuario: Usuario): Float = {
    return 0
  }
}