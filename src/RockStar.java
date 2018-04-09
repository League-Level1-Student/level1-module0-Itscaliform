
public class RockStar {
public static void main(String[] args) {
//weRock();
	//rocker("roberto");
	//truth("Post Malone");
	//echo("hello");
	//repeat("mayday", 4);
	//String theBest = getTheBestCoder();
	//System.out.println(theBest); 
	 //int sum = add(2,2);
	 //System.out.println(sum); //prints 4 
	//oddorna(6);
}
static int oddorna(int r){
	if (r/3==1) {
		
		System.out.println("odd");
	}
	else {
		System.out.println("naaaa");
	}
	
	return r;	
}
private static int add(int i, int j) {
	// TODO Auto-generated method stub
	int num = i+j;
	
	return num;
}
private static String getTheBestCoder() {
	// TODO Auto-generated method stub
	String name = "roberto williams";
	
	return name;
}
static void weRock() {
	System.out.println("The League rocks");
	
	
}
static void rocker(String rocker) {
	System.out.println(rocker+" rocks");
}
static void truth(String singer) {
	if(singer.equals("Post Malone")) {
		System.out.println(singer+" is awesome");
	}
	else {
		System.out.println(singer+ "is annoying");
	}
	
}
static void echo(String echo) {
	System.out.println(echo+" "+echo);
	
	
}
static void repeat(String name, int num) {
	for (int i = 0; i <num; i++) {
		
	
	System.out.println(name);
}

}
}
