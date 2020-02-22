<#ftl encoding='UTF-8'>
<html lang="ru">
<head>
    <title>Чайники</title>
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
                    Зарегистрированные пользователи
                </h3>
            </div>

        </div>
        <div class="card-body">
            <div class="card-text text-center">
                <table class="table table-bordered table-hover">
                    <tr class="thead-dark">
                        <th>
                            Имя пользователя
                        </th>
                        <th>
                            Фамилия
                        </th>
                        <th>
                            Имя
                        </th>
                        <th>
                            Роль
                        </th>
                    </tr>
                    <#list usersFromServer as user>
                        <tr>
                            <td>${user.userName}</td>
                            <td>${user.firstName}</td>
                            <td>${user.lastName}</td>
                            <td>${user.role}</td>
                        </tr>
                    </#list>
                </table>
            </div>
        </div>
    </div>
</div>
</html>