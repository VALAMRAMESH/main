package io.javabrains.utils;

public class Testmain {

//	public static void main(String[] args) {
//		List<String> mylist = Arrays.asList("allen", "Albert", "Robert", "Jackson");assertThat("All anmes with A", allOf(equalTo("Once"), hasItem("A")));
//		
//		List<String> mylist = Arrays.asList("allen", "Albert", "Robert", "Jackson");assertThat("All anmes with A", allOf(equalTo("Once"), containsString("A")));
//	
//
//	List<String> mylist = Arrays.asList("allen", "Albert", "Robert", "Jackson");assertThat("All anmes with A", allOf(equalTo("Once"), startsWith("A")));
//	
//	
//	List<String> mylist = Arrays.asList("allen", "Albert", "Robert", "Jackson");assertThat("All anmes with A", allOf(equalTo("Once"), contains("A")));
//}
	
	
	@Test(timeout   = 5000)
 	public void testTimeoutOne() throws InterruptedException 
 	{ int i=500;
 		TimeUnit.SECONDS.sleep(5000);
 		while(i<=10000) 
 			 System.out.println(i++);
 	}
	
}
