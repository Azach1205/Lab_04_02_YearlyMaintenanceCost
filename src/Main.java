public class Main {
    public static void main(String[] args) {
        int springCost = 2500; //input replacement
        int summerCost = 3500; //input replacement
        int fallCost = 2500; //input replacement
        int winterCost = 4000; //input replacement
        int yearlyCost = 0;
        yearlyCost = springCost + summerCost + fallCost + winterCost; //Adding all the costs together
        System.out.println("The total cost is " + yearlyCost + " with spring costing " + springCost + ", summer costing " + summerCost + ", fall costing " + fallCost + ", and winter costing " + winterCost + ".");
    }
}