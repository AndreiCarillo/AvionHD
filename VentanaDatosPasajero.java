package Interfaz;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import Mundo.Pasajero;
import Mundo.Silla;
public class VentanaDatosPasajero
extends JFrame
{
private PanelBotonesDatosPasajero panelBotones;
private PanelDatosPasajero panelDatosPasajero;

public VentanaDatosPasajero(Silla silla)
{
  Pasajero pasajero = silla.darPasajero();
  setLayout(new BorderLayout());
  

  panelDatosPasajero = new PanelDatosPasajero(pasajero, silla);
  add(panelDatosPasajero, "North");
  

  panelBotones = new PanelBotonesDatosPasajero(this);
  add(panelBotones, "South");
  
  setTitle("Datos registro del pasajero");
  pack();
  setResizable(false);
  setDefaultCloseOperation(2);
}
public void aceptar()
{
  dispose();
}
}
