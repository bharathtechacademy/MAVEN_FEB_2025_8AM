package utilities.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import utilities.DbUtil;

public class DBTest {	

	public static void main(String[] args) throws SQLException {
		List<Map<String,String>> data = DbUtil.readData(Queries.topTenHorrorMovies);
		for(Map<String,String> row : data) {
			System.out.println(row);
		}
	}

}
