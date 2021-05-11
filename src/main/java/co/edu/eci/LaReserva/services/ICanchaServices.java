package co.edu.eci.lareserva.services;

import java.util.List;

import co.edu.eci.lareserva.entities.Cancha;

public interface ICanchaServices {

    void crearCancha(Cancha cancha) throws LaReservaException;

    List<Cancha> consultarCancha() throws LaReservaException;

    void eliminarCancha(Integer id) throws LaReservaException;

    void actualizarCancha(Cancha cancha) throws LaReservaException;

    List<Cancha> consultarCanchasPorSede(Integer idSede) throws LaReservaException;

    Cancha consultarCanchaPorId(Integer id) throws LaReservaException;
}
