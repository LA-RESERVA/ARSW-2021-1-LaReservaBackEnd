package co.edu.eci.LaReserva.persistence;

import co.edu.eci.LaReserva.entities.Sede;
import co.edu.eci.LaReserva.persistence.repository.ISedeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SedePersistence {

    @Autowired
    private ISedeRepository sedeRepository;

    public void agregarSede(Sede sede) throws LaReservaPersistenceException {
        sedeRepository.save(sede);
    }
    
    public List<Sede> consultarSedes() {
        return sedeRepository.findAll();
    }
    
    public void eliminarSede(Integer id) throws LaReservaPersistenceException {
        sedeRepository.deleteById(id);
    }
}
