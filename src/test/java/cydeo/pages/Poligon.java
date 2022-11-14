package cydeo.pages;

public class Poligon {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public void sayHello(){
        System.out.println("Hello World!");
    }

    public void sayHello(String name){
        System.out.println("Hello " + name);
    }

    public void sayHello(String name, String language){
        if(language.equalsIgnoreCase("English")){
            System.out.println("Hello " + name);
        }else if(language.equalsIgnoreCase("Spanish")){
            System.out.println("Hola " + name);
        }else if(language.equalsIgnoreCase("French")){
            System.out.println("Bonjour " + name);
        }else{
            System.out.println("Unknown language");
        }
    }

    public void sayHello(String name, String language, String country){
        if(language.equalsIgnoreCase("English")){
            if(country.equalsIgnoreCase("USA")){
                System.out.println("Hello " + name);
            }else if(country.equalsIgnoreCase("UK")){
                System.out.println("Hello " + name);
            }else{
                System.out.println("Unknown country");
            }
        }else if(language.equalsIgnoreCase("Spanish")){
            if(country.equalsIgnoreCase("Spain")){
                System.out.println("Hola " + name);
            }else if(country.equalsIgnoreCase("Mexico")){
                System.out.println("Hola " + name);
            }else{
                System.out.println("Unknown country");
            }
        }else if(language.equalsIgnoreCase("French")){
            if(country.equalsIgnoreCase("France")){
                System.out.println("Bonjour " + name);
            }else if(country.equalsIgnoreCase("Canada")){
                System.out.println("Bonjour " + name);
            }else{
                System.out.println("Unknown country");
            }
        }else{
            System.out.println("Unknown language");
        }
    }
}
