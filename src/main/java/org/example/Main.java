package org.example;

// Abstract Factory interface
interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}

// Concrete Factory for Professional variant
class ProfessionalFactory implements GarmentFactory {
    public Top createTop() { return new ProfessionalTop(); }
    public Pants createPants() { return new ProfessionalPants(); }
    public Shoes createShoes() { return new ProfessionalShoes(); }
}

// Concrete Factory for Casual variant
class CasualFactory implements GarmentFactory {
    public Top createTop() { return new CasualTop(); }
    public Pants createPants() { return new CasualPants(); }
    public Shoes createShoes() { return new CasualShoes(); }
}

// Product interface for Top
interface Top {
    void wear();
}

// Product interface for Pants
interface Pants {
    void wear();
}

// Product interface for Shoes
interface Shoes {
    void wear();
}

// Concrete Product for Professional variant of Top
class ProfessionalTop implements Top {
    public void wear() {
        System.out.println("Wearing a professional top.");
    }
}

// Concrete Product for Professional variant of Pants
class ProfessionalPants implements Pants {
    public void wear() {
        System.out.println("Wearing professional pants.");
    }
}

// Concrete Product for Professional variant of Shoes
class ProfessionalShoes implements Shoes {
    public void wear() {
        System.out.println("Wearing professional shoes.");
    }
}

// Concrete Product for Casual variant of Top
class CasualTop implements Top {
    public void wear() {
        System.out.println("Wearing a casual top.");
    }
}

// Concrete Product for Casual variant of Pants
class CasualPants implements Pants {
    public void wear() {
        System.out.println("Wearing casual pants.");
    }
}

// Concrete Product for Casual variant of Shoes
class CasualShoes implements Shoes {
    public void wear() {
        System.out.println("Wearing casual shoes.");
    }
}

// Client code that uses the abstract factory
class GarmentSimulator {
    private Top top;
    private Pants pants;
    private Shoes shoes;

    public GarmentSimulator(GarmentFactory factory) {
        top = factory.createTop();
        pants = factory.createPants();
        shoes = factory.createShoes();
    }

    public void dressUp() {
        top.wear();
        pants.wear();
        shoes.wear();
    }
}

// Driver class to test the implementation
public class Main {
    public static void main(String[] args) {
        GarmentFactory professionalFactory = new ProfessionalFactory();
        GarmentSimulator professionalSimulator = new GarmentSimulator(professionalFactory);
        professionalSimulator.dressUp();

        GarmentFactory casualFactory = new CasualFactory();
        GarmentSimulator casualSimulator = new GarmentSimulator(casualFactory);
        casualSimulator.dressUp();
    }
}
