package ar.edu.tadp.viajes

object ModuloTransporte {
  def mediosTransporteCerca(unaDireccion: Direccion): List[TransporteCerca] = {
    var retVal: List[TransporteCerca] = List()
    var unColectivo: Colectivo = null
    var dirCerca: Direccion = null
    var unTransporteCerca: TransporteCerca = null

    if (unaDireccion.calle == "Balcarce") {
      unColectivo = new Colectivo(5)
      dirCerca = new Direccion("Balcarce", 60, "La Boca")
    } else if (unaDireccion.calle == "Bolivar") {
      unColectivo = new Colectivo(5)
      dirCerca = new Direccion("Bolivar", 100, "La Boca")
    }

    unTransporteCerca = new TransporteCerca(unColectivo, unaDireccion)
    retVal = unTransporteCerca :: retVal

    return retVal
  }

  def puedeCombinar(lineaA: Transporte, lineaB: Transporte): Direccion = {
    return null
  }

  def distanciaColectivo(linea: Int, dir1: Direccion, dir2: Direccion): Int = {
    return 0
  }

  def distanciaPie(dir1: Direccion, dir2: Direccion): Double = {
    return 10
  }
}