package com.modulo.reserva;

import java.io.Serializable;

import com.modulo.componentes.ByosImagenes;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class moduloGolpeVista   extends AbsoluteLayout  implements Serializable{
    private static final long serialVersionUID = 5474522369804563317L;
    
    
    
    public moduloGolpeVista() {
        setWidth("100%");
        setHeight("100%");

    	Embedded reindeerImage = null;
        reindeerImage = new Embedded( null, new ThemeResource("imagen/FondoGolpeVista905x768A.jpg"));
        reindeerImage.setWidth( "100%" ); 
        reindeerImage.setHeight( "100%" );
        reindeerImage.addClickListener(new com.vaadin.event.MouseEvents.ClickListener() {
            @Override
            public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
                     	
            }
        });
        //addComponent(reindeerImage);
        Titulo();
    }

    void Titulo() {
    	/* Texto de Ayuda de Ayuda */
    	Label TituloAyuda = new Label();    
        TituloAyuda.setWidth("100%");
        TituloAyuda.setHeight("100px");
        TituloAyuda.setStyleName("LabelTituloAyuda");
        TituloAyuda.setValue("HOLA SALUDOS");
        addComponent(TituloAyuda, "left: 0px; top: 0px;");
        
        /* Titulo de Datos y fotos */
        
        /* Titulo Izquierda        */
        Label Titulo01 = new Label();
        Titulo01.setWidth("287px");
        Titulo01.setHeight("31px");
        Titulo01.setStyleName("LabelTituloDatosGolpeVista01");
        Titulo01.setValue("INFORMACION DE SUS ESTANCIA");
        addComponent(Titulo01, "left: 0px; top: 108px;");

        /* Titulo Foto             */
        Label Titulo02 = new Label();
        Titulo02.setWidth("449px");
        Titulo02.setHeight("38px");
        Titulo02.setStyleName("LabelTituloDatosGolpeVista02");
        Titulo02.setValue("CAMILA");
        addComponent(Titulo02, "left: 287px; top: 100px;");            
        
        /* Titulo Derecha          */
        Label Titulo03 = new Label();
        Titulo03.setWidth("288px");
        Titulo03.setHeight("31px");
        Titulo03.setStyleName("LabelTituloDatosGolpeVista01");
        Titulo03.setValue("INFORMACION DE SUS ESTANCIA");
        addComponent(Titulo03, "left: 735px; top: 108px;");        

        /* Boton Paly             */
        Button btoPlay = new Button("PLAY");
        btoPlay.setWidth("73px");
        btoPlay.setHeight("32px");
        btoPlay.setStyleName("BotonPalyStopGolpeVista");
        addComponent(btoPlay, "left: 287px; top: 103px;"); 
        
        /* OK Izquierdo           */
        Label iOk01 = new Label();
        iOk01.setWidth("73px");
        iOk01.setHeight("111px");
        iOk01.setStyleName("LabelOKGolpeVista");
        iOk01.setValue("OK");
        addComponent(iOk01, "left: 287px; top: 139px;");        

        /* Fecha                   */
        
        /* Titulo Dia              */
        Label iTDia01 = new Label();
        iTDia01.setWidth("73px");
        iTDia01.setHeight("19px");
        iTDia01.setStyleName("LabelTituloFechaGolpeVista");
        iTDia01.setValue("D I A");
        addComponent(iTDia01, "left: 287px; top: 250px;");  
        
        /* Dia                     */
        Label iDia01 = new Label();
        iDia01.setWidth("73px");
        iDia01.setHeight("33px");
        iDia01.setStyleName("LabelFecha01GolpeVista");
        iDia01.setValue("01");
        addComponent(iDia01, "left: 287px; top: 266px;"); 
        
        /* Titulo Mes              */
        Label iTMes01 = new Label();
        iTMes01.setWidth("73px");
        iTMes01.setHeight("19px");
        iTMes01.setStyleName("LabelTituloFechaGolpeVista");
        iTMes01.setValue("M E S");
        addComponent(iTMes01, "left: 287px; top: 299px;");  
        
        /* Mes                     */
        Label iMes01 = new Label();
        iMes01.setWidth("73px");
        iMes01.setHeight("33px");
        iMes01.setStyleName("LabelFecha02GolpeVista");
        iMes01.setValue("01");
        addComponent(iMes01, "left: 287px; top: 318px;"); 

        /* Titulo Anio              */
        Label iTAnio01 = new Label();
        iTAnio01.setWidth("73px");
        iTAnio01.setHeight("19px");
        iTAnio01.setStyleName("LabelTituloFechaGolpeVista");
        iTAnio01.setValue("A Ñ O");
        addComponent(iTAnio01, "left: 287px; top: 351px;");  
        
        /* Anio                     */
        Label iAnio01 = new Label();
        iAnio01.setWidth("73px");
        iAnio01.setHeight("33px");
        iAnio01.setStyleName("LabelFecha03GolpeVista");
        iAnio01.setValue("18");
        addComponent(iAnio01, "left: 287px; top: 370px;"); 
        
        /* Comunicacion             */
        Button iComunicacion01 = new Button();
        iComunicacion01.setWidth("73px");
        iComunicacion01.setHeight("47px");
        iComunicacion01.setStyleName("BotonComunicacionGolpeVista");
        addComponent(iComunicacion01, "left: 287px; top: 403px;");       
        
        
        
        
        
        /* Columna de Datos  01     */

        /* Layout Datos             */
        
        VerticalLayout iLayoutDatos01 = new VerticalLayout();
        iLayoutDatos01.setWidth("70px");
        iLayoutDatos01.setHeight("264px");
        iLayoutDatos01.setStyleName("LayoutDatosGolpeVista");
        addComponent(iLayoutDatos01, "left: 360px; top: 139px;");  
        
        /* Titulo Dato 01           */
        Label iTDato01 = new Label();
        iTDato01.setWidth("60px");
        iTDato01.setHeight("18px");
        iTDato01.setStyleName("LabelTituloDatos01GolpeVista");
        iTDato01.setValue("Sexo");
        addComponent(iTDato01, "left: 365px; top: 146px;");  
        
        /* Dato 01                  */
        Label iDato01 = new Label();
        iDato01.setWidth("50px");
        iDato01.setHeight("22px");
        iDato01.setStyleName("LabelDatos01GolpeVista");
        iDato01.setValue("");
        addComponent(iDato01, "left: 371px; top: 170px;"); 
        
        /* Titulo Dato 02          */
        Label iTDato02 = new Label();
        iTDato02.setWidth("60px");
        iTDato02.setHeight("18px");
        iTDato02.setStyleName("LabelTituloDatos01GolpeVista");
        iTDato02.setValue("Docto.");
        addComponent(iTDato02, "left: 365px; top: 200px;");  
        
        /* Dato 02                  */
        Label iDato02 = new Label();
        iDato02.setWidth("50px");
        iDato02.setHeight("22px");
        iDato02.setStyleName("LabelDatos01GolpeVista");
        iDato02.setValue("");
        addComponent(iDato02, "left: 371px; top: 224px;");        
        
        /* Titulo Dato 03          */
        Label iTDato03 = new Label();
        iTDato03.setHeight("18px");
        iTDato03.setWidth("60px");
        iTDato03.setStyleName("LabelTituloDatos01GolpeVista");
        iTDato03.setValue("Valido");
        addComponent(iTDato03, "left: 365px; top: 254px;");  
        
        /* Dato 03                  */
        Label iDato03 = new Label();
        iDato03.setWidth("50px");
        iDato03.setHeight("22px");
        iDato03.setStyleName("LabelDatos01GolpeVista");
        iDato03.setValue("");
        addComponent(iDato03, "left: 371px; top: 278px;");    
        
        /* Titulo Dato 04          */
        Label iTDato04 = new Label();
        iTDato04.setHeight("18px");
        iTDato04.setWidth("60px");
        iTDato04.setStyleName("LabelTituloDatos01GolpeVista");
        iTDato04.setValue("Pasap");
        addComponent(iTDato04, "left: 365px; top: 307px;");  
        
        /* Dato 04                  */
        Label iDato04 = new Label();
        iDato04.setWidth("50px");
        iDato04.setHeight("22px");
        iDato04.setStyleName("LabelDatos01GolpeVista");
        iDato04.setValue("");
        addComponent(iDato04, "left: 371px; top: 329px;");  
        
        /* Titulo Dato 05          */
        Label iTDato05 = new Label();
        iTDato05.setHeight("18px");
        iTDato05.setWidth("60px");
        iTDato05.setStyleName("LabelTituloDatos01GolpeVista");
        iTDato05.setValue("Valido");
        addComponent(iTDato05, "left: 365px; top: 355px;");  
        
        /* Dato 05                  */
        Label iDato05 = new Label();
        iDato05.setWidth("50px");
        iDato05.setHeight("22px");
        iDato05.setStyleName("LabelDatos01GolpeVista");
        iDato05.setValue("");
        addComponent(iDato05, "left: 371px; top: 376px;");         
        

        
        
        
        
        /* Boton Stop             */
        Button btoStop = new Button("STOP");        
        btoStop.setWidth("74px");
        btoStop.setHeight("32px");
        btoStop.setStyleName("BotonPalyStopGolpeVista");
        addComponent(btoStop, "left: 661px; top: 103px;"); 

        /* OK Derecha           */
        Label dOk01 = new Label();
        dOk01.setWidth("73px");
        dOk01.setHeight("111px");
        dOk01.setStyleName("LabelOKGolpeVista");
        dOk01.setValue("OK");
        addComponent(dOk01, "left: 661px; top: 139px;");        

        /* Fecha                   */
        
        /* Titulo Dia              */
        Label dTDia01 = new Label();
        dTDia01.setWidth("73px");
        dTDia01.setHeight("19px");
        dTDia01.setStyleName("LabelTituloFechaGolpeVista");
        dTDia01.setValue("HORA");
        addComponent(dTDia01, "left: 661px; top: 250px;");  
        
        /* Dia                     */
        Label dDia01 = new Label();
        dDia01.setWidth("73px");
        dDia01.setHeight("33px");
        dDia01.setStyleName("LabelFecha01GolpeVista");
        dDia01.setValue("01");
        addComponent(dDia01, "left: 661px; top: 266px;"); 
        
        /* Titulo Mes              */
        Label dTMes01 = new Label();
        dTMes01.setWidth("73px");
        dTMes01.setHeight("19px");
        dTMes01.setStyleName("LabelTituloFechaGolpeVista");
        dTMes01.setValue("MINUTO");
        addComponent(dTMes01, "left: 661px; top: 299px;");  
        
        /* Mes                     */
        Label dMes01 = new Label();
        dMes01.setWidth("73px");
        dMes01.setHeight("33px");
        dMes01.setStyleName("LabelFecha02GolpeVista");
        dMes01.setValue("01");
        addComponent(dMes01, "left: 661px; top: 318px;"); 

        /* Titulo Anio              */
        Label dTAnio01 = new Label();
        dTAnio01.setWidth("73px");
        dTAnio01.setHeight("19px");
        dTAnio01.setStyleName("LabelTituloFechaGolpeVista");
        dTAnio01.setValue("SEGUNDO");
        addComponent(dTAnio01, "left: 661px; top: 351px;");  
        
        /* Anio                     */
        Label dAnio01 = new Label();
        dAnio01.setWidth("73px");
        dAnio01.setHeight("33px");
        dAnio01.setStyleName("LabelFecha03GolpeVista");
        dAnio01.setValue("18");
        addComponent(dAnio01, "left: 661px; top: 370px;"); 
        
        /* Comunicacion             */
        Button dComunicacion01 = new Button();
        dComunicacion01.setWidth("73px");
        dComunicacion01.setHeight("47px");
        dComunicacion01.setStyleName("BotonComunicacionGolpeVista");
        addComponent(dComunicacion01, "left: 661px; top: 403px;");       

        
        
        
        /* Columna de Datos  02     */

        /* Layout Datos             */
        
        VerticalLayout dLayoutDatos01 = new VerticalLayout();
        dLayoutDatos01.setWidth("70px");
        dLayoutDatos01.setHeight("264px");
        dLayoutDatos01.setStyleName("LayoutDatosGolpeVista");
        addComponent(dLayoutDatos01, "left: 591px; top: 139px;");  
        
        /* Titulo Dato 01           */
        Label dTDato01 = new Label();
        dTDato01.setWidth("60px");
        dTDato01.setHeight("18px");
        dTDato01.setStyleName("LabelTituloDatos01GolpeVista");
        dTDato01.setValue("Edad");
        addComponent(dTDato01, "left: 596px; top: 146px;");  
        
        /* Dato 01                  */
        Label dDato01 = new Label();
        dDato01.setWidth("50px");
        dDato01.setHeight("22px");
        dDato01.setStyleName("LabelDatos01GolpeVista");
        dDato01.setValue("");
        addComponent(dDato01, "left: 602px; top: 170px;"); 
        
        /* Titulo Dato 02          */
        Label dTDato02 = new Label();
        dTDato02.setWidth("60px");
        dTDato02.setHeight("18px");
        dTDato02.setStyleName("LabelTituloDatos01GolpeVista");
        dTDato02.setValue("Color");
        addComponent(dTDato02, "left: 596px; top: 200px;");  
        
        /* Dato 02                  */
        Label dDato02 = new Label();
        dDato02.setWidth("50px");
        dDato02.setHeight("22px");
        dDato02.setStyleName("LabelDatos01GolpeVista");
        dDato02.setValue("");
        addComponent(dDato02, "left: 602px; top: 224px;");        
        
        /* Titulo Dato 03          */
        Label dTDato03 = new Label();
        dTDato03.setHeight("18px");
        dTDato03.setWidth("60px");
        dTDato03.setStyleName("LabelTituloDatos01GolpeVista");
        dTDato03.setValue("€ x Dia");
        addComponent(dTDato03, "left: 596px; top: 254px;");  
        
        /* Dato 03                  */
        Label dDato03 = new Label();
        dDato03.setWidth("50px");
        dDato03.setHeight("22px");
        dDato03.setStyleName("LabelDatos01GolpeVista");
        dDato03.setValue("");
        addComponent(dDato03, "left: 602px; top: 278px;");    
        
        /* Titulo Dato 04          */
        Label dTDato04 = new Label();
        dTDato04.setHeight("18px");
        dTDato04.setWidth("60px");
        dTDato04.setStyleName("LabelTituloDatos01GolpeVista");
        dTDato04.setValue("Promo");
        addComponent(dTDato04, "left: 596px; top: 307px;");  
        
        /* Dato 04                  */
        Label dDato04 = new Label();
        dDato04.setWidth("50px");
        dDato04.setHeight("22px");
        dDato04.setStyleName("LabelDatos01GolpeVista");
        dDato04.setValue("");
        addComponent(dDato04, "left: 602px; top: 329px;");  
        
        /* Titulo Dato 05          */
        Label dTDato05 = new Label();
        dTDato05.setHeight("18px");
        dTDato05.setWidth("60px");
        dTDato05.setStyleName("LabelTituloDatos01GolpeVista");
        dTDato05.setValue("Credito");
        addComponent(dTDato05, "left: 596px; top: 355px;");  
        
        /* Dato 05                  */
        Label dDato05 = new Label();
        dDato05.setWidth("50px");
        dDato05.setHeight("22px");
        dDato05.setStyleName("LabelDatos01GolpeVista");
        dDato05.setValue("");
        addComponent(dDato05, "left: 602px; top: 376px;");         
        
        /* Layout Para Foto        */
        VerticalLayout LayoutFoto = new VerticalLayout();
        LayoutFoto.setWidth("161px");
        LayoutFoto.setHeight("164px");
        LayoutFoto.setStyleName("LayoutFotoGolpeVista");
        addComponent(LayoutFoto, "left: 430px; top: 139px;");         
              
        /* Nivel                   */
        Label Nivel = new Label();
        Nivel.setWidth("161px");
        Nivel.setHeight("55px");
        Nivel.setStyleName("LabelDatos01GolpeVista");
        Nivel.setValue("");
        addComponent(Nivel, "left: 430px; top: 348px;");        
        
        /* Boton Para Abrir Albun de Fotos   */
        Button VerAlbun = new Button();
        VerAlbun.setWidth("161px");
        VerAlbun.setHeight("49px");
        VerAlbun.setStyleName("BotonComunicacionGolpeVista");
        addComponent(VerAlbun, "left: 430px; top: 300px;"); 

        
    }
    
}
