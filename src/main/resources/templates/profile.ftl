<#ftl encoding='UTF-8'>
<html lang="ru">
<head>
    <title>Ваш профиль</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="/css/styles.css" rel="stylesheet" type="text/css">

    <script src="/js/jquery-3.2.1.slim.min.js"></script>
    <script src="/js/popper.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
</head>
<div class="container">
    <div class="card">
        <div class="card-header">
            <div class="card-title">
                <h3>
                    Это ваш профиль
                </h3>
            </div>

        </div>
        <div class="card-body">
            <div class="card-text">
                <h4>
                    ${user.firstName} ${user.lastName}
                </h4>
            </div>
        </div>
        <div class="card-footer text-center">
            <a href="/logout" class="myBtn btn btn-danger">
                Выйти в окно
            </a>
        </div>
    </div>
</div>
</html>