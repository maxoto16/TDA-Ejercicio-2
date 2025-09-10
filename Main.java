import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        //Nuevo estack
        Deque<String> historial = new ArrayDeque<>();

        //agrega 3
        historial.push("w3schools.com");
        historial.push("netflix.com");
        historial.push("hostinger.com");

        System.out.println("Historial después de visitar 3 páginas:");
        System.out.println(historial);
        System.out.println("------------------");

        //RETROCEDE POP
        String paginaAnterior = historial.pop();
        System.out.println("Retrocediste una página. Página eliminada: " + paginaAnterior);

        //Consulta peek
        String paginaActual = historial.peek();
        System.out.println("Ahora estás en la página: " + paginaActual);
        System.out.println("------------------");

        //Agregar una nueva página
        historial.push("twitter.com");
        System.out.println("Visitaste una nueva página: twitter.com");

        //Muestra todo
        System.out.println("------------------");
        System.out.println("Historial completo actual:");
        System.out.println(historial);
    }
}