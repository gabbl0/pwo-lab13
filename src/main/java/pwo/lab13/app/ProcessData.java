package pwo.lab13.app;

public class ProcessData {
    public enum Action {
        UNDEFINE, SUM, MAX
    }

    public Double process(Action action, double[] numbers) {
        switch (action) {
            case SUM:
                return sum(numbers);
            case MAX:
                return max(numbers);
            default:
                return null;
        }
    }

    /*
     * Sumuje liczby przekazane jako tablica i zwraca wynik.
     * Jeżeli tablica jest pusta, to zwraca null.
     */
    private Double sum(double[] numbers) {
        throw new IllegalStateException("Not implemented yet");
    }

    /*
     * Przeszukuje przekazaną tablicę liczb i zwraca
     * maksymalną. Jeżeli tablica jest pusta, to zwraca null.
     */
    private Double max(double[] numbers) {
        throw new IllegalStateException("Not implemented yet");
    }
}
