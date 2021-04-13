package co.edu.eci.LaReserva.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.eci.LaReserva.entities.Horario;
import co.edu.eci.LaReserva.persistence.repository.IHorarioRepository;
@Repository
public class HorarioPersistence {
    @Autowired
    private IHorarioRepository horarioRepository;

    public void agregarHorario(Horario horario) throws LaReservaPersistenceException {
        horarioRepository.save(horario);
    }
    
    public List<Horario> consultarHorario() {
        return horarioRepository.findAll();
    }
    
    public void eliminarHorario(Integer id) throws LaReservaPersistenceException {
        horarioRepository.deleteById(id);
    }
}
