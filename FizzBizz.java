
public class FizzBizz {
	
	public static void main(String[] args) {

		boolean isMulByThree=Boolean.FALSE;
		boolean isMulByFive=Boolean.FALSE;
		boolean isPrintStr=Boolean.FALSE;
		String returnVal = null;
		
		for (int cnt=1;cnt<101;cnt++) {
			
			isMulByThree=Boolean.FALSE;
			isMulByFive=Boolean.FALSE;
			isPrintStr=Boolean.FALSE;
			returnVal= null;
			
			if(cnt%3==0) {
				isMulByThree=Boolean.TRUE;
				returnVal="Fizz";
				isPrintStr=Boolean.TRUE;
			}else if(cnt%5==0) {
				isMulByFive=Boolean.TRUE;
				returnVal="Buzz";
				isPrintStr=Boolean.TRUE;
			}
			
			if(isMulByThree && isMulByFive) {
				returnVal = "FizzBuzz";
			}
			
			if(isPrintStr) {
				System.out.println(returnVal);
			}else {
				System.out.println(cnt);
			}
			
		}

	}

}
