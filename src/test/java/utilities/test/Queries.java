package utilities.test;

public class Queries {
	
	public static String topTenHorrorMovies = "SELECT FILM.TITLE AS MOVIE_NAME , CATEGORY.NAME AS MOVIE_CATEGORY , LANGUAGE.NAME AS MOVIE_LANGUAGE FROM CATEGORY\r\n"
			+ "JOIN\r\n"
			+ "FILM_CATEGORY\r\n"
			+ "ON \r\n"
			+ "CATEGORY.CATEGORY_ID = FILM_CATEGORY.CATEGORY_ID\r\n"
			+ "JOIN\r\n"
			+ "FILM\r\n"
			+ "ON\r\n"
			+ "FILM_CATEGORY.FILM_ID = FILM.FILM_ID\r\n"
			+ "JOIN\r\n"
			+ "LANGUAGE\r\n"
			+ "ON\r\n"
			+ "FILM.LANGUAGE_ID = LANGUAGE.LANGUAGE_ID\r\n"
			+ "WHERE \r\n"
			+ "CATEGORY.NAME = 'Horror' \r\n"
			+ "AND \r\n"
			+ "LANGUAGE.NAME = 'English'\r\n"
			+ "ORDER BY TITLE ASC\r\n"
			+ "LIMIT 10 ;";

}
