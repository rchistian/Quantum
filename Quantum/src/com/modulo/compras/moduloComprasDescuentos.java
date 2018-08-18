package com.modulo.compras;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

import com.modulo.componentes.ByosBoton;
import com.modulo.componentes.ByosCampo;
import com.modulo.componentes.ByosConversores;
import com.Main.quantum.QuantumUI;
import com.byos.sys.ui.ByosDatagrid.ByosColumna;
import com.byos.sys.ui.ByosDatagrid.ByosDatagridFiltrableTextbox;
import com.byos.sys.util.ByosValidar;
import com.vaadin.event.FieldEvents;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class moduloComprasDescuentos extends VerticalLayout  implements Serializable{
    private static final long serialVersionUID = 5474522369804563317L;
    public Window subwindow;
    public final Table tableListado = new Table(); 
    public VerticalLayout layout = new VerticalLayout();
    public HorizontalLayout Botonlayout = new HorizontalLayout();

	public double TotalMontoDescuento=0;
	public double TotalPorcentajeDescuento=0;
	
    public tblCompras TblCompras;
    
    public ByosBoton btoAceptar;
    public ByosBoton btoCancelar;
    

    public ByosCampo bcCodigoDescuentos = new ByosCampo();

    public int MaxReg = 1;
    public int Posicion=1;
    
    ByosColumna[] ByosColumnas = new ByosColumna[3];
    
    ByosDatagridFiltrableTextbox ListaDescuentos;
    ArrayList <tblComprasDescuentos>ArrayTblComprasDescuentos = new ArrayList <tblComprasDescuentos>();
    
	public double getTotalMontoDescuento() {
		return TotalMontoDescuento;
	}

	public void setTotalMontoDescuento(double totalMontoDeducible) {
		TotalMontoDescuento = totalMontoDeducible;
	}

	public double getTotalPorcentajeDescuento() {
		return TotalPorcentajeDescuento;
	}

	public void setTotalPorcentajeDescuento(double totalMontoImpuestos) {
		TotalPorcentajeDescuento = totalMontoImpuestos;
	}
	
    public moduloComprasDescuentos(ArrayList <tblComprasDescuentos>ArrayTblComprasDescuentos, tblCompras TblCompras){
    	this.ArrayTblComprasDescuentos = ArrayTblComprasDescuentos;
    	this.TblCompras = TblCompras;
    	
        layout.setMargin(true);
        layout.setSpacing(true);
        subwindow = new Window("Descuentos");
        subwindow.setWidth("380px");
        subwindow.setHeight("330px");
        subwindow.setModal(true);       
        subwindow.setContent(layout);
        
        initAddressList();
        
        layout.addComponent(ListaDescuentos);
    	btoAceptar = new ByosBoton(Botonlayout,32,"Aceptar","Aceptar");
    	btoCancelar = new ByosBoton(Botonlayout,33,"Cancelar","Cancelar");
    	
    	Botonlayout.setComponentAlignment(btoAceptar, Alignment.BOTTOM_CENTER);
    	Botonlayout.setComponentAlignment(btoCancelar, Alignment.BOTTOM_CENTER);
        
    	layout.addComponent(Botonlayout);
    	
    	layout.setComponentAlignment(Botonlayout, Alignment.MIDDLE_CENTER); 
    	
    	ActualizarDescuentoTotal();
    }
    
    public void setTblCompras(tblCompras TblCompras){
    	this.TblCompras = TblCompras;
    }
    
    private void initAddressList() {
        
    	if(ArrayTblComprasDescuentos!=null && ArrayTblComprasDescuentos.size()>0){
    		MaxReg=ArrayTblComprasDescuentos.size();
    	}
    	ListaDescuentos = new ByosDatagridFiltrableTextbox(false,340,200);
    	
    	
    	ByosColumnas[0] = new ByosColumna("item",                          String.class, "Item",                  "", null);
    	ByosColumnas[1] = new ByosColumna("porcentaje",                    String.class, "porcentaje",            "", null);
        ByosColumnas[2] = new ByosColumna("montodescuento",                String.class, "Monto Descuento",       "", null);


    	
    	try {
    		
			ListaDescuentos.getDatagrid().initDatagridByos(ArrayTblComprasDescuentos , new tblComprasDescuentos(), ByosColumnas, false);
			
			ListaDescuentos.getDatagrid().addGeneratedColumn("item", new Table.ColumnGenerator() {			
				@Override
				public Object generateCell(final Table source, final Object itemId, Object columnId) {
					final tblComprasDescuentos p = (tblComprasDescuentos)itemId;
					final Label lblDescripcion = new Label();
					lblDescripcion.setStyleName("align-right");
					lblDescripcion.setVisible(true);
					lblDescripcion.setWidth("20px");
					lblDescripcion.setValue(p.getItem()==null?"":p.getItem().toString());
					lblDescripcion.setImmediate(true);					
					return lblDescripcion;
				}
			});

			ListaDescuentos.getDatagrid().addGeneratedColumn("porcentaje", new Table.ColumnGenerator() {			
				@Override
				public Object generateCell(final Table source, final Object itemId, Object columnId) {
					final tblComprasDescuentos p = (tblComprasDescuentos)itemId;
					final ByosCampo ByosCampo01 = new ByosCampo("NumberField");
					ByosCampo01.lblNombreCampo.setVisible(false);
					ByosCampo01.setTipoCampo("NumberField");
					ByosCampo01.txtNumerico.setWidth("6em");
					ByosCampo01.txtNumerico.setStyleName("align-right");
					ByosCampo01.txtNumerico.setValue(ByosConversores.BigDecimalToString(p.getPorcentaje(),5));
					ByosCampo01.txtNumerico.addTextChangeListener(new FieldEvents.TextChangeListener() {		
						@Override
						public void textChange(TextChangeEvent event) {
							if(event.getText()!=null && !event.getText().equals("")){
								p.setPorcentaje(ByosConversores.StringToBigDecimal(event.getText()));
								ActualizarDescuentoTotal();
								ListaDescuentos.getDatagrid().refreshRowCache();
							}
							
						}
					});
					
					ByosCampo01.btoBoton1.setVisible(true);
					ByosCampo01.btoBoton1.setBoton(50, "Actualizar", "");									
					ByosCampo01.btoBoton1.addClickListener(new Button.ClickListener() {
			            public void buttonClick(ClickEvent event) {
			               try{
							   ActualizarDescuentoTotal();
							   ListaDescuentos.getDatagrid().refreshRowCache();                            
			               } catch (Exception e) {
			                   // Ingnored, we'll let the Form handle the errors
			               }
			           }
			        });						
					return ByosCampo01;
				}
			});	
			
			ListaDescuentos.getDatagrid().addGeneratedColumn("montodescuento", new Table.ColumnGenerator() {			
				@Override
				public Object generateCell(final Table source, final Object itemId, Object columnId) {
					final tblComprasDescuentos p = (tblComprasDescuentos)itemId;
					final ByosCampo ByosCampo01 = new ByosCampo("NumberField");
					ByosCampo01.lblNombreCampo.setVisible(false);
					ByosCampo01.setTipoCampo("NumberField");
					ByosCampo01.txtNumerico.setWidth("6em");	
					ByosCampo01.txtNumerico.setStyleName("align-right");
					ByosCampo01.txtNumerico.setValue(ByosConversores.BigDecimalToString(p.getMontodescuento(),5));
					ByosCampo01.txtNumerico.addTextChangeListener(new FieldEvents.TextChangeListener() {		
						@Override
						public void textChange(TextChangeEvent event) {
							if(event.getText()!=null && !event.getText().equals("")){
								p.setMontodescuento(ByosConversores.StringToBigDecimal(event.getText()));								
								//ActualizarDescuentoTotal();
								//ListaDescuentos.getDatagrid().refreshRowCache();
								
							}
							
						}
					});
					
					ByosCampo01.btoBoton1.setVisible(true);
					ByosCampo01.btoBoton1.setBoton(50, "Actualizar", "");									
					ByosCampo01.btoBoton1.addClickListener(new Button.ClickListener() {
			            public void buttonClick(ClickEvent event) {
			               try{
			            	   double MontoDescuento=0;
			            	   System.out.println("Monto........... ");
			            	   for(int f=0;f<p.getItem()-1;f++){
			            		   if(((tblComprasDescuentos)ArrayTblComprasDescuentos.get(f)).getMontodescuento()!=null){
			            		      MontoDescuento+=((tblComprasDescuentos)ArrayTblComprasDescuentos.get(f)).getMontodescuento().doubleValue();
			            		   }
			            	   }
			            	   double Montodescuento=ByosValidar.Nulo(p.getMontodescuento());
			            	   double Montoneto = ByosValidar.Nulo(TblCompras.getMontototal()) - ByosValidar.Nulo(TblCompras.getMontoimpuesto());
			            	   double Montocalculado = (Montoneto+Montodescuento+MontoDescuento);
			            	   Montocalculado = (Montodescuento/Montocalculado) * 100;
							   p.setPorcentaje(BigDecimal.valueOf(Montocalculado));
							   ActualizarDescuentoTotal();
							   ListaDescuentos.getDatagrid().refreshRowCache();	
			            	   
			               } catch (Exception e) {
			                   // Ingnored, we'll let the Form handle the errors
			               }
			           }
			        });						
					return ByosCampo01;
				}
			});	
			
    	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    
    public void closeWindows(){
        subwindow.close();
    }
     
    public void openWindows(){
       if(subwindow.getParent() != null) {
          Notification.show("Error", "No se puedo abrir la consulta",Notification.TYPE_TRAY_NOTIFICATION);
       }else {
    	   QuantumUI.getCurrent().addWindow(subwindow);                  
       }        
     }
    
    public void ActualizarDescuentoTotal(){    
		/*TotalMontoDescuento=0;
		TotalPorcentajeDescuento=0;
        if(ArrayTblComprasDescuentos!=null && ArrayTblComprasDescuentos.size()>0){
           for(int f=0;f<ArrayTblComprasDescuentos.size();f++){
        	   tblComprasDescuentos tbl = (tblComprasDescuentos)ArrayTblComprasDescuentos.get(f);
        	   if(tbl.getMontodescuento()!=null){
        		  TotalMontoDescuento+=tbl.getMontodescuento().doubleValue();
        	   }       	   
           }
        }  */
    	
    	
		TotalMontoDescuento=0;
		TotalPorcentajeDescuento=0;
        if(ArrayTblComprasDescuentos!=null && ArrayTblComprasDescuentos.size()>0){
           
     	   double Montototal = ByosValidar.Nulo(TblCompras.getMontototal());
     	   double Montoimpuesto = ByosValidar.Nulo(TblCompras.getMontoimpuesto());
     	   double Montocalculado = (Montototal-Montoimpuesto);
     	   System.out.println("Monto Calculado: "  + Montocalculado);
           for(int f=0;f<ArrayTblComprasDescuentos.size();f++){
        	   
        	   tblComprasDescuentos tbl = (tblComprasDescuentos)ArrayTblComprasDescuentos.get(f);
        	   double porcentaje=ByosValidar.Nulo(tbl.getPorcentaje());
        	   double montodescuento=ByosValidar.Nulo(tbl.getMontodescuento());
               if(porcentaje>0){
        	      double MontoDescuento = (Montocalculado+montodescuento) * porcentaje / 100;
        	      System.out.println("Monto Descuento: "  + MontoDescuento);
        	      Montocalculado-=MontoDescuento;
        	      ((tblComprasDescuentos)ArrayTblComprasDescuentos.get(f)).setMontodescuento(BigDecimal.valueOf(MontoDescuento));
        	   
        	      if(tbl.getMontodescuento()!=null){
        		     TotalMontoDescuento+=MontoDescuento;
        	      }
               }
           }
        }       
    	
        ListaDescuentos.getDatagrid().setColumnFooter("montodescuento", ByosConversores.DoubleToString(TotalMontoDescuento, 3));
    }
    
    public String EstatusImpuestos(){
    	ActualizarDescuentoTotal();
        if(ArrayTblComprasDescuentos!=null && ArrayTblComprasDescuentos.size()>0){
            for(int f=0;f<ArrayTblComprasDescuentos.size();f++){
         	   tblComprasDescuentos tbl = (tblComprasDescuentos)ArrayTblComprasDescuentos.get(f);
         	   if(tbl.getMontodescuento()!=null || tbl.getPorcentaje()!=null){         		  
         		  double porcentaje=0;
         		  double montodescuento=0;

      	      
         	      if(tbl.getMontodescuento()!=null){
         	    	 montodescuento=tbl.getMontodescuento().doubleValue(); 
         	      }
         	      
         	      if(tbl.getPorcentaje()!=null){
         	    	 porcentaje=tbl.getPorcentaje().doubleValue(); 
         	      }
         	      
         	      if(porcentaje!=0 && montodescuento==0){
         		      return "Error en monto descuento " + f+1;
         	      }         	      
         	      if(montodescuento!=0 && porcentaje==0){
         		     return "Error en porcentaje descuento " + f+1;
         	      }
         	      
         	      /*if(!ByosValidar.ToleranciaNumerica(porcentaje*porcentaje/100,montodescuento)){
         	    	 return "La tolerancia del impuesto " + tbl.getDescripcion() + " sobrepasa el limite permitido"; 
         	      }*/
         	   }
            } 
        }
        return "ok";
    }
}
