package ar.edu.tadp.viajes

abstract class Transporte {
  def calcularTarifa(origen: Direccion, destino: Direccion): Float

  def calcularDistancia(origen: Direccion, destino: Direccion): Int = {
    return 0
  }

  def esIgual(unTransporte: Transporte): Boolean

  def calcularTiempoCombinacion(origen: Direccion, destino: Direccion, unTransporte: Transporte): Double
}