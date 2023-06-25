package project190;

public class shipShipped {
   
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};  // Example weights
        int days = 5;  // Example number of days

        int minCapacity = shipWithinDays(weights, days);
        System.out.println("Minimum capacity to ship packages in " + days + " days: " + minCapacity);
    }

    public static int shipWithinDays(int[] weights, int days) {
        int left = getMaxWeight(weights);  // Get the maximum weight as the left boundary
        int right = getSumOfWeights(weights);  // Get the sum of all weights as the right boundary

        while (left < right) {
            int mid = left + (right - left) / 2;  // Calculate the midpoint between left and right boundaries
            int requiredDays = calculateRequiredDays(weights, mid);  // Calculate the required days with current capacity

            if (requiredDays <= days) {
                right = mid;  // Decrease the right boundary if the required days are less than or equal to the given days
            } else {
                left = mid + 1;  // Increase the left boundary if the required days exceed the given days
            }
        }

        return left;  // The left boundary represents the minimum capacity to ship packages within the given days
    }

    private static int getMaxWeight(int[] weights) {
        int max = Integer.MIN_VALUE;
        for (int weight : weights) {
            max = Math.max(max, weight);
        }
        return max;
    }

    private static int getSumOfWeights(int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }

    private static int calculateRequiredDays(int[] weights, int capacity) {
        int days = 1;
        int currentCapacity = 0;

        for (int weight : weights) {
            currentCapacity += weight;
            if (currentCapacity > capacity) {
                days++;
                currentCapacity = weight;
            }
        }

        return days;
    }
}


