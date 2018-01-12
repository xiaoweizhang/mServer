package cn.xinxing.business;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.xinxing.model.Students;

/**
 */
public class StudentBusiness {

	/**
	 * 
	 * @return
	 */
	public static List<Students> getAllStudents() {
		List<Students> list = new ArrayList<Students>();
		String sql = null;
		DBHelper db1 = null;
		sql = "select *from student";// SQL
		db1 = new DBHelper(sql);//
		ResultSet ret = null;
		try {
			ret = db1.pst.executeQuery();
			while (ret.next()) {
				int id = ret.getInt(1);
				String name = ret.getString(2);
				int age = ret.getInt(3);
				int sex = ret.getInt(4);
				Students students = new Students();
				students.setId(id);
				students.setName(name);
				students.setAge(age);
				students.setSex(sex);
				list.add(students);
			} //
			ret.close();
			db1.close();//
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //

		return list;
	}

	/**
	 * @param _id
	 * @return
	 */
	public static Students getStudentInfoById(String _id) {
		String sql = null;
		DBHelper db1 = null;
		sql = "select * from student where id =" + _id;// 
		db1 = new DBHelper(sql);// 
		ResultSet ret = null;
		Students students = new Students();
		try {
			ret = db1.pst.executeQuery();
			while (ret.next()) {
				int id = ret.getInt(1);
				String name = ret.getString(2);
				int age = ret.getInt(3);
				int sex = ret.getInt(4);
				int mobile = ret.getInt(5);
				students.setId(id);
				students.setName(name);
				students.setAge(age);
				students.setSex(sex);
				students.setMobile(mobile);
			} // 
			ret.close();
			db1.close();// 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 
		return students;
	}
}
