package example.codeclan.com.toptenmoviesofalltime;

import android.graphics.*;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {
    @Test
    public void testMovieSetUp(){
        Movie movie1 = new Movie( "Lord of the Rings", "Adventure", 1);
        Movie movie2 = new Movie( "Jaws", "Horror", 2);
        Movie movie3 = new Movie( "Carrie", "Horror", 3);
        Movie movie4 = new Movie( "Sound of Music", "Musical", 4);
        Movie movie5 = new Movie( "Spectre", "Action", 5);
        Movie movie6 = new Movie( "SkyFall", "Action", 6);
        assertEquals("Lord of the Rings", movie1.getTitle());
        assertEquals("Adventure", movie1.getGenre());
        assertEquals(1, movie1.getRanking());
    }

    @Test
    public void testGenre(){
        Movie movie2 = new Movie( "Jaws", "Horror", 2);
        assertEquals("Horror", movie2.getGenre());
    }

    @Test
    public void testRanking(){
        Movie movie4 = new Movie( "Sound of Music", "Musical", 4);
        assertEquals(4, movie4.getRanking());
    }

    @Test
    public void testCanAddMovie(){
        Movie movie = new Movie ();
        movie.addMovie("Moonraker");
        assertEquals(6, movie.getLength())

    }


    }
}
