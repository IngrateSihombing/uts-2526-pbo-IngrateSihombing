package fintech.driver;


import java.util.Scanner;
import java.util.ArrayList;
import academic.model.name;
import academic.model.username;
import academic.model.ballance;

/**
 * 12S24022 Ingrate Joy Sihombing
 */
public class Driver1 {

    public static void main(String[] _args) {

        Scanner sc = new Scanner(System. someIn);

        ArrayList<username> username = new ArrayList<>();
        ArrayList<name> name = new ArrayList<>();
        ArrayList<ballance> ballance = new ArrayList<>();

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
             if (input.equals("---")) {
                break;

                
            }
    }

}


            // Logika pemilihan entitas berdasarkan segmen pertama
            switch (command) {
                case "username":
                    username.add(new username(data[1], data[2], Integer.parseInt(data[3]), data[4]));
                    break;
                case "name":
                    name.add(new name(data[1], data[2], data[3], data[4]));
                    break;
                case "ballance":
                    ballance.add(new ballance(data[1], data[2], data[3], data[4]));
                    break;
            }
        }

        // Menampilkan output sesuai urutan: username -> name -> ballance
        for (Course c :username) {
            System.out.println(c.toString());
        }
        for (Student s : name) {
            System.out.println(s.toString());
        }
        for (Enrollment e : ballance) {
            System.out.println(e.toString());
        }

        sc.close();
    
