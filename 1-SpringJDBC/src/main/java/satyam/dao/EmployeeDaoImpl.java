package satyam.dao;

import satyam.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository("dao")//Write dao is optional by default camel case of IEmplyeeImpl consider.
public class EmployeeDaoImpl implements IEmpolyeeDao {
    List<Employee> employess = null;
    @Autowired
    private DataSource dataSource;
    private String SQL_QUERY = "SELECT * FROM Employee";

    @Override
    public List<Employee> getEmployeeInfo() {
        try {

            Connection connection = dataSource.getConnection();
            PreparedStatement pstmnt = connection.prepareStatement(SQL_QUERY);

            ResultSet rs = pstmnt.executeQuery();
            employess = new ArrayList<>();

            while (rs.next()) {
                Employee emp = new Employee();

                Integer i = rs.getInt(1);
                emp.setId(i);

                String name = rs.getString(2);
                emp.setName(name);

                String city = rs.getString(3);
                emp.setCity(city);

                employess.add(emp);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return employess;

    }


}
