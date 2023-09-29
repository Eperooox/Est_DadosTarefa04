import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Iterator;

public class Main
{
    public static void main (String []args )
    {
        Deque<Pessoa> deque = new ArrayDeque<>();
        Scanner scanner= new Scanner(System.in);

        for(int i=1; i<=3; i++) {
            System.out.println("Informe os dados da pessoa");
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.println("Email");
            String email = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, telefone, email);
            deque.addLast(pessoa);
        }
        System.out.println("A lista inversa é: ");
        Iterator<Pessoa> reverseIterator = deque.descendingIterator();

        while(reverseIterator.hasNext())
        {
            Pessoa pessoa = reverseIterator.next();
            System.out.println("Nome: |" + pessoa.getNome() + " Telefone: |"+ pessoa.getTelefone() + " Email: "+ pessoa.getEmail() );
        }
    }
}
