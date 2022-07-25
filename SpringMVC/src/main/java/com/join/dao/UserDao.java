package com.join.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.join.beans.User;

public class UserDao {
	JdbcTemplate template;  
		
		public void setTemplate(JdbcTemplate template) {  
		    this.template = template;  
		}  
		public int save(User p){  
		    String sql="insert into Userinfo(name,enname,userid,password,phonenum,birth,gender,email,age) values('"+p.getName()+"',"+p.getEnname()+"',"+p.getUserid()+",'"+p.getPassword()+"',"+p.getPhonenum()+"',"+p.getBirth()+"',"+p.getGender()+"',"+p.getEmail()+",'"+p.getAge()+"')";  
		    return template.update(sql);  
		}  
		public int update(User p){  
		    String sql="update Userinfo set name='"+p.getName()+"', enname='"+p.getEnname()+"', userid='"+p.getUserid()+"',password='"+p.getPassword()+"', phonenum='"+p.getPhonenum()+"', birth='"+p.getBirth()+"', gender='"+p.getGender()+"', email='"+p.getEmail()+"', age='"+p.getAge()+"' where id="+p.getId()+"";  
		    return template.update(sql);  
		}  
		public int delete(int id){  
		    String sql="delete from Userinfo where id="+id+"";  
		    return template.update(sql);  
		}  
		public User getUserById(int id){  
		    String sql="select * from Userinfo where id=?";  
		    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<User>(User.class));  
		}  
		public List<User> getUsers(){  
		    return template.query("select * from Userinfo",new RowMapper<User>(){  
		        public User mapRow(ResultSet rs, int row) throws SQLException {  
		            User e=new User();  
		            e.setId(rs.getInt(1));
		            e.setName(rs.getString(2));
		            e.setEnname(rs.getString(3));
		            e.setUserid(rs.getString(4));
		            e.setPassword(rs.getString(5));
		            e.setPhonenum(rs.getString(6));
		            e.setBirth(rs.getString(7));
		            e.setGender(rs.getString(8));
		            e.setEmail(rs.getString(9));   
		            e.setAge(rs.getInt(10));  
		            return e;  
		        }  
		    });  
		}
}
