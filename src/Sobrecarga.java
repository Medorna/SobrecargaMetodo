public class Sobrecarga {
    
    int a;
    


    public void perro(){
        
        System.out.println("Soy un perro común");

    }

    public void perro(String a){
        
        a = "Bark bark bark";
        
        System.out.println("Soy un perro sobrecargado "+a);

    }

    public static void main(String[] args) {

        Sobrecarga objeto1 = new Sobrecarga();
    
        objeto1.perro();
        objeto1.perro("");

    }
}
