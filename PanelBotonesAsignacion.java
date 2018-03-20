package Interfaz;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
public class PanelBotonesAsignacion extends JPanel implements ActionListener
{
public static final String ACEPTAR = "ACEPTAR";
public static final String CANCELAR = "CANCELAR";
private JButton botonAceptar;
private JButton botonCancelar;
private DialogoAsignacion dialogo;

public PanelBotonesAsignacion(DialogoAsignacion elDialogo)
{
  setLayout(new GridLayout(1, 2, 8, 1));
  dialogo = elDialogo;
  

  botonAceptar = new JButton();
  botonAceptar.setText("Aceptar");
  botonAceptar.setActionCommand("ACEPTAR");
  botonAceptar.addActionListener(this);
  add(botonAceptar);
  

  botonCancelar = new JButton();
  botonCancelar.setText("Cancelar");
  botonCancelar.setActionCommand("CANCELAR");
  botonCancelar.addActionListener(this);
  add(botonCancelar);
 }
public void actionPerformed(ActionEvent evento)
{
  String comando = evento.getActionCommand();
  
  if (comando.equals("ACEPTAR"))
  {
    dialogo.registrar();
  }
  else if (comando.equals("CANCELAR"))
  {
    dialogo.cancelar();
  }
}
}
