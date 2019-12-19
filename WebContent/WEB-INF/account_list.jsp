<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<style type="text/css">
    table  {
        text-align:  center;
        width:800px;
        border-collapse: collapse;
    }
    td,table {
        border: 1px solid  red; 
    }
</style>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="layer/layer.js"></script>
<script type="text/javascript">
    // 自调用函数
    $(function(){
    	// 发送ajax 请求
    	$.ajax({
    		url:"accountList.do",
    		type:"post",
    		success:function(datas){
    			for(var i=0;i<datas.length;i++){
    				var obj = datas[i];
    				var trStr = "<tr id='"+obj.userId+"'> <td>"+obj.userId+"</td> <td>"+obj.staffCode
    				+"</td><td> "+obj.staffName+"</td><td>"+obj.age+"</td><td>"+obj.gender+"</td><td>"+obj.department+"</td> </tr>";
    				$("#accounts").append($(trStr));
    			}
    		},
    		dataType:"json"
    	});
    });
</script>
<script type="text/javascript">
   // 增加用户 
   function  addAccount(){
	   var  userId = $("#userId").val();
	   var  staffCode = $("#staffCode").val();
	   var  staffName = $("#staffName").val();
	   var  age = $("#age").val();
	   var  gender = $("#gender").val();
	   var  department = $("#department").val();
	   $.ajax({
		   url:"account/"+userId,
		   type:"post",
		   success:function(obj){
				layer.msg("增加成功");
				console.log(obj);
				var trStr = "<tr  id='"+obj.userId+"'> <td>"+obj.userId+"</td> <td>"+obj.staffCode
   				+"</td><td> "+obj.staffName+"</td><td>"+obj.age+"</td><td>"+obj.gender+"</td><td>"+obj.department+"</td></tr>";
   				$("#accounts").append($(trStr));
		   },
		   data:{userId:userId,staffCode:staffCode,staffName:staffName,age:age,gender:gender,department:department},
		   dataType:"json"	   
	   });
   }
  </script>
</head>
<body>
    <h1> VCIC用信息管理 </h1>
    <form >
         UserId:     <input  type="text" id="userId"  />  <br>
         StaffCode:  <input  type="text" id="staffCode" /> <br>
         StaffName:  <input  type="text"  id="staffName" /> <br> 
         Age:        <input  type="text"  id="age" /> <br> 
         Gender      <input  type="text"  id="gender" /> <br> 
         DepartMent:  <input  type="text"  id="department"> <br>
         <input  type="button"  value="增加"  onclick="addAccount()">
         <input  type="button"  value="查询"  onclick="queryAccount()">
         <input  type="button"  value="删除"  onclick="removeAccount()">
         <input  type="button"  value="更新"  onclick="updateAccount()">
    </form>
    <table id="accounts">
         <tr> <td>UserID</td> <td>Staff_Code</td><td>Staff_Name</td><td>Age</td><td>Gender</td><td>Department</td></tr>
        
    </table>
</body>
</html>