//implimenting a java program using findingDuplicateValue
package apjfsa;
//class declaration
public class FindingDuplicateValue {
     //main-function
	public static void main(String[] args) {
		//declaring array elements
		int[] a= {30,20,40,30,55,30,50,30};
		int count=0;
		//check the duplicate values
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					//print duplicate values
					System.out.println(a[j]);
					count++;
				}
			}
		}
		//print count value
		System.out.println(count);
	}
}
