package com.everis.logback_desafioeveris;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Formación - Desafío Logback
 * 
 * @author Juan Manuel Hermida Acuña
 *
 */

public class App {
	/** LOGGER */
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		LOGGER.info("Inicio del método");

		/*
		 * LOGGER.trace(""); LOGGER.debug(""); LOGGER.info(""); LOGGER.warn(""); LOGGER.error("");
		 */

		/*
		 * Creo una matriz, para imprimir filas y columnas con el LOGGER.
		 */
		int[][] matriz = { { 2, 4, 4 }, { 6, 6, 9 }, { 8, 10, 12 } };

		for (int i = 0; i < matriz.length; i++) {
			/*
			 * En esta traza nos mostrará el número de veces que se ha ido ejectuando el bucle, dependinedo de el número de filas.
			 *
			 */
			LOGGER.trace("Interación del bucle para las filas: {}", i);
			for (int j = 0; j < matriz[i].length; j++) {
				/*
				 * En esta traza, se nos mostrará el número de veces que se ha ido eectuando el bucle, dependiendo del número de columnas.
				 */
				LOGGER.trace("Iteración del bucle para las columnas: {}", j);

			}
		}

		LOGGER.info("Fin del método");
		
		/*
		 * Si dentro del logback.xml, cambiamos del level, a por ejemplo debug, 
		 * que es un nivel menos que el trace. Cuando ejecutemoo, no nos motrará la traza
		 */
	}
}
