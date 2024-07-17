import java.util.Stack;

public class PostfixEvaluation {

    // Function to evaluate a postfix expression
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        // Split the expression by spaces to get each token
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            // Check if the token is a number
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                // Token is an operator, pop two operands from the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = applyOperator(token.charAt(0), operand1, operand2);
                stack.push(result);
            }
        }

        // The result is the last item remaining in the stack
        return stack.pop();
    }

    // Function to check if a token is a number
    private static boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Function to apply an operator to two operands
    private static int applyOperator(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        String expression = "3 4 + 2 *";
        int result = evaluatePostfix(expression);
        System.out.println("Output: " + result); // Output: 14
    }
}
