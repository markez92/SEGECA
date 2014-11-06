package def;

import java.sql.Time;
import java.util.Date;

public class Acta {

	private String nombre;
	private Date fecha; 
	private String lugar;
	private String proposito;
	private Persona[] participantes;
	private Time horaInicio;
	private Time horaFin;
	private CCC[] ccc;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getProposito() {
		return proposito;
	}
	public void setProposito(String proposito) {
		this.proposito = proposito;
	}
	public Persona[] getParticipantes() {
		return participantes;
	}
	public void setParticipantes(Persona[] participantes) {
		this.participantes = participantes;
	}
	public Time getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Time getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}
	public CCC[] getCcc() {
		return ccc;
	}
	public void setCcc(CCC[] ccc) {
		this.ccc = ccc;
	}
}
