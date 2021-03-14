package com.thiago.cursojava.applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//OBS
//Para rodar essa classe: botão direito > run as > java applet
public class Triangulo extends Applet{
	
	//Override para incluir os triangulos
	public void paint(Graphics g) {
		int[] xPoints = {0,40,80};
		int[] yPoints = {50,0,50};
		g.setColor(Color.blue);
		//Metodo para desenhar os triangulos
		g.fillPolygon(xPoints, yPoints, 3);
		int[] x2Points = {80,160,0};
		int[] y2Points = {50,140,140};
		g.setColor(Color.black);
		g.fillPolygon(x2Points, y2Points, 3);
	}

}
