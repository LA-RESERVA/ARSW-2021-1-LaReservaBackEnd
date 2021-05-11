package co.edu.eci.lareserva.services.Impl;

import co.edu.eci.lareserva.entities.Sede;
import co.edu.eci.lareserva.persistence.LaReservaPersistenceException;
import co.edu.eci.lareserva.persistence.SedePersistence;
import co.edu.eci.lareserva.services.ISedeServices;
import co.edu.eci.lareserva.services.LaReservaException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SedeServices implements ISedeServices {

    @Autowired
    SedePersistence sedePersistence;

    @Override
    public void crearSede(Sede sede) throws LaReservaException {
        try {
            sedePersistence.agregarSede(sede);
        } catch (LaReservaPersistenceException ex) {
            throw new LaReservaException(ex.getMessage());
        }
    }

    @Override
    public List<Sede> consultarSedes() throws LaReservaException {
        return sedePersistence.consultarSedes();
    }

    @Override
    public void eliminarSede(Integer id) throws LaReservaException {
        try {
            sedePersistence.eliminarSede(id);
        } catch (LaReservaPersistenceException ex) {
            throw new LaReservaException(ex.getMessage());
        }
    }

    @Override
    public void actualizarSede(Sede sede) throws LaReservaException {
        try {
            sedePersistence.agregarSede(sede);
        } catch (LaReservaPersistenceException ex) {
            throw new LaReservaException(ex.getMessage());
        }
    }

    @Override
    public Sede consultarSedePorId(Integer id) throws LaReservaException {
        try {
            return sedePersistence.sedePorId(id);
        } catch (LaReservaPersistenceException ex) {
            throw new LaReservaException(ex.getMessage());
        }
    }

    @Override
    public List<Sede> consultarSedePorUsuario(Integer idUsuario) throws LaReservaException {
        try {
            return sedePersistence.sedesPorUsuario(idUsuario);
        } catch (LaReservaPersistenceException ex) {
            throw new LaReservaException(ex.getMessage());
        }
    }
}
