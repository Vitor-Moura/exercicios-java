package application;

import entities.Comentario;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Have a nice trip!");
        Comentario c2 = new Comentario("Wow that's awesome!");
        Post p1 = new Post(
                formatoData.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comentario c3 = new Comentario("Good night");
        Comentario c4 = new Comentario("May the force be with you");
        Post p2 = new Post(
                formatoData.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);

    }
}
