import java.util.Scanner;

class Person{
	String name, sex, ID;
	int phonNum;
	
	public Person(String name,String sex,String ID,int phonNum) {
		this.name = name;
		this.sex = sex;
		this.phonNum = phonNum;
		this.ID = ID;
		
	}
	
	public Person() {
		
	}
	
}

class Book{
	String bname, writer, pubname;
	int index = 0;
	
	
	public Book(String bname, String writer, String pubname) {
		this.bname = bname;
		this.writer = writer;
		this.pubname = pubname;
		
	}
	
	public Book() {}
	
}

class Situation{
	int s;
	int i = 0;
	int j = 0;
	Person[] per = new Person[10];
	Book[] book = new Book[10];
	
	public void personR() {
		System.out.println("이름을 입력하십시오 : ");
		Scanner sc = new Scanner(System.in);
		per[i] = new Person();
		per[i].name = sc.nextLine();
		i++;
		
	}
	
	public void bookR() {
		System.out.println("책이름을 입력하십시오 : ");
		Scanner sc = new Scanner(System.in);
		book[j] = new Book();
		book[j].bname = sc.nextLine();
		j++;
		
	}
	
}



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Situation sub =new Situation();
		
		while(true) {
			System.out.println("1 : 회원정보 , 2 : 책정보 , 3 : 회원등록 , 4 : 책등록 , 0 : 나가기");
			System.out.println("메뉴 입력 : ");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			
			if(i == 0) {
				System.out.println("감사합니다");
				break;
			}
			else if(i == 1) {
				for(int j = 0; j<sub.i;j++) 
					System.out.println(sub.per[j].name);
				continue;
			}
			else if(i==2)
			{
				for(int j = 0; j<sub.j;j++) 
					System.out.println(sub.book[j].bname);
				continue;
			}
			else if(i==3) sub.personR();

			else if(i==4) sub.bookR();

		}
	}

}
