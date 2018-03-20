package Interfaz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Mundo.Silla;
public class SillaGrafica
extends JPanel
{
private ImageIcon imagen;

public SillaGrafica(Silla silla)
{
  super(new BorderLayout());
  JLabel lSilla = new JLabel();
  if ((silla.darClase() == 1) && (silla.sillaAsignada())) {
    imagen = new ImageIcon("C:/Users/FANDA CARRILLO/Documents/TrabajosEclipse/Topicos/Avion/src/Interfaz/images (2).jpg");
  } else if ((silla.darClase() == 1) && (!silla.sillaAsignada())) {
    imagen = new ImageIcon("C:/Users/FANDA CARRILLO/Documents/TrabajosEclipse/Topicos/Avion/src/Interfaz/images (3).jpg");
  } else if ((silla.darClase() == 2) && (silla.sillaAsignada())) {
    imagen = new ImageIcon("C:/Users/FANDA CARRILLO/Documents/TrabajosEclipse/Topicos/Avion/src/Interfaz/images (2).jpg");
  } else if ((silla.darClase() == 2) && (!silla.sillaAsignada()))
  {
    imagen = new ImageIcon("C:/Users/FANDA CARRILLO/Documents/TrabajosEclipse/Topicos/Avion/src/Interfaz/descarga (7).jpg");
    lSilla.setForeground(Color.white);
  }
  setPreferredSize(new Dimension(imagen.getIconWidth(), imagen.getIconHeight()));
  setOpaque(false);
  lSilla.setPreferredSize(new Dimension(imagen.getIconWidth(), imagen.getIconHeight()));
  lSilla.setHorizontalAlignment(0);
  add(lSilla);
}
public void paint(Graphics grafica)
{
  grafica.drawImage(imagen.getImage(), 0, 0, null, null);
  super.paint(grafica);
}
}