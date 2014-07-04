package ar.edu.tadp.viajes

class Discapacitado extends Descuento {
  override def calcularDescuento(camino: List[Tramo], unUsuario: Usuario): Float = {
    return 0
  }
}