package controllers;

import models.Movie;

public class MovieController {

    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden ascendente.
     * 
     * @param movies Arreglo de películas a ordenar
     */
    public void sortByTitle(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            Movie aux = movies[i];
            int j= i-1;
            while (j>=0 && movies[j].getTitle().compareTo(aux.getTitle())>0) {
                movies[j+1]=movies[j];
                j--;
                
            }
            movies[j+1]=aux;
        }

    }
    public static void orden (Movie[] movies) {
        for(Movie movites: movies){
            System.out.println(movites);
        }


        }
        
    }


