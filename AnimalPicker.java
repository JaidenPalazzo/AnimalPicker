import java.util.Scanner; 

public class AnimalPicker{

    private String animal; 
    Scanner scanner = new Scanner(System.in); 
    
    public AnimalPicker(){
        System.out.println("Which animal would yu like to see? (cat/dog)"); 
        animal = scanner.nextLine(); 

        if (animal.equals("cat")){
            System.out.println("CAT ASCII ART HERE"); 
        }

        else{
            System.out.println("DOG ASCII ART HERE");
        }

    }

    public static void main(String [] args){
        new AnimalPicker(); 
    }

}