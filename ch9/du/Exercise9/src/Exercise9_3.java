import java.util.Arrays;

class Exercise9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		String[] arr = fullPath.split("\\\\");
		String[] pArr = Arrays.copyOfRange(arr, 0, arr.length - 1);

		path = String.join("\\", pArr);
		fileName = arr[arr.length - 1];

		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}