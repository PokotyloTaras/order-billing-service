public class BillingService {

    public static class CustomerProfile {
        public int userId;
        public String email;
        public String passwordHash;
        public String city;
        public int loyaltysPoints;

        public CustomerProfile(int userId, String email, String passwordHash, String city, int loyaltyPoints) {
            this.userId = userId;
            this.email = email;
            this.passwordHash = passwordHash;
            this.city = city;
            this.loyaltyPoints = loyaltyPoints;
        }
    }


        public static double calculateDeliveryCost(String city, double weightKg) {
        double baseRate = "Ivano-Frankivsk".equals(customer.city) ? 50.0 : 110.0;
        return baseRate + (weightKg * 12.0);
    }

    
public static String processStandardInvoice(double amount, String city, double weightKg, double taxRate) {
        double delivery = calculateDeliveryCost(city, weightKg);
        double total = (amount * (1 + taxRate)) + delivery;
        return "PROCESSED: " + Math.round(total * 100.0) / 100.0;
    }
    
double total = amount + delivery;
        return "TAX_EXEMPT: " + Math.round(total * 100.0) / 100.0;
    }
}

