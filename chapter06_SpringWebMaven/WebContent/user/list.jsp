<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  .table{border: 1px solid;border-collapse:collapse; border-spacing:0px;}
  .table th{width: 100px}
  .table th, table td{border: 1px solid;  padding: 5px}
</style>
</head>
<body>
  <table id="table" class="table">
	<tr>
	  <th>이름</th>
	  <th>아이디</th>
	  <th>비밀번호</th>
	</tr>
  </table>
</body>
 <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
 <script type="text/javascript">
   $(document).ready(function(){
	   $.ajax({
		   type: 'post',
		   url: '/chapter06_SpringWebMaven/user/getUserList',
		   dataType:'json',
		   success:function(data){
			   //alert(JSON.stringify(data));
			   $.each(data.list, function(index, items){
				   $('<tr/>').append($('<td/>',{
					   align: 'center',
					   text: items.name
				   })).append($('<td/>',{
					   align: 'center',
					   text: items.id
				   })).append($('<td/>',{
					   align: 'center',
					   text: items.pwd
				   })).appendTo('#table');
			   });
		   }
		   
	   });
   });
 </script>
</html>