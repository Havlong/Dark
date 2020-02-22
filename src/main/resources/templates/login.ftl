<#ftl encoding='UTF-8'>
<html lang="ru">
<head>
    <title>Вход в интернеты</title>
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
                        <h2>Пожалуйста войдите в систему!</h2>
                    </div>
                </div>
                <#if error??>
                    <div class="alert alert-danger">
                        Логин или пароль введены неверно
                    </div>
                </#if>
                <form action="/login" method="post">
                    <div class="form-group">
                        <label for="username">Логин</label>
                        <input autofocus class="form-control" id="username" name="username"
                               placeholder="Введите логин здесь..." required>
                    </div>
                    <div class="form-group">
                        <label for="password">Пароль</label>
                        <input class="form-control" id="password" name="password"
                               placeholder="Введите пароль здесь..."
                               required type="password">
                    </div>

                    <div class="form-check">
                        <label for="remember-me">
                            <input id="remember-me" type="checkbox" name="remember-me">Запомнить меня
                        </label>
                    </div>

                    <div class="col-md-12 text-center ">
                        <button class="btn myBtn btn-success tx-tfm maxWidth" type="submit">
                            Войти
                        </button>
                    </div>

                    <div class="col-md-12 ">
                        <div class="login-or">
                            <hr class="hr-or">
                            <span class="span-or">
                                    Или
                            </span>
                        </div>
                    </div>

                    <div class="col-md-12 mb-3">
                        <p class="text-center">
                            <a class="btn myBtn btn-primary tx-tfm maxWidth" href="/signUp">
                                Зарегистрироваться
                            </a>
                        </p>
                    </div>
                </form>

            </div>
        </div>
    </div>
</div>

</body>
</html>