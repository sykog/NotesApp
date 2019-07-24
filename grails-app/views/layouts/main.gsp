<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Auto Catalog"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="bootstrap.css"/>

    <g:layoutHead/>
</head>

<body>
<div class="navbar navbar-default navbar-static-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="/create">Add Note</a>
            <a class="navbar-brand" href="/notes">All Notes</a>
            <a class="navbar-brand" href="/notes?filter=notes">Notes</a>
            <a class="navbar-brand" href="/notes?filter=todos">To-Do</a>
            <a class="navbar-brand" href="/notes?filter=quotes">Quotes</a>
            <a class="navbar-brand" href="/notes?filter=code">Code</a>
            <a class="navbar-brand" href="/notes?filter=sites">Website</a>
        </div>
        <div class="navbar-collapse collapse" aria-expanded="false" style="height: 0.8px;">
            <ul class="nav navbar-nav navbar-right">
                <g:pageProperty name="page.nav" />
            </ul>
        </div>
    </div>
</div>
<g:layoutBody/>
<div class="footer" role="contentinfo">
</div>

</body>
</html>