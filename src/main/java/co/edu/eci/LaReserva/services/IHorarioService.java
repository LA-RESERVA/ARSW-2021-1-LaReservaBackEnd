package co.edu.eci.LaReserva.services;

import java.util.List;

import co.edu.eci.LaReserva.entities.Horario;

public interface IHorarioService {

    void crearHorario(Horario horario) throws LaReservaException;

    List<Horario> consultarHorario() throws LaReservaException;

    void eliminarHorario(Integer id) throws LaReservaException;

    void actualizarHorario(Horario horario) throws LaReservaException;
    
    Horario consultaEstado(int cancha, String dia, String hora) throws LaReservaException;
}
