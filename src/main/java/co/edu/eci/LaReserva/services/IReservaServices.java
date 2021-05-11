package co.edu.eci.lareserva.services;

import java.util.List;

import co.edu.eci.lareserva.entities.Reserva;

public interface IReservaServices {

    void crearReserva(Reserva reserva) throws LaReservaException;

    List<Reserva> consultarReservas() throws LaReservaException;

    void eliminarReserva(Integer id) throws LaReservaException;

    void actualizarReserva(Reserva reserva) throws LaReservaException;
}
