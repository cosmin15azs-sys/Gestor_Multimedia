/**
 * Práctica: Gestor Multimedia
 * Alumno: Cosmin Florin Mircea
 * Centro: IES José Luis Sampedro
 * Asignatura: Programación
 * Profesor: Fernando Poveda Sahuquillo 
 */
package com.gestor.main;

import java.util.Scanner;
import com.gestor.service.*;

public class Main {

//	static Pelicula p0 = new Pelicula("P-001", "Blade Runner", 1982, true, "Ridley Scott", 132, 6.5);

	static Scanner sc = new Scanner(System.in);

	static Contenido contenido1 = null;
	static Contenido contenido2 = null;
	static Contenido contenido3 = null;

	static int opcion = 1;
	static boolean salir = false;
	static int hueco = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {
			menu();
		} while (opcion != 0);
		System.out.println("FIN");
	}

	private static void menu() {
		// TODO Auto-generated method stub

		
		int varsta = 30;
		
		double precio = 2.99;
		
		System.out.println("maria e epedasa, are edad: "+varsta +" \npret "+ precio);
		
		
		System.out.println(
				"\n=== GESTOR MULTIMEDIA ===\r\n1) Crear/Registrar contenido\r\n2) Mostrar ficha\r\n3) Mostrar detalle\n4) Reproducir\r\n5) Descargar\r\n6) Calcular coste mensual\r\n7) Vaciar hueco\r\n0) Salir");
		System.out.print("Opción: ");
		opcion = sc.nextInt();

		switch (opcion) {

		case 1: {

			salir = false;
			hueco = 0;
			do {
				System.out.print("Hueco (1-3): ");
				hueco = sc.nextInt();

				switch (hueco) {
				case 1: {

					salir = true;
					break;
				}
				case 2: {
					salir = true;
					break;
				}
				case 3: {
					salir = true;
					break;
				}
				default: {
					System.out.println("Hueco no válido.");
					break;
				}
				}
			} while (!salir);

			salir = false;

			switch (hueco) {
			// cuando hueco vale 1
			case 1: {
				do {
					System.out.print("Tipo (1=Pelicula, 2=Podcast, 3=Curso):\nElige tipo: ");
					int tipo = sc.nextInt();
					switch (tipo) {
					// cuanto tipo vale 1
					case 1: {
						contenido1 = new Pelicula();
						if (contenido1 instanceof Pelicula) {
							Pelicula peli=(Pelicula)contenido1;
							sc.nextLine();
							System.out.print("ID: ");
							peli.setId(sc.nextLine());
							System.out.print("Título: ");
							peli.setTitulo(sc.nextLine());
							System.out.print("Año: ");
							peli.setAnyo(sc.nextInt());
							sc.nextLine();
							System.out.print("Premium (s/n): ");
							String letra = sc.nextLine();
							if (letra.equalsIgnoreCase("s"))
								peli.setPremium(true);
							else
								peli.setPremium(false);
							System.out.print("Director: ");
							peli.setDirector(sc.nextLine());
							System.out.print("Duración (min): ");
							peli.setDuracionMin(sc.nextInt());
							sc.nextLine();
							System.out.print("Calidad (GB): ");
							String numeroConPunto = sc.nextLine();
							double numeroConComa = Double.parseDouble(numeroConPunto.replace(",", "."));
							peli.setCalidadGB(numeroConComa);
							salir = true;
						}

						break;
					}

					/**
					 * EJEMPLO boolean datoValido = false; while (!datoValido) { try {
					 * System.out.println("introduce un numero entero: "); int tipo_int =
					 * Integer.parseInt(sc.nextLine().trim()); System.out.println(tipo_int);
					 * datoValido = true; } catch (java.lang.NumberFormatException e) {
					 * System.out.println("error: no se admiten decimales."); } }
					 */

					/**
					 * LECTURA DE DATOS: tres aspectos importantes: - usar un sólo scanner para
					 * todo: Scanner sc = new Scanner(System.in); - usar para cada tipo de dato su
					 * correspondiente método, utilizando el mismo scanner. tipo String -->>
					 * sc.nextLine(); tipo int --> sc.nextInt(); tipo double -->>sc.nextDouble();
					 * sc.nextBoolean();
					 * 
					 * Pasos a seguir: 1º. leer todos los datos como un texto(String) mediante
					 * sc.nextLine(); 2º. eliminar espacios con .trim(); 3º. parsear: es decir,
					 * convertir de texto(String) al tipo correspondiente (int, double o boolean) .
					 * 
					 * NOTA: cuando se trabaje con numeros decimales, al ser de tipo double, añadir
					 * .replace(",", ".") al parseo utilizado para evitar el error que sale al usar
					 * coma(,) en lugar de (.) cuando se introduce por teclado el número decimal. el
					 * metodo double solo admite punto (.). SABIAS QUE: para separar decimales: el
					 * punto (.) es el más utlizado internacionalmente. la coma(,) se usa mas en
					 * países como España por ejemplo.
					 * 
					 * EJEMPLO: System.out.println("introduce un numero decimal: "); double
					 * tipo_double = Double.parseDouble(sc.nextLine().trim().replace(",", "."));
					 * System.out.println(tipo_double); System.out.println("introduce un boolean
					 * (true/false):"); boolean tipo_boolean =
					 * Boolean.parseBoolean(sc.nextLine().trim()); System.out.println(tipo_boolean);
					 * /*
					 * 
					 * /** RECUERDA: - Integer.parseInt(""); --> convertir texto(String) a numero
					 * tipo entero(int) - Double.parseDouble(""); --> convertir texto(String) a
					 * numero tipo double(double) (son dos métodos muy útiles. hay que intentar
					 * usarlos más y familiarizarse con ellos)
					 */

					/**
					 * RECUERDA: - .trim(); -->> eliminar espacios al principio y final de línea -
					 * .replace(" ", "") -->> eliminar espacios de cualquier posición
					 */

					// cuanto tipo vale 2
					case 2: {
						contenido1 = new Podcast();
						if (contenido1 instanceof Podcast podcast) {
							sc.nextLine();
							System.out.print("ID: ");
							podcast.setId(sc.nextLine());
							System.out.print("Título: ");
							podcast.setTitulo(sc.nextLine());
							System.out.print("Año: ");
							podcast.setAnyo(sc.nextInt());
							System.out.print("Premium (s/n): ");
							String letra = sc.nextLine();
							if (letra.equalsIgnoreCase("s"))
								podcast.setPremium(true);
							else
								podcast.setPremium(false);
							sc.nextLine();
							System.out.print("Anfitrión: ");
							podcast.setAnfitrion(sc.nextLine());
							System.out.print("Episodios: ");
							podcast.setEpisodios(sc.nextInt());
							System.out.print("Duración del episodio (min): ");
							podcast.setDuracionMinPorEpisodio(sc.nextInt());
							salir = true;
						}

						break;
					}

					// cuanto tipo vale 3
					case 3: {
						contenido1 = new CursoOnline();
						if (contenido1 instanceof CursoOnline cursoOnline) {
							sc.nextLine();
							System.out.print("ID: ");
							cursoOnline.setId(sc.nextLine());
							System.out.print("Título: ");
							cursoOnline.setTitulo(sc.nextLine());
							System.out.print("Año: ");
							cursoOnline.setAnyo(sc.nextInt());
							System.out.print("Premium (s/n): ");
							String letra = sc.nextLine();
							if (letra.equalsIgnoreCase("s"))
								cursoOnline.setPremium(true);
							else
								cursoOnline.setPremium(false);
							sc.nextLine();
							System.out.print("Plataforma: ");
							cursoOnline.setPlataforma(sc.nextLine());
							System.out.print("Horas: ");
							cursoOnline.setHoras(sc.nextInt());
							System.out.print("Materiales (MB): ");
							cursoOnline.setMaterialesMB(sc.nextInt());
							salir = true;
						}

						break;
					}

					default: {
						System.out.println("Tipo no válido.");
						break;
					}
					}
				} while (!salir);

				System.out.println("Contenido guardado en hueco " + hueco);

				break;
			}
			// cuando hueco vale 2
			case 2: {
				do {
					System.out.print("Tipo (1=Pelicula, 2=Podcast, 3=Curso):\nElige tipo: ");
					int tipo = sc.nextInt();
					switch (tipo) {
					// cuanto tipo vale 1
					case 1: {
						contenido2 = new Pelicula();
						if (contenido2 instanceof Pelicula peli) {
							sc.nextLine();
							System.out.print("ID: ");
							peli.setId(sc.nextLine());
							System.out.print("Título: ");
							peli.setTitulo(sc.nextLine());
							System.out.print("Año: ");
							peli.setAnyo(sc.nextInt());
							sc.nextLine();
							System.out.print("Premium (s/n): ");
							String letra = sc.nextLine();
							if (letra.equalsIgnoreCase("s"))
								peli.setPremium(true);
							else
								peli.setPremium(false);
							System.out.print("Director: ");
							peli.setDirector(sc.nextLine());
							System.out.print("Duración (min): ");
							peli.setDuracionMin(sc.nextInt());
							sc.nextLine();
							System.out.print("Calidad (GB): ");
							String numeroConPunto = sc.nextLine();
							double numeroConComa = Double.parseDouble(numeroConPunto.replace(",", "."));
							peli.setCalidadGB(numeroConComa);
							salir = true;
						}

						break;
					}
					// cuanto tipo vale 2
					case 2: {
						contenido2 = new Podcast();
						if (contenido2 instanceof Podcast podcast) {
							sc.nextLine();
							System.out.print("ID: ");
							podcast.setId(sc.nextLine());
							System.out.print("Título: ");
							podcast.setTitulo(sc.nextLine());
							System.out.print("Año: ");
							podcast.setAnyo(sc.nextInt());
							System.out.print("Premium (s/n): ");
							String letra = sc.nextLine();
							if (letra.equalsIgnoreCase("s"))
								podcast.setPremium(true);
							else
								podcast.setPremium(false);
							sc.nextLine();
							System.out.print("Anfitrión: ");
							podcast.setAnfitrion(sc.nextLine());
							System.out.print("Episodios: ");
							podcast.setEpisodios(sc.nextInt());
							System.out.print("Duración del episodio (min): ");
							podcast.setDuracionMinPorEpisodio(sc.nextInt());
							salir = true;
						}

						break;
					}
					// cuanto tipo vale 3
					case 3: {
						contenido2 = new CursoOnline();
						if (contenido2 instanceof CursoOnline cursoOnline) {
							sc.nextLine();
							System.out.print("ID: ");
							cursoOnline.setId(sc.nextLine());
							System.out.print("Título: ");
							cursoOnline.setTitulo(sc.nextLine());
							System.out.print("Año: ");
							cursoOnline.setAnyo(sc.nextInt());
							System.out.print("Premium (s/n): ");
							String letra = sc.nextLine();
							if (letra.equalsIgnoreCase("s"))
								cursoOnline.setPremium(true);
							else
								cursoOnline.setPremium(false);
							sc.nextLine();
							System.out.print("Plataforma: ");
							cursoOnline.setPlataforma(sc.nextLine());
							System.out.print("Horas: ");
							cursoOnline.setHoras(sc.nextInt());
							System.out.print("Materiales (MB): ");
							cursoOnline.setMaterialesMB(sc.nextInt());
							salir = true;
						}

						break;
					}
					default: {
						System.out.println("Tipo no válido.");
						break;
					}
					}
				} while (!salir);

				System.out.println("Contenido guardado en hueco " + hueco);

				break;
			}
			// cuando hueco vale 3
			case 3: {
				do {
					System.out.print("Tipo (1=Pelicula, 2=Podcast, 3=Curso):\nElige tipo: ");
					int tipo = sc.nextInt();
					switch (tipo) {
					// cuanto tipo vale 1
					case 1: {
						contenido3 = new Pelicula();
						if (contenido3 instanceof Pelicula peli) {
							sc.nextLine();
							System.out.print("ID: ");
							peli.setId(sc.nextLine());
							System.out.print("Título: ");
							peli.setTitulo(sc.nextLine());
							System.out.print("Año: ");
							peli.setAnyo(sc.nextInt());
							sc.nextLine();
							System.out.print("Premium (s/n): ");
							String letra = sc.nextLine();
							if (letra.equalsIgnoreCase("s"))
								peli.setPremium(true);
							else
								peli.setPremium(false);
							System.out.print("Director: ");
							peli.setDirector(sc.nextLine());
							System.out.print("Duración (min): ");
							peli.setDuracionMin(sc.nextInt());
							sc.nextLine();
							System.out.print("Calidad (GB): ");
							String numeroConPunto = sc.nextLine();
							double numeroConComa = Double.parseDouble(numeroConPunto.replace(",", "."));
							peli.setCalidadGB(numeroConComa);
							salir = true;
						}

						break;
					}
					// cuanto tipo vale 2
					case 2: {
						contenido3 = new Podcast();
						if (contenido3 instanceof Podcast podcast) {
							sc.nextLine();
							System.out.print("ID: ");
							podcast.setId(sc.nextLine());
							System.out.print("Título: ");
							podcast.setTitulo(sc.nextLine());
							System.out.print("Año: ");
							podcast.setAnyo(sc.nextInt());
							System.out.print("Premium (s/n): ");
							String letra = sc.nextLine();
							if (letra.equalsIgnoreCase("s"))
								podcast.setPremium(true);
							else
								podcast.setPremium(false);
							sc.nextLine();
							System.out.print("Anfitrión: ");
							podcast.setAnfitrion(sc.nextLine());
							System.out.print("Episodios: ");
							podcast.setEpisodios(sc.nextInt());
							System.out.print("Duración del episodio (min): ");
							podcast.setDuracionMinPorEpisodio(sc.nextInt());
							salir = true;
						}

						break;
					}
					// cuanto tipo vale 3
					case 3: {
						contenido3 = new CursoOnline();
						if (contenido3 instanceof CursoOnline cursoOnline) {
							sc.nextLine();
							System.out.print("ID: ");
							cursoOnline.setId(sc.nextLine());
							System.out.print("Título: ");
							cursoOnline.setTitulo(sc.nextLine());
							System.out.print("Año: ");
							cursoOnline.setAnyo(sc.nextInt());
							System.out.print("Premium (s/n): ");
							String letra = sc.nextLine();
							if (letra.equalsIgnoreCase("s"))
								cursoOnline.setPremium(true);
							else
								cursoOnline.setPremium(false);
							sc.nextLine();
							System.out.print("Plataforma: ");
							cursoOnline.setPlataforma(sc.nextLine());
							System.out.print("Horas: ");
							cursoOnline.setHoras(sc.nextInt());
							System.out.print("Materiales (MB): ");
							cursoOnline.setMaterialesMB(sc.nextInt());
							salir = true;
						}

						break;
					}
					default: {
						System.out.println("Tipo no válido.");
						break;
					}
					}
				} while (!salir);

				System.out.println("Contenido guardado en hueco " + hueco);

				break;
			}

			}

			break;
		}

		case 2: {

			boolean salir = false;
			int hueco = 0;
			do {

				System.out.print("Hueco (1-3): ");
				hueco = sc.nextInt();
				switch (hueco) {
				case 1: {
					try {
						System.out.println(contenido1.mostrarFicha());
					} catch (java.lang.NullPointerException e) {
						System.out.println("Error: Hueco vacío.\nDebe Crear/Registrar previamente un contenido.");
					}
					salir = true;
					break;
				}

				case 2: {
					try {
						System.out.println(contenido2.mostrarFicha());
					} catch (java.lang.NullPointerException e) {
						System.out.println("Error: Hueco vacío.\nDebe Crear/Registrar previamente un contenido.");
					}
					salir = true;
					break;
				}
				case 3: {
					try {
						System.out.println(contenido3.mostrarFicha());
					} catch (java.lang.NullPointerException e) {
						System.out.println("Error: Hueco vacío.\nDebe Crear/Registrar previamente un contenido.");
					}
					salir = true;
					break;
				}
				default:
					System.out.println("Hueco no válido.");
					break;
				}
			} while (!salir);
			break;

		}

		case 3: {

			boolean salir = false;
			int hueco = 0;
			do {

				System.out.print("Hueco (1-3): ");
				hueco = sc.nextInt();
				switch (hueco) {
				case 1: {
					try {

						contenido1.mostrarDetalle();
					} catch (java.lang.NullPointerException e) {
						System.out.println("Error: Hueco vacío.\nDebe Crear/Registrar previamente un contenido.");
					}
					salir = true;
					break;
				}

				case 2: {
					try {

						contenido2.mostrarDetalle();
					} catch (java.lang.NullPointerException e) {
						System.out.println("Error: Hueco vacío.\nDebe Crear/Registrar previamente un contenido.");
					}
					salir = true;
					break;
				}
				case 3: {
					try {
						contenido3.mostrarDetalle();
					} catch (java.lang.NullPointerException e) {
						System.out.println("Error: Hueco vacío.\nDebe Crear/Registrar previamente un contenido.");
					}
					salir = true;
					break;
				}
				default:
					System.out.println("Hueco no válido.");
					break;
				}
			} while (!salir);
			break;
		}

		case 4: {
			boolean salir = false;
			int hueco = 0;
			do {
				System.out.print("Hueco (1-3): ");
				hueco = sc.nextInt();
				switch (hueco) {
				case 1: {
					if (contenido1 instanceof Pelicula) {
						((Pelicula) contenido1).reproducir();
					} else if (contenido1 instanceof Podcast) {
						((Podcast) contenido1).reproducir();
					} else {
						System.out.println("Contenido no reproducible.");
					}
					salir = true;
					break;
				}

				case 2: {
					if (contenido2 instanceof Pelicula) {
						((Pelicula) contenido2).reproducir();
					} else if (contenido2 instanceof Podcast) {
						((Podcast) contenido2).reproducir();
					} else {
						System.out.println("Contenido no reproducible.");
					}
					salir = true;
					break;
				}

				case 3: {
					if (contenido3 instanceof Pelicula) {
						((Pelicula) contenido3).reproducir();
					} else if (contenido3 instanceof Podcast) {
						((Podcast) contenido3).reproducir();
					} else {
						System.out.println("Contenido no reproducible.");
					}
					salir = true;
					break;
				}

				default: {
					System.out.println("Hueco no válido.");
					break;
				}
				}
			} while (!salir);

			break;
		}

		case 5: {
			boolean salir = false;
			int hueco = 0;
			do {
				System.out.print("Hueco (1-3): ");
				hueco = sc.nextInt();
				switch (hueco) {
				case 1: {
					if (contenido1 instanceof Pelicula) {
						((Pelicula) contenido1).descargar();
					} else if (contenido1 instanceof CursoOnline) {
						((CursoOnline) contenido1).descargar();
					} else {
						System.out.println("Contenido no descargable.");
					}
					salir = true;
					break;
				}

				case 2: {
					if (contenido2 instanceof Pelicula) {
						((Pelicula) contenido2).descargar();
					} else if (contenido2 instanceof CursoOnline) {
						((CursoOnline) contenido2).descargar();
					} else {
						System.out.println("Contenido no descargable.");
					}
					salir = true;
					break;
				}

				case 3: {
					if (contenido3 instanceof Pelicula) {
						((Pelicula) contenido3).descargar();
					} else if (contenido1 instanceof CursoOnline) {
						((CursoOnline) contenido3).descargar();
					} else {
						System.out.println("Contenido no descargable.");
					}
					salir = true;
					break;
				}

				default: {
					System.out.println("Hueco no válido.");
					break;
				}
				}
			} while (!salir);

			break;
		}

		case 6: {
			boolean salir = false;
			int hueco = 0;
			do {
				System.out.print("Hueco (1-3): ");
				hueco = sc.nextInt();
				switch (hueco) {
				case 1:
					salir = true;
					break;
				case 2:
					salir = true;
					break;
				case 3:
					salir = true;
					break;
				default:
					System.out.println("Hueco no válido.");
					break;
				}

			} while (!salir);
			if (hueco == 1 && contenido1 != null)
				System.out.print("Coste mensual: " + contenido1.costeMensual() + " €\n");
			else if (hueco == 2 && contenido2 != null)
				System.out.print("Coste mensual: " + contenido2.costeMensual() + " €\n");
			else if (hueco == 3 && contenido3 != null)
				System.out.print("Coste mensual: " + contenido3.costeMensual() + " €\n");
			else
				System.out.println("Hueco sin contenido.");
			break;
		}

		case 7: {
			boolean salir = false;
			int hueco = 0;
			do {
				System.out.print("Hueco (1-3): ");
				hueco = sc.nextInt();
				switch (hueco) {
				case 1:
					salir = true;
					break;
				case 2:
					salir = true;
					break;
				case 3:
					salir = true;
					break;
				default:
					System.out.println("Hueco no válido.");
					break;
				}
			} while (!salir);

			if (hueco == 1) {
				contenido1 = null;
				System.out.println("Hueco 1 vaciado.");
			} else if (hueco == 2) {
				contenido2 = null;
				System.out.println("Hueco 2 vaciado.");
			}

			else {
				contenido3 = null;
				System.out.println("Hueco 3 vaciado.");
			}

			break;
		}

		case 0: {
			opcion = 0;
			break;
		}

		default: {
			System.out.println("Opción no válida.");
			break;
		}

		} // linea 44 - LLAVE de cierre de "switch (opcion) {"

	}

} // LLAVE de cierre de "public class Main {"

/**
 * REPASO:
 * 
 * System.out.println("Introduce 3 colores: "); String entrada = sc.nextLine();
 * entrada = entrada.trim(); int primerEspacio = 0; primerEspacio =
 * entrada.indexOf(" "); String color1 = entrada.substring(0, primerEspacio);
 * 
 * String entrada2 = entrada.substring(primerEspacio+1); primerEspacio =
 * entrada2.indexOf(" "); String color2 = entrada2.substring(0, primerEspacio);
 * 
 * String entrada3 = entrada2.substring(primerEspacio+1); primerEspacio =
 * entrada3.indexOf(" "); String color3 = entrada3.substring(0, primerEspacio);
 * 
 * System.out.println(color1+""+color2+" "+color3); System.out.println(color1);
 * System.out.println(color2); System.out.println(color3);
 */

/**
 * // REPASO:
 * 
 * TOKEN: es la unidad mas pequeña de un programa que tiene significado para el
 * compilador. son como los "ladrillos" fundamentales con los que se construye
 * el código. el compilador lee el archivo de texto y lo divide en estos
 * elementos ("ladrillos") para entender qué debe hacer. hay 5 categorias
 * principales: 1. palabras reservadas (public, class, if, return) . 2.
 * identificadores (miClase, suma, x) . 3. literales (10, 3.14,"Hola") . 4.
 * operadores (+, -, *, ==, &&) . 5. separadores/puntuadores (;, {, }, (, ),) .
 * 
 * - Ejemplo de procesamiento por tokens System.out.println("introduce 3
 * palabras:"); int j=1; while(j<=3) { System.out.print("\npalabra "+j+": "); //
 * System.out.print(sc.nextLine()); j++; } sc.nextLine(); // Limpieza necesaria
 * porque sc.next() dejó el último Enter en el buffer
 * 
 * Ejemplo de procesamiento por tokens System.out.println("introduce 3
 * palabras:"); int i = 1; while (i <= 3) { System.out.print("\npalabra " + i +
 * ": "); System.out.print(sc.next()); i++; } sc.nextLine();
 * 
 * System.out.println("\nIntroduce 3 palabras (puedes separarlas por
 * espacios):");
 * 
 * int k = 1; while(k <= 3) { // next() no espera al Enter si ya hay algo en el
 * buffer String palabra = sc.next(); System.out.println("Palabra " + k + "
 * capturada: " + palabra); k++; }
 * 
 */
