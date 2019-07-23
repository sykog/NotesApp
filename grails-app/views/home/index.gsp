<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Home Page</title>
</head>
<body>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome ${name}!</h1>
        <g:if test="${flash.message}">
            <h4>${flash.message}</h4>
        </g:if>

        <p>There are ${vehicleTotal} vehicles in the database.</p>

        <ul><g:each in="${vehicles}" var="vehicle">
            <li>
                <g:link controller="vehicle" action="show" id="${vehicle.id}">
                    ${vehicle.class} - ${vehicle.content}
                </g:link>
            </li>
        </g:each></ul>
    </section>
</div>

</body>
</html>