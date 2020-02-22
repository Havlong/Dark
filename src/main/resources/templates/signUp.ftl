<#ftl encoding='UTF-8'>
<html lang="ru">
<head>
    <title>Регистрация в интернетах</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="/css/styles.css" rel="stylesheet" type="text/css">

    <script src="/js/jquery-3.2.1.slim.min.js"></script>
    <script src="/js/popper.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-6 mx-auto">
            <div class="myForm form">
                <div class="logo mb-3">
                    <div class="col-md-12 text-center">
                        <h2>Пройдите процедуру регистрации!</h2>
                    </div>
                </div>
                <form action="/signUp" method="post">
                    <#if signupError??>
                        <div class="alert alert-danger">
                            ${alert}
                        </div>
                    </#if>
                    <div class="form-group">
                        <label for="first-name">Имя</label>
                        <input class="form-control" id="first-name" name="firstName"
                               placeholder="Введите ваше имя здесь..." required>
                    </div>
                    <div class="form-group">
                        <label for="first-name">Фамилия</label>
                        <input class="form-control" id="last-name" name="lastName"
                               placeholder="Введите вашу фамилию здесь..." required>
                    </div>
                    <div class="form-group">
                        <label for="username">Имя пользователя</label>
                        <input autofocus class="form-control" id="username" name="username"
                               placeholder="Введите ваш логин здесь..." required>
                    </div>
                    <div class="form-group">
                        <label for="password">Пароль</label>
                        <input class="form-control" id="password" name="password"
                               placeholder="Введите пароль здесь..."
                               required type="password">
                    </div>
                    <div class="form-group">
                        <label for="repeatPassword">Повторите пароль</label>
                        <input class="form-control" id="repeatPassword" name="repeatPassword"
                               placeholder="Введите пароль здесь..."
                               required type="password">
                    </div>

                    <hr class="login-or">

                    <div class="col-md-12 text-center ">
                        <button class="btn myBtn btn-success tx-tfm maxWidth" type="submit">
                            Зарегистрироваться
                        </button>
                    </div>
                </form>

            </div>
        </div>
    </div>
</div>
</body>
</html>