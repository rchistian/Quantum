package com.modulo.reserva;

import com.modulo.huesped.tblHuespedes;

public class tblEstadisticasHuesped {


	private Integer ID;
    private Integer IDHuesped;
    private String NumeroDocumento;

	private String Nombres;
    private String Apellidos;
    private String Apodo;
    
    private String Telefono;
    
	private String PrimaraEstancia;
	private String UltimaEstancia;
	private String TiempoUltimaEstancia;
	private String CuntosHospedajes;
	private String MediaDiaEstancia;
	private String RecervasAnuladas;
	private String FechaCompleanos;
	private String PaisOrigen;
	private String CiudadRecidencia;
	private String Acompanante;
	private String Whatsapp;
	private String Gmail;

	private String PensionesCompletas;
	private String TotalPensionesCompletas;
	private String MediasPensiones;
	private String TotalMediasPensiones;
	private String PencionesRecuperadas;
	private String TotalPencionesRecuperadas;
	private String MediasPendientes;
	private String TotalMediasPendientes;
	
	private String ServiciosHabiracion;
	private String TotalServiciosHabiracion;
	private String ConsumicionesInternas;
	private String TotalConsumicionesInternas;
	private String DevolucionConsumiciones;
	private String TotalDevolucionConsumiciones;
	private String FueraHora;
	private String TotalFueraHora;

	private String Nivel;
	
	public String getNivel() {
		return Nivel;
	}
	public void setNivel(String nivel) {
		Nivel = nivel;
	}	
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getNumeroDocumento() {
		return NumeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		NumeroDocumento = numeroDocumento;
	}
    public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Integer getIDHuesped() {
		return IDHuesped;
	}
	public void setIDHuesped(Integer iDHuesped) {
		IDHuesped = iDHuesped;
	}
    public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getApodo() {
		return Apodo;
	}
	public void setApodo(String apodo) {
		Apodo = apodo;
	}
	public String getPrimaraEstancia() {
		return PrimaraEstancia;
	}
	public void setPrimaraEstancia(String primaraEstancia) {
		PrimaraEstancia = primaraEstancia;
	}
	public String getUltimaEstancia() {
		return UltimaEstancia;
	}
	public void setUltimaEstancia(String ultimaEstancia) {
		UltimaEstancia = ultimaEstancia;
	}
	public String getTiempoUltimaEstancia() {
		return TiempoUltimaEstancia;
	}
	public void setTiempoUltimaEstancia(String tiempoUltimaEstancia) {
		TiempoUltimaEstancia = tiempoUltimaEstancia;
	}
	public String getCuntosHospedajes() {
		return CuntosHospedajes;
	}
	public void setCuntosHospedajes(String cuntosHospedajes) {
		CuntosHospedajes = cuntosHospedajes;
	}
	public String getMediaDiaEstancia() {
		return MediaDiaEstancia;
	}
	public void setMediaDiaEstancia(String mediaDiaEstancia) {
		MediaDiaEstancia = mediaDiaEstancia;
	}
	public String getRecervasAnuladas() {
		return RecervasAnuladas;
	}
	public void setRecervasAnuladas(String recervasAnuladas) {
		RecervasAnuladas = recervasAnuladas;
	}
	public String getFechaCompleanos() {
		return FechaCompleanos;
	}
	public void setFechaCompleanos(String fechaCompleanos) {
		FechaCompleanos = fechaCompleanos;
	}
	public String getPaisOrigen() {
		return PaisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		PaisOrigen = paisOrigen;
	}
	public String getCiudadRecidencia() {
		return CiudadRecidencia;
	}
	public void setCiudadRecidencia(String ciudadRecidencia) {
		CiudadRecidencia = ciudadRecidencia;
	}
	public String getAcompanante() {
		return Acompanante;
	}
	public void setAcompanante(String acompanante) {
		Acompanante = acompanante;
	}
	public String getWhatsapp() {
		return Whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		Whatsapp = whatsapp;
	}
	public String getGmail() {
		return Gmail;
	}
	public void setGmail(String gmail) {
		Gmail = gmail;
	}
	public String getPensionesCompletas() {
		return PensionesCompletas;
	}
	public void setPensionesCompletas(String pensionesCompletas) {
		PensionesCompletas = pensionesCompletas;
	}
	public String getTotalPensionesCompletas() {
		return TotalPensionesCompletas;
	}
	public void setTotalPensionesCompletas(String totalPensionesCompletas) {
		TotalPensionesCompletas = totalPensionesCompletas;
	}
	public String getMediasPensiones() {
		return MediasPensiones;
	}
	public void setMediasPensiones(String mediasPensiones) {
		MediasPensiones = mediasPensiones;
	}
	public String getTotalMediasPensiones() {
		return TotalMediasPensiones;
	}
	public void setTotalMediasPensiones(String totalMediasPensiones) {
		TotalMediasPensiones = totalMediasPensiones;
	}
	public String getPencionesRecuperadas() {
		return PencionesRecuperadas;
	}
	public void setPencionesRecuperadas(String pencionesRecuperadas) {
		PencionesRecuperadas = pencionesRecuperadas;
	}
	public String getTotalPencionesRecuperadas() {
		return TotalPencionesRecuperadas;
	}
	public void setTotalPencionesRecuperadas(String totalPencionesRecuperadas) {
		TotalPencionesRecuperadas = totalPencionesRecuperadas;
	}
	public String getMediasPendientes() {
		return MediasPendientes;
	}
	public void setMediasPendientes(String mediasPendientes) {
		MediasPendientes = mediasPendientes;
	}
	public String getTotalMediasPendientes() {
		return TotalMediasPendientes;
	}
	public void setTotalMediasPendientes(String totalMediasPendientes) {
		TotalMediasPendientes = totalMediasPendientes;
	}
	public String getServiciosHabiracion() {
		return ServiciosHabiracion;
	}
	public void setServiciosHabiracion(String serviciosHabiracion) {
		ServiciosHabiracion = serviciosHabiracion;
	}
	public String getTotalServiciosHabiracion() {
		return TotalServiciosHabiracion;
	}
	public void setTotalServiciosHabiracion(String totalServiciosHabiracion) {
		TotalServiciosHabiracion = totalServiciosHabiracion;
	}
	public String getConsumicionesInternas() {
		return ConsumicionesInternas;
	}
	public void setConsumicionesInternas(String consumicionesInternas) {
		ConsumicionesInternas = consumicionesInternas;
	}
	public String getTotalConsumicionesInternas() {
		return TotalConsumicionesInternas;
	}
	public void setTotalConsumicionesInternas(String totalConsumicionesInternas) {
		TotalConsumicionesInternas = totalConsumicionesInternas;
	}
	public String getDevolucionConsumiciones() {
		return DevolucionConsumiciones;
	}
	public void setDevolucionConsumiciones(String devolucionConsumiciones) {
		DevolucionConsumiciones = devolucionConsumiciones;
	}
	public String getTotalDevolucionConsumiciones() {
		return TotalDevolucionConsumiciones;
	}
	public void setTotalDevolucionConsumiciones(String totalDevolucionConsumiciones) {
		TotalDevolucionConsumiciones = totalDevolucionConsumiciones;
	}
	public String getFueraHora() {
		return FueraHora;
	}
	public void setFueraHora(String fueraHora) {
		FueraHora = fueraHora;
	}
	public String getTotalFueraHora() {
		return TotalFueraHora;
	}
	public void setTotalFueraHora(String totalFueraHora) {
		TotalFueraHora = totalFueraHora;
	}
	
	public tblEstadisticasHuesped() {
		
	}
	
	public void setDataHuesped(tblHuespedes Huesped) {
		setIDHuesped(Huesped.getID());
		setNombres(Huesped.getNombres());
		setApellidos(Huesped.getApellidos());
	    setNumeroDocumento(Huesped.getNumeroDocumento());
	    setTelefono(Huesped.getTelefono());
	}
	
}
