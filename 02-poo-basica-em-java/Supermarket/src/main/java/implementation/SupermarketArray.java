package implementation;

public class SupermarketArray implements Supermarket {

    private int lastIndex;
    private final String[] itens;

    public SupermarketArray(final int size) {
        itens = new String[size];
        lastIndex = -1;
    }

    public void add(final String item) {
        if (lastIndex == itens.length) {
            System.err.println("lista de supermercado cheia.");
        } else {
            lastIndex++;
            itens[lastIndex] = item;
        }
    }

    public void print() {
        System.out.println("###################################");
        if (lastIndex < 0) {
            System.out.println("lista vazia.");
        }

        for (int i = 0; i <= lastIndex; i++) {
            System.out.println(i + " - " + itens[i]);
        }
        System.out.println("###################################");
    }

    public void delete(final int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;
        } else {
            System.err.println("índice invalido.");
        }
    }

    private void shift(int index) {
        for (int i = index; i < lastIndex; i++) {
            itens[i] = itens[i + 1];
        }
    }

}
