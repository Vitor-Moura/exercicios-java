package application;

import model.entities.Reserva;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leit = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int numero = leit.nextInt();
            System.out.print("Data do check-in (dd/MM/yyyy): ");
            Date checkIn = formato.parse(leit.next());
            System.out.print("Data do check-out (dd/MM/yyyy): ");
            Date checkOut = formato.parse(leit.next());

            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = formato.parse(leit.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = formato.parse(leit.next());

            reserva.alterarDatas(checkIn, checkOut);
            System.out.println("Reservation: " + reserva);
        }
        catch (ParseException e) {
            System.out.println("Formato de data inválido");
        }
        catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }

        leit.close();
    }
}
