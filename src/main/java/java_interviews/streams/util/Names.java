package java_interviews.streams.util;

import java.util.Random;

public class Names {

    private static final String[][] NAMES = new String[][]{{"Hannah", "Cox"},
            {"Katie", "Anderson"},
            {"Joseph", "Gentry"},
            {"Alex", "Wang"},
            {"James", "Wilson"},
            {"Julia", "Erickson"},
            {"Samantha", "Brooks"},
            {"Tabitha", "Caldwell"},
            {"Julia", "Little"},
            {"Wayne", "Matthews"},
            {"Rebecca", "Anderson"},
            {"Brian", "Castro"},
            {"Veronica", "Harris"},
            {"Jay", "Jones"},
            {"Jasmine", "Dennis"},
            {"Matthew", "Nguyen"},
            {"Mario", "Thompson"},
            {"Gabrielle", "Ballard"},
            {"Anna", "Stevens"},
            {"Ebony", "Carter"},
            {"Katrina", "Daniel"},
            {"Veronica", "Brown"},
            {"Kim", "Davis"},
            {"Manuel", "Ramirez"},
            {"Paul", "Santana"},
            {"Andrew", "Rice"},
            {"Heather", "Gaines"},
            {"Michael", "Watson"},
            {"Dawn", "Jones", "MD"},
            {"Lacey", "Perry"},
            {"Kyle", "Ruiz"},
            {"Tony", "Arias"},
            {"Joseph", "Long"},
            {"Rebecca", "Salazar"},
            {"Brandy", "King"},
            {"Cheryl", "Baldwin"},
            {"David", "Dixon"},
            {"Richard", "Bell"},
            {"William", "Miles"},
            {"Ryan", "Fox"},
            {"Jennifer", "Mcdaniel"},
            {"Miguel", "Holmes"},
            {"Jennifer", "Johns"},
            {"David", "Hinton"},
            {"Albert", "White"},
            {"Hannah", "Clark"},
            {"Johnny", "Glover"},
            {"Dennis", "Woods"},
            {"Desiree", "Jones"},
            {"Mark", "Hernandez"},
            {"Elizabeth", "Carroll"},
            {"John", "Kelley"},
            {"Sara", "Cuevas"},
            {"Emily", "Hatfield"},
            {"Cody", "Watts"},
            {"Thomas", "Brown"},
            {"Diana", "Gonzalez"},
            {"Robert", "Rosales"},
            {"James", "Young"},
            {"Meagan", "Allen"},
            {"Natalie", "Jenkins"},
            {"Lindsay", "Mcknight"},
            {"Bonnie", "Shepherd"},
            {"Elizabeth", "Salinas"},
            {"Cynthia", "Douglas"},
            {"Dennis", "Diaz"},
            {"Megan", "Newman"},
            {"Alexander", "Allen"},
            {"Jeffrey", "Vega"},
            {"Crystal", "Foster"},
            {"Jason", "Garcia"},
            {"Megan", "Carr"},
            {"Kelly", "James"},
            {"Stephanie", "Sutton"},
            {"Angela", "Hayes"},
            {"Angela", "Lewis"},
            {"Sheri", "Hill"},
            {"Mark", "Church"},
            {"David", "Hall"},
            {"Ryan", "Craig"},
            {"Joel", "Vasquez"},
            {"Melissa", "Greene"},
            {"Leslie", "Vargas"},
            {"Eric", "Evans"},
            {"Matthew", "Terrell"},
            {"Catherine", "Cook"},
            {"Robert", "West"},
            {"Daniel", "Perez"},
            {"Jimmy", "Short"},
            {"Emily", "Hamilton"},
            {"Jodi", "Soto"},
            {"Matthew", "Stuart"},
            {"James", "Bolton"},
            {"Katie", "Palmer"},
            {"Patrick", "Hanson"}};

    public static String randomName() {
        int index = new Random().nextInt(Names.NAMES.length);
        return NAMES[index][0] + " " + NAMES[index][1];
    }

    public static String randomFirstName() {
        int index = new Random().nextInt(Names.NAMES.length);
        return NAMES[index][0];
    }

    public static String randomLastName() {
        int index = new Random().nextInt(Names.NAMES.length);
        return NAMES[index][1];
    }
}
