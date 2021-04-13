package co.edu.eci.LaReserva.persistence.repository;

import co.edu.eci.LaReserva.entities.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ISedeRepository extends JpaRepository<Sede, Integer> {

    @Query("SELECT s FROM Sede s WHERE s.id = ?1")
    public Sede sedePorId(Integer id);
}
