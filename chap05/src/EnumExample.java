import java.time.DayOfWeek;

public class EnumExample {

	enum Gender {
		Male, Female
	}
	
	enum Color {
		Red, Green, Black
	}
	
	
	public static void main(String[] args) {
		Gender g = null;
		
		g = Gender.Male;
		g = Gender.Female;
		
		System.out.println(g);
		
		DayOfWeek week = null;
		
		week = DayOfWeek.FRIDAY;
		
		Color[] colors = Color.values();
		
		for (Color c : colors) {
			System.out.println(c);
			System.out.println(c.ordinal());
			System.out.println(c.toString());
		}
		
	}

}
