package Interfaz;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class PanelBotonesAvion
extends JPanel
implements ActionListener
{
public static final String REGISTRAR = "REGISTRAR_PASAJERO";
public static final String ANULAR = "ANULAR_PASAJERO";
public static final String BUSCAR = "BUSCAR_PASAJERO";
public static final String PORCENTAJE = "PORCENTAJE_OCUPACION";
private static final String OPCION_1 = "OPCION_1";
private static final String OPCION_2 = "OPCION_2";
private JButton bRegistro;
private JButton bAnular;
private JButton bBuscarPasajero;
private JButton bPorcOcupacion;
private JButton botonOpcion1;
private JButton botonOpcion2;
private InterfazAvion ventana;

public PanelBotonesAvion(InterfazAvion laVentana)
{
  ventana = laVentana;
  

  setLayout(new GridLayout(2, 3, 8, 2));
  setBorder(new EmptyBorder(5, 5, 5, 5));
  

  bRegistro = new JButton("Registrar Pasajero");
  bRegistro.setActionCommand("REGISTRAR_PASAJERO");
  bRegistro.addActionListener(this);
  bRegistro.setPreferredSize(new Dimension(40, 10));
  add(bRegistro);
  

  bAnular = new JButton("Eliminar Pasajero");
  bAnular.setActionCommand("ANULAR_PASAJERO");
  bAnular.addActionListener(this);
  add(bAnular);
  

  bBuscarPasajero = new JButton("Buscar Pasajero");
  bBuscarPasajero.setActionCommand("BUSCAR_PASAJERO");
  bBuscarPasajero.addActionListener(this);
  add(bBuscarPasajero);
  

  bPorcOcupacion = new JButton("Porcentaje Ocupación");
  bPorcOcupacion.setActionCommand("PORCENTAJE_OCUPACION");
  bPorcOcupacion.addActionListener(this);
  add(bPorcOcupacion);
  

  botonOpcion1 = new JButton("Opción 1");
  botonOpcion1.setActionCommand("OPCION_1");
  botonOpcion1.addActionListener(this);
  add(botonOpcion1);
  botonOpcion2 = new JButton("Opción 2");
  botonOpcion2.setActionCommand("OPCION_2");
  botonOpcion2.addActionListener(this);
  add(botonOpcion2);
 }
public void actionPerformed(ActionEvent evento)
{
  String comando = evento.getActionCommand();
  
  if (comando.equals("REGISTRAR_PASAJERO"))
  {
    ventana.registrarPasajero();
  }
  else if (comando.equals("ANULAR_PASAJERO"))
  {
    ventana.anularPasajero();
  }
  else if (comando.equals("BUSCAR_PASAJERO"))
  {
    ventana.buscarPasajero();
  }
  else if (comando.equals("PORCENTAJE_OCUPACION"))
  {
    ventana.mostrarPorcentajeOcupacion();
  }
  else if (comando.equals("OPCION_1"))
  {
    ventana.reqFuncOpcion1();
  }
  else if (comando.equals("OPCION_2"))
  {
    ventana.reqFuncOpcion2();
  }
}
}
