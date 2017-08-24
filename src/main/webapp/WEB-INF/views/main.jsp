<%@page pageEncoding="UTF-8" contentType="text/html" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
	<title>Форма регистрации</title>
	<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
</head>
<body>

	<h1>${signUpModel.name}. Спасибо за регистрацию</h1>
	<p>На ваш почтовый адрес ${signUpModel.email} отправлено письмо. Пожалуйста подтвердите</p>
	
</body>
</html>
