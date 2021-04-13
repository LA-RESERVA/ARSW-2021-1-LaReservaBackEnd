package co.edu.eci.LaReserva.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.eci.LaReserva.entities.Cancha;
import co.edu.eci.LaReserva.entities.Sede;

public interface ICanchaRepository extends JpaRepository<Cancha, Integer> {

}