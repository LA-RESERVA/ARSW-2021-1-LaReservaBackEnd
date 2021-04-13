package co.edu.eci.LaReserva.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import co.edu.eci.LaReserva.entities.Horario;

public interface IHorarioRepository extends JpaRepository<Horario, Integer> {

}
