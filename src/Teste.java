import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        String nextState;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Inserir texto para salvar no Estado, ou v para voltar um estado");
                nextState = scanner.nextLine();
                if (nextState.equals("v")) {
                    Memento m;
                    m = careTaker.pop();
                    if (m != null) {
                        originator.getState(m);
                    }
                } else {
                    careTaker.push(originator.saveState());
                    originator.setState(nextState);
                }
                System.out.printf("Estado Atual: %s\n", originator.getState());
            } while (true);
        }
    }
}
