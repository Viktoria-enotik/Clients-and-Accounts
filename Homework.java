import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        Client[] clients = new Client[]{
                new Client(1, 20, "Василий"),
                new Client(2, 22, "Мария"),
                new Client(3, 65, "Михаил"),
        };

        List<Integer> a1 = Arrays.asList(1,2,3);
        //ArrayList<Integer> a1 = new ArrayList<>();
        //a1.add(1);
        //a1.add(2);
        //a1.add(3);
        List<Integer> a2 = Arrays.asList(4,5);
        //ArrayList<Integer> a2 = new ArrayList<>();
        //a2.add(4);
        //a2.add(5);
        List<Integer> a3 = Arrays.asList(6,7);
        //ArrayList<Integer> a3 = new ArrayList<>();
        //a3.add(6);
        //a3.add(7);

        // HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(1, { 1, 2, 3, 4, 5});
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, a1);
        map.put(2, a2);
        map.put(3, a3);

        HashMap<Integer, Client> accounts = new HashMap<>();
        Accounts[] accArray = {
                new Accounts(1, 1),
                new Accounts(2, 1),
                new Accounts(3, 1),

                new Accounts(4, 2),
                new Accounts(5, 2),

                new Accounts(6, 3),
                new Accounts(7, 3)
        };
        accounts.put(1, clients[0]);
        accounts.put(2, clients[0]);
        accounts.put(3, clients[0]);

        accounts.put(4, clients[1]);
        accounts.put(5, clients[1]);

        accounts.put(6, clients[2]);
        accounts.put(7, clients[2]);

        // 1: get accounts by client id
        System.out.println(map.get(1));

        // 2: get client by acc
        System.out.println(accounts.get(5).Name);

    }
}

