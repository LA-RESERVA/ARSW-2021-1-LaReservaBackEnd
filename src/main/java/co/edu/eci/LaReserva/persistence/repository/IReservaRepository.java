package co.edu.eci.LaReserva.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.eci.LaReserva.entities.Reserva;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {

}
