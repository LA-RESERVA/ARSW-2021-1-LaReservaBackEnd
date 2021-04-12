package co.edu.eci.LaReserva.controllers;

import co.edu.eci.LaReserva.entities.Sede;
import co.edu.eci.LaReserva.services.Impl.SedeServices;
import co.edu.eci.LaReserva.services.LaReservaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sedes")
@CrossOrigin(origins = "*")
public class SedeController {
    
    @Autowired
    private SedeServices sedeServices;
    
    @GetMapping(value = "/listar")
    public ResponseEntity<?> consultarSedes() {
        try {
            return new ResponseEntity<>(sedeServices.consultarSedes(), HttpStatus.ACCEPTED);
        } catch (LaReservaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping(value = "/crear")
    public ResponseEntity<?> registrarUsuario(@RequestBody Sede sede) {
        try {
            sedeServices.crearSede(sede);
            return new ResponseEntity<>("Sede creada satisfactoriamente.", HttpStatus.CREATED);
        } catch (LaReservaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }
    
    @DeleteMapping("/eliminar")
    public ResponseEntity<?> elimina(@RequestParam Integer id) {
        try {
            sedeServices.eliminarSede(id);
            return new ResponseEntity<>("Sede eliminada satisfactoriamente.", HttpStatus.CREATED);
        } catch (LaReservaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }
}
