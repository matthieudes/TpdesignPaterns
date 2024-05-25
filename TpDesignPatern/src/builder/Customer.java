package builder;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        QueryBuilder builder = null;

        System.out.println(" Souhaitez vous génèrer une requête MySQL (1) ou Oracle(2) ?");
        String choice = reader.next();

        while (builder == null){
            if (choice.equals("1")){
                builder = new MySQLQueryBuilder();
            } else if (choice.equals("2")) {
                builder = new OracleQueryBuilder();
            } else {
                System.out.println("Veuillez recommencer votre choix");
                choice = reader.next();
            }
        }

        ProgramManager programManager = new ProgramManager(builder);
        Program program = programManager.build("Safinette", 5,3,4);
        program.print();

        reader.close();
    }
}
