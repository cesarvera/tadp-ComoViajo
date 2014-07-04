package ar.edu.tadp.viajes

object ModuloTransporte {
  def mediosTransporteCerca(unaDireccion: Direccion): List[TransporteCerca] = {
    var retVal: List[TransporteCerca] = List()
    var unColectivo = new Colectivo(5)
    var unaDireccion = new Direccion("Balcarce", 50, "La Boca")
    var unTransporteCerca = new TransporteCerca(unColectivo, unaDireccion)

    retVal = unTransporteCerca :: retVal

    return retVal
  }

  def puedeCombinar(lineaA: Transporte, lineaB: Transporte): Direccion = {
    return null
  }

  def dondeBajar(): Direccion = {
    return null
  }

  def distanciaColectivo(linea: Int, dir1: Direccion, dir2: Direccion): Int = {
    return 0
  }

  def distanciaPie(dir1: Direccion, dir2: Direccion): Int = {
    return 0
  }
}