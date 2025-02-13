package barbershopservice;

public class ThirdClass extends SecondClass {

    public void FirstChoice(boolean cutZ, boolean shaveZ, boolean haircolorZ) {
        int tempTotal = 0;

        if (cutZ) {
            tempTotal += cut;
        }

        if (shaveZ) {
            tempTotal += shave;
        }

        if (haircolorZ) {
            tempTotal += hairColor;
        }
        
        total = tempTotal;
        
        System.out.println("Total Services: " + total + "\n");
    }
}
