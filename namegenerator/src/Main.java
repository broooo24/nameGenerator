import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] germanFamilyName = {"Müller", "Baumgartner","Horst","Schumacher"};
        String[] germanName = {"Peter", "Christian","Stefan","Paul"};
        String[] frenchFamilyName = {"Garnier", "Blanchet","Lavigne","Monet"};
        String[] frenchName = {"Marie", "Pierre","Michel","Jean"};
        String[] englishName = {"Lewis", "David","Jack","George","Harry"};
        String[] englishFamilyName = {"Brown", "Davies","Williams","Taylor"};
        System.out.println("1 - german\n2 - french\n3 - english");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println(choice);
        Random random = new Random();
        int number = random.nextInt(4- 1 + 1) + 1;
        String resultName="";

        switch (choice){
            case 1:
                resultName = germanName[number] + " " + germanFamilyName[number];
                break;
            case 2:
                resultName = frenchName[number] + " " + frenchFamilyName[number];
                break;
            case 3:
                resultName = englishName[number] + " " + englishFamilyName[number];
                break;
        }
        System.out.println(resultName);
    }
}
