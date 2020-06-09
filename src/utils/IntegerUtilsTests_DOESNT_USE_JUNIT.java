package utils;
import java.util.HashSet;

import utils.IntegerUtils_Sloan;
public class IntegerUtilsTests_DOESNT_USE_JUNIT {

	public static void main(String[]args)
	{
//		test_sumthing();
//		test_isEven();
//		test_getMaximum();
//		test_isPrime();
//		test_GCF();
//		test_GCM();
//		test_getIntegerH();
//		test_getMinimum();
		test_isSorted();
//		test_getSmallestIndexOfMatch();
//		test_reverse();
	}
	private static void test_sumthing()
	{
	assert IntegerUtils_Sloan.sumthing(14) == 5:"error: sumthing did not work";
	
	}
	
	private static void test_isEven()
	{
		assert IntegerUtils_Sloan.isEven(2) == true: "error: isEven did not work"; //middle of road
		assert IntegerUtils_Sloan.isEven(0) == true: "error: isEven did not work at zero"; //degenerate 
		assert IntegerUtils_Sloan.isEven(-2) == true: "error: isEven did not work at negative two";//cornercase
	}
	
	private static void test_isOdd()
	{
		assert IntegerUtils_Sloan.isOdd(2) == false: "error: isODD did not work on two"; //middle of road
		assert IntegerUtils_Sloan.isOdd(3) == true: "error: isODD did not work on three"; //middle of road
		assert IntegerUtils_Sloan.isOdd(-3) == true: "error: isODD did not work on negative three"; //cornercase
		assert IntegerUtils_Sloan.isOdd(0) == false: "error: isODD did not work on two"; //middle of road
	}
	private static void test_getMaximum()
	{
		HashSet<Integer> setToTest = new HashSet<Integer>() {{
			add(-10);
			add(-5);
		}};
		assert IntegerUtils_Sloan.getMaximum(setToTest) == -5: "error: isODD did not work on negative five";
	}
	
	private static void test_isPrime()
	{
		assert IntegerUtils_Sloan.isPrime(3) == true:"error: cornercase: isPrime did not work on 3"; //middle of road
		assert IntegerUtils_Sloan.isPrime(2) == true: "error: cornercase: isPrime did not work on 2"; //cornercase
		assert IntegerUtils_Sloan.isPrime(1) == false:"error: degenerate: isPrime did not work on 0"; //degenerate
		assert IntegerUtils_Sloan.isPrime(0) == false:"error: degenerate: isPrime did not work on 0"; //degenerate
		assert IntegerUtils_Sloan.isPrime(-1) == false:"error: degenerate: isPrime did not work on 0"; //degenerate
	}
	private static void test_GCF()
	{
		assert IntegerUtils_Sloan.greatestCommonFactor(12, 16) == 4:"error: middle of road: GCF did not work on 12 & 16"; //middle of road
		assert IntegerUtils_Sloan.greatestCommonFactor(1, 1) == 1:"error: cornercase: GCF did not work on 1 & 1"; //cornercase
		assert IntegerUtils_Sloan.greatestCommonFactor(-1, 1) == -1:"error:degenerate:GCF did not work on -1 & 1";//degenerate
		assert IntegerUtils_Sloan.greatestCommonFactor(-10, 5) == 5;//degenerate 
	}
	
	private static void test_GCM()
	{
		assert IntegerUtils_Sloan.getGreatestConstrainedMultiple(7, 50) == 49;//middle of road
		assert IntegerUtils_Sloan.getGreatestConstrainedMultiple(1, 1) == 1;//cornercase
		assert IntegerUtils_Sloan.getGreatestConstrainedMultiple(-5, 25) == 25;//degenerate
		assert IntegerUtils_Sloan.getGreatestConstrainedMultiple(700, -3) == -700;//degenerate - doesnt work
	}
	
	private static void test_getIntegerH()
	{
		assert IntegerUtils_Sloan.getIntegerH(7, 3) == 23;//cornercase
		assert IntegerUtils_Sloan.getIntegerH(15, 0) == 45;//middle of road
	}
	
	private static void test_getMinimum()
	{
//		int[] intArray = new int[]{10, 20, 30};
		int[] intArrayTest1 = {2, 4, -6, 8, 10};
		int[] intArrayTest2 = {2, 4, -6, 8, -10};
		assert IntegerUtils_Sloan.getMinimum(intArrayTest1) == -6;
		assert IntegerUtils_Sloan.getMinimum(intArrayTest2) == -10;
	}
	
	private static void test_isSorted()
	{
		int[] intArrayTest1 = {2, 4, 3, 8, 10};//middle road
		int[] intArrayTest2 = {2, 4, 6, 8, 10};//middle road
		int[] intArrayTest3 = {2, 4, -6, 8, 10};//cornercase
		int[] intArrayTest4 = {0, 1, 2, 3, 4};//cornercase
		
		assert IntegerUtils_Sloan.isSorted(intArrayTest1) == false;
		assert IntegerUtils_Sloan.isSorted(intArrayTest2) == true;
		assert IntegerUtils_Sloan.isSorted(intArrayTest3) == false;
		assert IntegerUtils_Sloan.isSorted(intArrayTest4) == true;
	}
	
	private static void test_getSmallestIndexOfMatch()
	{
		int[] intArrayTest1 = {2, 4, 3, 8, 10};//middle road
		int[] intArrayTest2 = {-2, 4, -2, 8, 10};//cornercase
		int[] intArrayTest3 = {2, 4, 2, 8, 10};//cornercase
		
		assert IntegerUtils_Sloan.getSmallestIndexOfMatch(intArrayTest1, 3) == 2;
		assert IntegerUtils_Sloan.getSmallestIndexOfMatch(intArrayTest3, 2) == 0;
		assert IntegerUtils_Sloan.getSmallestIndexOfMatch(intArrayTest2, -2) == 0;
	}
	private static void test_reverse()
	{
		assert IntegerUtils_Sloan.reverse(89)==98;
		assert IntegerUtils_Sloan.reverse(91)==19;
		assert IntegerUtils_Sloan.reverse(10)==01;
		assert IntegerUtils_Sloan.reverse(0)==0;
	}
	
	
	
	
}














