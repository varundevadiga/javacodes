public class B {
	
	public static void main(String[] args) {
		//stockProblem();
		boyOrGirl();
	}
	
	public static void boyOrGirl() {
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		String girl = "CHAT WITH HER!";
		String boy = "IGNORE HIM!";
		
		HashSet<String> str = new HashSet<String>();
		
		for(int i = 0; i < id.length(); i++) {
			str.add(String.valueOf(id.charAt(i)) );
		}
		
		if(str.size() % 2 == 0) {
			System.out.println(girl);
		} else {
			System.out.println(boy);			
		}
		
		scanner.close();
	}