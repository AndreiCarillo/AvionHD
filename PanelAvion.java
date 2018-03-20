package Interfaz;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Mundo.Avion;
import Mundo.Silla;
public class PanelAvion extends JPanel
{
private Avion avion;
private ImageIcon imagen;

public PanelAvion(Avion avion1)
{
  super(new BorderLayout());
  avion = avion1;
  imagen = new ImageIcon("C:/Users/FANDA CARRILLO/Documents/TrabajosEclipse/Topicos/Avion/src/Interfaz/fondo-de-llamas-de-fuego_23-2147518093.jpg");
  setPreferredSize(new Dimension(imagen.getIconWidth(), imagen.getIconHeight()));
  setOpaque(false);
  

  JPanel panelEjecutivas = new JPanel();
  dibujarSillasEjecutivas(panelEjecutivas);
  add(panelEjecutivas, "North");
  

  JPanel panelEconomicas = new JPanel();
  dibujarSillasEconomicas(panelEconomicas);
  add(panelEconomicas, "Center");
}
public void paint(Graphics grafica)
{
  grafica.drawImage(imagen.getImage(), 0, 0, null, null);
  super.paint(grafica);
}
private void dibujarSillasEjecutivas(JPanel panel)
{
  panel.setLayout(new GridLayout(2, 5, 8, 5));
  panel.setBorder(new EmptyBorder(90, 210, 20, 210));
  
  Silla[] ejecutivas = avion.obtenerSillasEjecutivas();
  

  for (int i = 0; i < ejecutivas.length; i++)
  {
    Silla silla = ejecutivas[i];
    SillaGrafica sillaG = new SillaGrafica(silla);
    panel.add(sillaG);
    if (i % 4 == 1)
    {
      panel.add(new JLabel(" "));
    }
  }
  panel.setOpaque(false);
}
private void dibujarSillasEconomicas(JPanel panel)
{
  panel.setLayout(new GridLayout(7, 7, 5, 4));
  panel.setBorder(new EmptyBorder(0, 200, 100, 200));
  
  Silla[] economicas = avion.obtenerSillasEconomicas();
  

  for (int i = 0; i < economicas.length; i++)
  {
    Silla silla = economicas[i];
    
    SillaGrafica sillaG = new SillaGrafica(silla);
    panel.add(sillaG);
    if (i % 6 == 2)
    {
      panel.add(new JLabel(" "));
    }
  }
  panel.setOpaque(false);
}
}