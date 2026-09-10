public class Main {


    void main(){


        /*
        //Opgave 1: shopping discount
        double discount = 0.80;
        double totalPrice = 1499.95;
        double newPrice = 0.0;

        if(totalPrice > 1000){
            newPrice = totalPrice * discount;
            System.out.println("20% Discount unlocked. New price: " + newPrice);
        }
        else{
            System.out.println("No discount. Total price is: " + totalPrice);
        }

         */


        /*
        //Opgave 2: BMI Calculator
        double weight = 94.0;
        double height = 1.87;
        double bmi = 0.0;
        bmi = weight / (height * height);

        if(bmi >= 25){
            System.out.println("Overweight. BMI is: " + bmi);
        }
        else{
            System.out.println("Not overweight. BMI is: " + bmi);
        }

         */



        /*
        //Opgave 3: Time of day greeting

        int time = 14;

        if(time >= 5 && time <= 11){
            System.out.println("Good morning!");
        }
        else if(time >= 12 && time <= 17){
            System.out.println("Good afternoon!");
        }
        else if(time >= 18 && time <= 21){
            System.out.println("Good evening!");
        }
        else if(time >= 22 && time <= 4){
            System.out.println("Good night!");
        }
        else{
            System.out.println("Invalid time");
        }

         */


        /*
        //Opgave 4: Complete student report
        int score = 88;
        String grade;
        String status;
        String comment;

        if(score >= 90){
            grade = "A";
            status = "PASS";
            comment = "Excellent";
        }
        else if(score >= 80){
            grade = "B";
            status = "PASS";
            comment = "Good";
        }
        else if(score >= 70){
            grade = "C";
            status = "PASS";
            comment = "Satisfactory";
        }
        else if(score >= 60){
            grade = "D";
            status = "PASS";
            comment = "Needs improvement";
        }
        else{
            grade = "F";
            status = "FAIL";
            comment = "Failing";
        }

        System.out.println("=== STUDENT REPORT ===");
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
        System.out.println("Comment: " + comment);

         */



        /*
        //Opgave 5: Shipping eligibility

        int totalPrice = 350;
        boolean isMember = true;
        int shippingCost;

        if(totalPrice > 500 || (isMember && totalPrice > 200)){
            shippingCost = 0;
            System.out.println("Free shipping unlocked. Total price: " + totalPrice);
        }
        else{
            shippingCost = 50;
            System.out.println("No free shipping unlocked. Total price: " + (totalPrice + shippingCost));
        }

         */



        /*
        //Opgave 6: movie rating system

        int ageLimit = 15;
        int guestAge = 14;
        boolean hasParentalConsent = true;

        if(guestAge > ageLimit || (hasParentalConsent)){
            System.out.println("Can watch the movie");
        }
        else{
            System.out.println("Cannot watch movie");
        }

         */


        /*
        //Opgave 7: Restaurant seating

        int partySize = 4;
        int availableSeats = 6;
        boolean hasReservation = false;
        int waitTime = 20;
        boolean restaurantFull = false;

        if(partySize <= availableSeats && (hasReservation || waitTime <= 20)&& ! restaurantFull){
            System.out.println("Available table in: " + waitTime + " minutes.");
        }
        else{
            System.out.println("Nothing available at this time");
        }

         */



        /*
        //Opgave 8: Insurance premium calculator
        int age = 22;
        boolean hasAccidents = false;
        int accidents = 0;
        boolean riskZone = false;
        int riskFee = 2000;
        int prize = 5000;


        if((age < 25 || age > 70) || (accidents > 2) || (riskZone)){
            prize += riskFee;
            System.out.println("High risk. Annual price: " + prize);
        }
        else{
            System.out.println("Annual price: " + prize);
        }

         */



        /*
        //Opgave 9: Complete access control system
        boolean isAdmin = true;
        boolean accountActive = true;
        boolean isSuperUser = false;
        boolean isSuspended = false;
        boolean isGuest = false;
        boolean hasGuestTime = false;
        boolean hasLimitedAccess = false;
        String level;

        if(isAdmin || isSuperUser){
            level = "Full access";
        }
        else if(accountActive && !isSuspended || (isGuest && hasGuestTime)){
            level = "Limited access";
            hasLimitedAccess = true;
        }
        else{
            level = "Access denied";
        }

        System.out.println("Control panel:");
        System.out.println("Admin status: " + isAdmin);
        System.out.println("Limited access: " + hasLimitedAccess);
        System.out.println("Access level: " + level);

         */


        /*
        //Opgave 10: Restaurant menu pricing
        String dish = "Pizza";
        double price = 0.0;
        int quantity = 2;

        switch(dish){
            case "Burger":
                price = 89.0;
                break;
            case "Pizza":
                price = 95.0;
                break;
            case "Salad":
                price = 65.0;
                break;
            case "Pasta":
                price = 79.0;
                break;
            case "Steak":
                price = 145.0;
                break;
            default:
                System.out.println("Not found");
                price = 0.0;
        }
        System.out.println(dish + " price: " + price + "kr.");
        System.out.println("Qty: " + quantity);
        System.out.println("Total price: " + (price * quantity));

         */



        /*
        //Opgave 11: Shipping cost calculator
        String zone = "National";
        int weight = 7;
        int shippingCost = 0;
        int weightFee = 0;

        switch(zone){
            case "Local":
                shippingCost = 50;
                break;
            case "Regional":
                shippingCost = 100;
                break;
            case "National":
                shippingCost = 150;
                break;
            case "International":
                shippingCost = 300;
                break;
            default:
                System.out.println("Error");
                break;

        }

        if(weight > 5){
            weightFee = (weight - 5) * 20;
        }
        System.out.println("Shipping zone: " + zone);
        System.out.println("Shipping cost before fees: " + shippingCost + "kr.");
        System.out.println("Added weight fee: " + weightFee + "kr.");
        System.out.println("Total shipping cost: " + (shippingCost + weightFee) + "kr.");

         */




        /*
        //Opgave 12: ATM-transaktion
        int balance = 5000;
        int amount = 1000;
        String operation = "withdraw";

        switch(operation){
            case "withdraw":
                if(amount <= balance){
                    balance -= amount;
                    System.out.println("Successful: " + amount + "kr withdrawed" + " from balance");
                    System.out.println("New balance: " + balance + "kr");
                }
                else{
                    System.out.println("Not enough funds available for withdrawal");
                    System.out.println("Your balance is: " + balance + "kr");
                }
                break;
            case "deposit":
                balance += amount;
                System.out.println("Successful: " + amount + "kr added to balance");
                System.out.println("New balance: " + balance + "kr");
                break;
            case "balance":
                System.out.println("Checking balance...");
                System.out.println("Funds available: " + balance + "kr");
                break;
            case "transfer":
                if(amount <= balance){
                    balance -= amount;
                    System.out.println("Transfered amount: " + amount + "kr");
                    System.out.println("New balance: " + balance + "kr");
                }
                else{
                    System.out.println("Not enough funds available for transfer");
                    System.out.println("Available funds: " + balance + "kr");
                }
                break;
            default:
                System.out.println("ERROR 404 CONTACT SUPPORT");
                break;

        }

         */



        /*
        //Opgave 13: Billetbestillings system

        String eventType = "concert";
        int price = 0;
        int quantity = 2;
        boolean isStudent = true;
        double studentDiscount = 0.80;
        boolean discountApplied = false;

        switch(eventType){
            case "movie":
                price = 100;
                break;
            case "concert":
                price = 250;
                break;
            case "sports":
                price = 200;
                break;
            case "theater":
                price = 150;
                break;
            default:
                System.out.println("No event found for your query");
                break;

        }


        System.out.println("========");
        System.out.println("SUMMARY:");
        System.out.println("Event type: " + eventType);
        System.out.println("Base price per ticket: " + price + "kr");

        if(isStudent && (eventType.equals("concert") || eventType.equals("theater"))){
            price *= studentDiscount;
            discountApplied = true;
        }

        if(discountApplied){
            System.out.println("Elligible for student discount. Price with discount pr. ticket: " + price + "kr");
        }
        else{
            System.out.println("Inelligible for student discount");
        }

        System.out.println("Ticket amount: " + quantity + " tickets");
        System.out.println("Total price for " + quantity + " tickets: " + (price * quantity) + "kr");

         */



        /*
        //Opgave 14: Bestillingssytem

        String item = "coffee";
        double price = 0.0;
        String size = "large";
        boolean isADrink = false;

        switch(item){

            case "coffee":
                isADrink = true;
                price = 25;
                switch(size){
                    case "small":
                        price *= 1.0;
                        break;
                    case "medium":
                        price *= 1.2;
                        break;
                    case "large":
                        price *= 1.5;
                        break;
                    default:
                        System.out.println("Size unknown...");
                }
                break;
            case "tea":
                isADrink = true;
                price = 20;
                switch (size){
                    case "small":
                        price *= 1.0;
                        break;
                    case "medium":
                        price *= 1.2;
                        break;
                    case "large":
                        price *= 1.5;
                        break;
                }
                break;
            case "sandwich":
                price = 45;
                break;
            case "cake":
                price = 35;
                break;
            default:
                System.out.println("Item not found...");
                break;
                

        }


        if(isADrink){
            System.out.println("Drink chosen: " + item);
            System.out.println("Size chosen: " + size);
        }
        else{
            System.out.println("Item chosen: " + item);
        }
        System.out.println("Price: " + price);

         */

        /*
        //Opgave 15: Savings goal
        int i = 0;
        int counter = 0;

        while(i < 10000){
            i += 500;
            counter++;
        }

        System.out.println("Months before 10k: " + counter);

         */


        /*
        //Opgave 16: Loan repayment

        int i = 0;
        int months = 0;
        int debt = 5000;

        while(i < debt){
            months++;
            i += 200;
        }
        System.out.println("Months to repay loan: " + months);

         */



        /*
        //Opgave 17: Temperaturomregningstabel
        
        int celcius = 0;
        int f = 0;

        System.out.println("===CELSIUS TO FAHRENHEIT CONVERTER===");
        while(celcius <= 100){
            System.out.println("Celcius: " + celcius);
            System.out.println("Fahrenheit: " + (celcius * (9.0 / 5.0) + 32));
            System.out.println(" ");
            celcius += 10;

            
            
        }

         */

        //Opgave 18: Renters rente

        


        

        

        










    }


}
