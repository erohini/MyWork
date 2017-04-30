package question2;

/**
 * An application of solving an quadratic equation.
 * It uses a QuadEquationSolver to solve the problem.
 */

import java.util.Scanner;

public class App {

	double a, b, c;
    QuadEquationSolver solver;
    
	public static void main(String[] args) {
		new App();
	}
	
	App() {
		getCoefficients();
		findAndShowRoots();
	}
	
	private void getCoefficients() {
		Scanner input = new Scanner(System.in);
        System.out.println("To solve quadratic equation a*X*X + b*X + c = 0.");
        System.out.print("\nPlease enter the three coefficients a, b, and c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        input.close();
	}
	
	private void findAndShowRoots(){
        solver = new QuadEquationSolver(a, b, c);
        solver.solve();
        solver.displaySolutions();
	}
}
