package Interfaz;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Mundo.Pasajero;
import Mundo.Silla;
public class PanelDatosPasajero
  extends JPanel
{
  private JTextField txtCedula;
  private JTextField txtNombre;
  private JTextField txtClase;
  private JTextField txtUbicacion;
  private JTextField txtSilla;
  
  public PanelDatosPasajero(Pasajero pasajero, Silla silla)
  {
    setLayout(new GridLayout(5, 1, 1, 1));
    setBorder(BorderFactory.createTitledBorder("Datos del pasajero"));
    

    JPanel panelCedula = new JPanel();
    panelCedula.setLayout(new FlowLayout(2, 5, 0));
    JLabel etiquetaCedula = new JLabel("Cédula ");
    txtCedula = new JTextField(Integer.toString(pasajero.darCedula()));
    txtCedula.setColumns(15);
    txtCedula.setEditable(false);
    panelCedula.add(etiquetaCedula);
    panelCedula.add(txtCedula);
    add(panelCedula);
    

    JPanel panelNombre = new JPanel();
    panelNombre.setLayout(new FlowLayout(2, 5, 0));
    JLabel etiquetaNombre = new JLabel("Nombre ");
    txtNombre = new JTextField(pasajero.darNombre());
    txtNombre.setColumns(15);
    txtNombre.setEditable(false);
    panelNombre.add(etiquetaNombre);
    panelNombre.add(txtNombre);
    add(panelNombre);
    

    JPanel panelSilla = new JPanel();
    panelSilla.setLayout(new FlowLayout(2, 5, 0));
    JLabel etiquetaSilla = new JLabel("Silla ");
    txtSilla = new JTextField(Integer.toString(silla.darNumero()));
    txtSilla.setColumns(15);
    txtSilla.setEditable(false);
    panelSilla.add(etiquetaSilla);
    panelSilla.add(txtSilla);
    add(panelSilla);
    

    JPanel panelClase = new JPanel();
    panelClase.setLayout(new FlowLayout(2, 5, 0));
    JLabel etiquetaClase = new JLabel("Clase ");
    String sClase; if (silla.darClase() == 2)
    {
      sClase = "Económica";
    }
    else
    {
      sClase = "Ejecutiva";
    }
    txtClase = new JTextField(sClase);
    txtClase.setColumns(15);
    txtClase.setEditable(false);
    panelClase.add(etiquetaClase);
    panelClase.add(txtClase);
    add(panelClase);
    

    JPanel panelUbicacion = new JPanel();
    panelUbicacion.setLayout(new FlowLayout(2, 5, 0));
    JLabel etiquetaUbicacion = new JLabel("Ubicación ");
    String sUbicacion;
     if (silla.darUbicacion() == 2)
    {
      sUbicacion = "Centro";
    } else {
      if (silla.darUbicacion() == 3)
      {
        sUbicacion = "Pasillo";
      }
      else
      {
        sUbicacion = "Ventana"; }
    }
    txtUbicacion = new JTextField(sUbicacion);
    txtUbicacion.setColumns(15);
    txtUbicacion.setEditable(false);
    panelUbicacion.add(etiquetaUbicacion);
    panelUbicacion.add(txtUbicacion);
    add(panelUbicacion);
  }
}
