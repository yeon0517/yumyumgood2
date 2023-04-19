<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>form</title>
  <style>
   
  </style>
</head>

<body>
  <main>
    <form action="/manager/ingredietnInsertOk.manager" method="post" enctype="multipart/form-data"> 
      <fieldset>
        <legend>재료넣기</legend>

        <ul>

          <li>
            재료이름 : <input type="text" name="ingredientName">&nbsp;&nbsp; &nbsp;
          </li>
          <li>
            재료판매가격 : <input type="text" name="ingredientPrice"> &nbsp;원
          </li>

          <li>
            재료 최소판매단위 : <input type="text" name="ingredientSmallestUnit"> &nbsp;g
          </li>
          <li>
            재료 부연설명 : <input type="text" name="ingredientMoreInfo" placeholder="예) 약 1/4개"> &nbsp;
          </li>

          <li>
            <label for="select">  
              재료카테고리  : 
            </label>
            <select  id="select" name="ingredientCategoryNumber">
            
            	<c:forEach var="category" items="${categoryList}">
	              <option value="${category.getIngredientCategoryNumber() }">
	              ${category.getIngredientCategoryName()}</option>
				</c:forEach>
            
            
            </select>&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          </li>
  
          <li>
            재료사진 : <input type="file" name="ingredientImage">&nbsp;&nbsp; &nbsp;
          </li>


        </ul>
        <button type="submit">재료추가</button>
        <a href="/manager/managerListOk.manager">관리자화면으로 이동</a>
      </fieldset>
    </form>
  </main>
</body>

</html>