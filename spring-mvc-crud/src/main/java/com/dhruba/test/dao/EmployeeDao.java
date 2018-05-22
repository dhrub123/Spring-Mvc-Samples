package com.dhruba.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dhruba.test.beans.Employee;

public class EmployeeDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int save(Employee employee){
		int id = (int)(Math.random()*10000);
		String sql = "insert into employee(id,name,salary,designation) values("+ id +",'"+employee.getName()+"',"+employee.getSalary()+",'"+employee.getDesignation()+"')";  
		return template.update(sql);
	}
	
	public int update(Employee employee){  
	    String sql="update employee set name='"+employee.getName()+"', salary="+employee.getSalary()+",designation='"+employee.getDesignation()+"' where id="+employee.getId()+"";  
	    return template.update(sql);  
	}  
	
	public int delete(int id){  
	    String sql="delete from employee where id = " + id;  
	    return template.update(sql);  
	}  
	
	public Employee getEmpByName(int id){  
	    String sql="select * from employee where id = ?";
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));
	    
	} 
	
	public List<Employee> getEmployees(){
		
		return template.query("select * from employee order by id asc", new RowMapper<Employee>(){
			public Employee mapRow(ResultSet rs, int row) throws SQLException{
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				emp.setDesignation(rs.getString(4));
				return emp;
			}
		});
	}
}
