package co.edu.eci.LaReserva.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.eci.LaReserva.entities.Horario;

public interface IHorarioRepository extends JpaRepository<Horario, Integer> {
    @Query("SELECT u FROM Horario u WHERE u.cancha = ?1 AND u.dia = ?2 AND u.hora = ?3")
    Horario traerEstado(int cancha, String dia, String hora);
}
