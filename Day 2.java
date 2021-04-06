import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the solve function below.
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip = (meal_cost * tip_percent) / 100;
		double tax = (meal_cost * tax_percent) / 100;
		System.out.println(Math.round(meal_cost + tip + tax));
	}
}