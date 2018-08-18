package com.Main.quantum;

import javax.servlet.annotation.WebServlet;

import com.byos.sys.ui.ByosMenu.ByosMenuCircularHuespedes;
import com.byos.sys.ui.ByosMenu.ByosMenuInicio;
import com.modulo.componentes.ByosImagenes;
import com.modulo.inicio.moduloEncendido;
import com.modulo.main.frmMenu;
import com.modulo.reserva.moduloReserva01;
import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("quantum")
//@Push
public class QuantumUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = QuantumUI.class, widgetset = "com.Main.quantum.widgetset.QuantumWidgetset")
	public static class Servlet extends VaadinServlet {
	}

	@Override
    protected void init(VaadinRequest vaadinRequest) {    	
		final VerticalLayout layout = new VerticalLayout();
		Image FondoPantalla = new Image();
		FondoPantalla.setSizeFull();
		
		FondoPantalla.setIcon(ByosImagenes.icon[111]);
		layout.addComponent(FondoPantalla);
		//layout.setMargin(true);
		setContent(layout);
		//layout.setMargin(false);

		//layout.addComponent(new frmMenu());
		//layout.addComponent(new ByosMenuCircular());
		//if(!moduloEncendido.EstadoForm){
		//   new moduloEncendido().openWindows();
	    //}
		new moduloReserva01("123456789").openWindows();
    }

}