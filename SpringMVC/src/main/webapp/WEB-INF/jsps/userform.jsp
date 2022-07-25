<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("utf-8"); %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>회원가입</h1>  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>한글 이름 : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>영문 이름 :</td>    
          <td><form:input path="enname" /></td>  
         </tr>
         <tr>    
          <td>아이디 :</td>    
          <td><form:input path="userid" /></td>  
         </tr> 
         <tr>    
          <td>비밀 번호 :</td>    
          <td><form:input path="password" /></td>  
         </tr> 
         <tr>    
          <td>전화 번호 :</td>    
          <td><form:input path="phonenum" /></td>  
         </tr> 
         <tr>    
          <td>이메일 :</td>    
          <td><form:input path="email" /></td>  
         </tr>
         <tr>    
          <td>성별 :</td>    
          <td><form:input path="gender" /></td>  
         </tr> 
         <tr>    
          <td>생년월일 :</td>    
          <td><form:input path="birth" /></td>  
         </tr>   
         <tr>    
          <td>나이 :</td>    
          <td><form:input path="age" /></td>  
         </tr>  
          
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>