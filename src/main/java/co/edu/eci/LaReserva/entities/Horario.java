package co.edu.eci.LaReserva.entities;

import java.io.Serializable;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "horarios")
public class Horario implements Serializable {
    


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "dia")
    private String dia;
    
    @Column(name = "hora")
    private LocalTime hora;
    
    @Column(name = "cancha")
    private int cancha;
    
    @Column(name = "estado")
    private boolean estado;

    public Horario(int id, String dia, LocalTime hora, int cancha, boolean estado) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.cancha = cancha;
        this.estado = estado;
    }

    public Horario() {
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getCancha() {
        return cancha;
    }

    public void setCancha(int cancha) {
        this.cancha = cancha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Horario{" + "id=" + id + ", dia=" + dia + ", hora=" + hora + ", cancha=" + cancha + ", estado=" + estado + '}';
    }
}
