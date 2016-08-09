/**
 * Created by Lyigezaw on 8/7/2016.
 */


import java.util.Scanner;

public class Project1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the initial sequence of values: ");

        String userInput = new String();
        userInput = scanner.nextLine();
        String[] parsedList = userInput.split(" ");


        System.out.println("done");
        BinaryTree Bt = new BinaryTree(Integer.parseInt(parsedList[0]));
        for (int i = 1; i < parsedList.length; i++) {
            Bt.insert(Integer.parseInt(parsedList[i]));
        }
        System.out.print("Pre-order: ");
        Bt.root.preorder();
        System.out.println();
        System.out.print("In-order: ");
        Bt.root.inorder();
        System.out.println();
        System.out.print("Post-order: ");
        Bt.root.postorder();
        System.out.println();

        boolean running = true;
        while(running){
            System.out.println("Command?");
            String input = new String();
            input = scanner.nextLine();
            String[] choice = input.split(" ");
            if(choice[0].equals("H")){
                System.out.println("I Insert a value");
                System.out.println("D Delete a value");
                System.out.println("P Find Predecessor");
                System.out.println("S Find successor");
                System.out.println("E Exit the program");
                System.out.println("H Display this message");
            }
            else{
                switch(choice[0]){
                    case "I":
                        Bt.insert(Integer.parseInt(choice[1]));
                        System.out.print("In-order: ");
                        Bt.root.inorder();
                        System.out.println();
                        break;
                    case "D":
                        Bt.delete(Integer.parseInt(choice[1]));
                        System.out.print("In-order: ");
                        Bt.root.inorder();
                        System.out.println();
                        break;
                    case "P":
                        if(Bt.findPre(Integer.parseInt(choice[1])) == null){
                        System.out.println("This value has no predecessor");
                        }
                        else {
                            System.out.println(Bt.findPre(Integer.parseInt(choice[1])).getRoot());
                        }
                        break;
                    case "S":
                        if(Bt.findSucc(Integer.parseInt(choice[1])) == null){
                        System.out.println("This value has no successor");
                        }
                        else {
                            System.out.println(Bt.findSucc(Integer.parseInt(choice[1])).getRoot());
                        }
                        break;
                    case "E":
                        System.out.println("Thank you for using my program");
                        running = false;
                        break;
                }
            }

        }
    }
}

