package cho111;
import java.util.Scanner;
public class Engine{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		while(true){
		System.out.println("1.시작 2.종료");
		int menu=s.nextInt();
				
			switch(menu){
			case  1:{
			System.out.println("시작");
			break;
			}
			
			case  2 :{
			System.out.println("종료");
			return;
			}
			}
		}
	}
}

		
			
				

