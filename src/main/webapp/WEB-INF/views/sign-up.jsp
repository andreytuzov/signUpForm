<%@page pageEncoding="UTF-8" contentType="text/html" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
	<title>Форма регистрации</title>
	<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
</head>
<body>

	<form:form action="sign-up-process" method="post" modelAttribute="signUpModel">

		<h1>Регистрация</h1>

		<fieldset>
			<legend><span class="number">1</span>Базовая информация</legend>
			<p>
				<label class="field_name">Ник:</label>
				<form:errors path="name" cssClass="error"/>
				<form:input path="name"/>
			</p>
			<p>
				<label class="field_name">Почта:</label>
				<form:errors path="email" cssClass="error"/>
				<form:input path="email"/>
			</p>
			<p>
				<label class="field_name">Пароль:</label>
				<form:errors path="password" cssClass="error"/>
				<form:input path="password"/>
			</p>
			<p>
				<label>Пол:</label>
				<form:errors path="sex" cssClass="error"/>
				<form:radiobuttons path="sex" items="${sexOptions}"/>
			</p>
			<p>
				<label>Возраст:</label>
				<form:errors path="age" cssClass="error"/>
				<form:input path="age"/>
			</p>
		</fieldset>

		<fieldset>
			<legend><span class="number">2</span>Ваш профиль</legend>
			<p>
				<label>О себе:</label>
				<form:errors path="biography" cssClass="error"/>
				<form:textarea path="biography"/>
			</p>
			<p>
				<label>Английский:</label>
				<form:errors path="english" cssClass="error"/>
				<form:radiobuttons path="english" items="${englishLevelsOptions}"/>
			</p>
			<p>
				<label>Работа:</label>
				<form:select path="job">
					<form:options items="${jobOptions}"/>
				</form:select>
			</p>
			<p>
				<label>Интересы:</label>
				<form:errors path="interest" cssClass="error"/>
				<form:checkboxes path="interest" items="${interestOptions}"/>
			</p>
		</fieldset>
		<button type="submit">Зарегистрироваться</button>
	</form:form>

</body>
</html>
