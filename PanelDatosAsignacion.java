package Interfaz;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class PanelDatosAsignacion
extends JPanel
implements ActionListener
{
private static final String CLASE_EJECUTIVA = "Clase ejecutiva";
private static final String CLASE_ECONOMICA = "Clase económica";
private static final String UBICACION_VENTANA = "Ventana";
private static final String UBICACION_PASILLO = "Pasillo";
private static final String UBICACION_CENTRO = "Centro";
private JComboBox cbClase;
private JComboBox cbUbicacion;
private JTextField txtCedula;
private JTextField txtNombre;

public PanelDatosAsignacion()
{
  setLayout(new GridLayout(4, 1, 1, 6));
  setBorder(BorderFactory.createTitledBorder("Datos del pasajero"));
  

  JPanel panelCedula = new JPanel();
  panelCedula.setLayout(new FlowLayout(2, 5, 0));
  JLabel etiquetaCedula = new JLabel("Cédula ");
  txtCedula = new JTextField();
  txtCedula.setColumns(15);
  panelCedula.add(etiquetaCedula);
  panelCedula.add(txtCedula);
  add(panelCedula);
  

  JPanel panelNombre = new JPanel();
  panelNombre.setLayout(new FlowLayout(2, 5, 0));
  JLabel etiquetaNombre = new JLabel("Nombre ");
  txtNombre = new JTextField();
  txtNombre.setColumns(15);
  panelNombre.add(etiquetaNombre);
  panelNombre.add(txtNombre);
  add(panelNombre);
  

  JPanel pUbicacion = new JPanel(new FlowLayout(2));
  pUbicacion.setPreferredSize(new Dimension(250, 30));
  JLabel lUbicacion = new JLabel("Ubicación ");
  cbUbicacion = new JComboBox();
  cbUbicacion.setAlignmentX(0.0F);
  cbUbicacion.setPreferredSize(txtCedula.getPreferredSize());
  cbUbicacion.addActionListener(this);
  pUbicacion.add(lUbicacion);
  pUbicacion.add(cbUbicacion);
  

  JPanel pClase = new JPanel(new FlowLayout(2));
  pClase.setPreferredSize(new Dimension(250, 30));
  JLabel lClase = new JLabel("Clase ");
  cbClase = new JComboBox();
  cbClase.setAlignmentX(0.0F);
  cbClase.addActionListener(this);
  cbClase.addItem("Clase económica");
  cbClase.addItem("Clase ejecutiva");
  cbClase.setPreferredSize(txtCedula.getPreferredSize());
  pClase.add(lClase);
  pClase.add(cbClase);
  
  add(pClase);
  add(pUbicacion);
 }
public String darNombre()
{
  return txtNombre.getText();
}
public String darCedula()
{
  return txtCedula.getText();
}
public int darClase()
{
  String sClase = (String)cbClase.getSelectedItem();
  if (sClase.equals("Clase ejecutiva")) {
    return 1;
  }
  return 2;
}
public char darUbicacion()
{
  String sUbicacion = (String)cbUbicacion.getSelectedItem();
  if (sUbicacion.equals("Ventana"))
    return '\001';
  if (sUbicacion.equals("Pasillo")) {
    return '\003';
  }
  return '\002';
}
public void actionPerformed(ActionEvent evento)
{
  if (evento.getSource() == cbClase)
  {
    String sClase = (String)cbClase.getSelectedItem();
    
    if (sClase.equals("Clase ejecutiva"))
    {
      cbUbicacion.removeAllItems();
      cbUbicacion.addItem("Ventana");
      cbUbicacion.addItem("Pasillo");
    }
    else
    {
      cbUbicacion.removeAllItems();
      cbUbicacion.addItem("Ventana");
      cbUbicacion.addItem("Centro");
      cbUbicacion.addItem("Pasillo");
    }
    cbUbicacion.validate();
  }
}
}