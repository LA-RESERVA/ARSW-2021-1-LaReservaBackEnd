package co.edu.eci.LaReserva.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.eci.LaReserva.entities.Cancha;
import co.edu.eci.LaReserva.persistence.repository.ICanchaRepository;

@Repository
public class CanchaPersistence {

    @Autowired
    private ICanchaRepository canchaRepository;

    public void agregarCancha(Cancha cancha) throws LaReservaPersistenceException {
        canchaRepository.save(cancha);
    }
    
    public List<Cancha> consultarCancha() {
        return canchaRepository.findAll();
    }
    
    public void eliminarCancha(Integer id) throws LaReservaPersistenceException {
        canchaRepository.deleteById(id);
    }
    
    public List<Cancha> canchasPorSede(Integer idSede) throws LaReservaPersistenceException {
        return canchaRepository.canchasPorSede(idSede);
    }
}
