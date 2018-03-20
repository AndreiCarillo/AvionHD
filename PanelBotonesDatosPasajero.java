package Interfaz;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
public class PanelBotonesDatosPasajero extends JPanel implements ActionListener
{
public static final String ACEPTAR = "ACEPTAR";
private VentanaDatosPasajero ventana;
private JButton botonAceptar;

public PanelBotonesDatosPasajero(VentanaDatosPasajero laVentana)
{
  setLayout(new GridLayout(1, 2, 10, 1));
  ventana = laVentana;
  

  botonAceptar = new JButton();
  botonAceptar.setText("Aceptar");
  botonAceptar.setActionCommand("ACEPTAR");
  botonAceptar.addActionListener(this);
  add(botonAceptar);
}
public void actionPerformed(ActionEvent evento)
{
  String comando = evento.getActionCommand();
  
  if (comando.equals("ACEPTAR"))
  {
    ventana.aceptar();
  }
 }
}

