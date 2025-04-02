package keywords;

// enum can maintain group of constants 

enum Day {
	WEEKDAY, WEEKEND
}

public class EnumClass1 {

	enum DIRECTIONS {
		EAST, WEST, SOUTH, NORTH
	}

	public static void main(String[] args) {
		System.out.println(Day.WEEKDAY);
		System.out.println(DIRECTIONS.EAST);
		System.out.println(Priority.HIGH);
	}

}
