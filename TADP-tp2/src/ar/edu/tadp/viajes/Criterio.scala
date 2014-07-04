package ar.edu.tadp.viajes

abstract class Criterio {
  def seleccionarRecorrido(origen: Direccion, destino: Direccion, recorridos: List[List[Tramo]], unUsuario: Usuario): List[Tramo]
}