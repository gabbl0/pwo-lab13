package pwo.lab13.app;

import java.util.List;
import java.util.ArrayList;
import pwo.lab13.app.ProcessData.Action;

public class ProcessArgs {

    /*
     * Wyszukuje w tablicy stringów pozycję, która może być
     * zinterpretowana jako wartość typu ProcessData.Action.
     * Wielkość czcionki nie ma znaczenia. Obowiązuje
     * pierwsze dopasowanie. Jeżeli nie znajdzie to zwraca
     * wartość UNDEFINE.
     */
    public static Action getAction(String[] args) {
        for (String arg : args) {
            try {
                return ProcessData.Action.valueOf(arg.toUpperCase());
            } catch (IllegalArgumentException ex) {
            }
        }
        return ProcessData.Action.UNDEFINE;
    }

    /*
     * Wyszukuje w tablicy stringów pozycje, które mogą być
     * zinterpretowane jako liczby. Tworzy z tych liczb
     * tablicę. Jeżeli nie ma liczb to zwraca pustą tablicę.
     */
    public static double[] getNumbers(String[] args) {
        List<Double> numbers = new ArrayList<>();
        for (String arg : args) {
            try {
                numbers.add(Double.parseDouble(arg));
            } catch (NumberFormatException ex) {
            }
        }
        return numbers.stream().mapToDouble(d -> d).toArray();
    }
}