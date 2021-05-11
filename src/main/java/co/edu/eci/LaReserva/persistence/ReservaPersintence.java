package co.edu.eci.lareserva.persistence;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.eci.lareserva.entities.Reserva;
import co.edu.eci.lareserva.persistence.repository.IReservaRepository;

@Repository
public class ReservaPersintence {

    @Autowired
    private IReservaRepository reservaRepository;

    public void agregarReserva(Reserva reserva) throws LaReservaPersistenceException {
        reservaRepository.save(reserva);
    }

    public List<Reserva> consultarReserva() {
        return reservaRepository.findAll();
    }

    public void eliminarReserva(Integer id) throws LaReservaPersistenceException {
        reservaRepository.deleteById(id);
    }

    public void reservaRepetida(int cancha, String dia, String hora) throws LaReservaPersistenceException {
        if(reservaRepository.validarReserva(cancha, dia, hora) != null) {
            throw new LaReservaPersistenceException("Error: ya está reservada la cancha.");
        }
    }
}
