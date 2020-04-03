package view;

import processing.core.PApplet;
import processing.core.PImage;
import model.Netflix;
import model.Categoria;
import model.CompareC;
import java.util.LinkedList;
import java.util.Collections;
import controller.ControllerMain;

public class Main extends PApplet {

	PImage breakingbad;
	PImage dark;
	PImage mindhunter;
	PImage ozark;
	PImage startrek;
	PImage strangerthings;
	PImage theirishman;

	private ControllerMain controller;

	// txt
	String[] listaPalabras1, listP1;
	// lista
	private LinkedList<Netflix> listaPeli;

	public static void main(String[] args) {
		PApplet.main("view.Main");
	}

	public void settings() {
		size(800, 800);

	}

	public void setup() {
		controller = new ControllerMain();

		// imagenes pantalla
		breakingbad = loadImage("images/breakingbad.jpg");
		dark = loadImage("images/darkjpg");
		mindhunter = loadImage("images/mindhunter.jpg");
		ozark = loadImage("images/ozark.jpg");
		startrek = loadImage("images/startrek.jpg");
		strangerthings = loadImage("images/strangerthings.jpg");
		theirishman = loadImage("images/theirishman.jpg");

		// cargar txt

		listaPalabras1 = loadStrings("texto/netflix.txt");
		// split palabras en la mismalinea
		// listP1 = listaPalabras1[0].split(",");
		// lista
		listaPeli = new LinkedList<Netflix>();

		// arreglo para recorrer las posiicones del txt
		for (int i = 0; i < listaPalabras1.length; i++) {

			listP1 = listaPalabras1[i].split(",");
			listaPeli.add(new Netflix(listP1[0], listP1[1], listP1[2], listP1[3]));
			// String reating= listP1[0];
		}

	}

	public void draw() {

		background(0);
		

		for (int i = 0; i < listaPeli.size(); i++) {

			fill(255);
			ellipse(200, 100 + i * 50, 50, 50);

			Netflix n = listaPeli.get(i);
			// concatenar cadenas de texto
			text(n.getNombre() + " " + n.getAño() + " " + n.getReating() + " " + n.getCategoria(), 260, 100 + i * 50);
		} // cierra for

		fill(255);
		text("Key A = ordena el Nombre", 260, 650);
		text("Key S = ordena el Reating", 260, 665);
		text("Key D = ordena el Año", 260, 680);
		text("Key F = ordena la Categoria", 260, 695);

	}

	public void keyPressed() {

		/*
		 * if(key =='a' || key =='A') {
		 * 
		 * Collections.sort(listaPeli, new CompareNombre());
		 * 
		 * 
		 * 
		 * if(key =='s' || key =='S') {
		 * 
		 * Collections.sort(listaPeli, new CompareId());
		 * 
		 * }
		 * 
		 * if(key =='d' || key =='D') {
		 * 
		 * Collections.sort(listaPeli, new CompareEdad());
		 * 
		 * }
		 * 
		 * if(key =='f' || key =='F') {
		 * 
		 * Collections.sort(listaPeli, new CompareRaza());
		 * 
		 * }
		 * 
		 * if(key =='g' || key =='G') {
		 * 
		 * Collections.sort(listaPeli, new CompareFecha());
		 * 
		 * }
		 */

	}

}// cierra main
