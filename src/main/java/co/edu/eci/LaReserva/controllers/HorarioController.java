package co.edu.eci.LaReserva.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.edu.eci.LaReserva.entities.Horario;
import co.edu.eci.LaReserva.services.LaReservaException;
import co.edu.eci.LaReserva.services.Impl.HorarioServices;

@RestController
@RequestMapping(value = "/horarios")
@CrossOrigin(origins = "*")
public class HorarioController {

    @Autowired
    private HorarioServices horarioServices;

    @GetMapping(value = "/listar")
    public ResponseEntity<?> consultarCanchas() {
        try {
            return new ResponseEntity<>(horarioServices.consultarHorario(), HttpStatus.ACCEPTED);
        } catch (LaReservaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping(value = "/estado")
    public ResponseEntity<?> consultarEstado(@RequestParam("cancha") int cancha,@RequestParam("fecha") String fecha,@RequestParam("hora") String hora) {
        try {
            return new ResponseEntity<>(horarioServices.consultaEstado(cancha, fecha, hora), HttpStatus.ACCEPTED);
        } catch (LaReservaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/crear")
    public ResponseEntity<?> registrarCancha(@RequestBody Horario horario) {
        try {
            horarioServices.crearHorario(horario);
            return new ResponseEntity<>("Horario creado satisfactoriamente.", HttpStatus.CREATED);
        } catch (LaReservaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> elimina(@RequestParam Integer id) {
        try {
            horarioServices.eliminarHorario(id);
            return new ResponseEntity<>("Horario eliminado satisfactoriamente.", HttpStatus.CREATED);
        } catch (LaReservaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @PutMapping("actualizar/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody @Validated Horario horario) {
        horario.setId(id);
        try {
            horarioServices.actualizarHorario(horario);
            return new ResponseEntity<>("horario se actualizo", HttpStatus.CREATED);
        } catch (LaReservaException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
        }
    }
}
