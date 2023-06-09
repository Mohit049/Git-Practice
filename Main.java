import java.util.*;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        map.put("anil", 56);
        map.put("dhoni", 78);
        map.put("kohli", 28);
        map.put("ajay", 45);

        String name = sc.nextLine();
        System.out.println("Size of map is: " + map.size());
        System.out.println("Content of map is: " + map);

        System.out.print("Enter a player name: ");
    

        if (map.containsKey(name)) {
            System.out.println("True");
            System.out.println("Score of " + name + " is " + map.get(name));
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}
