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
    <asset:stylesheet src="main.css" />
    <g:layoutHead/>
</head>

<body>
<div class="navbar navbar-default" role="navigation">
    <div class="navbar-header add-note">
        <a class="navbar-brand add-note" href="/create">Add Note</a>
    </div>
    <div class="navbar-header">
        <a class="navbar-brand" href="/notes">All Notes</a>
        <a class="navbar-brand" href="/notes?filter=notes">Notes</a>
        <a class="navbar-brand" href="/notes?filter=todos">To-Do</a>
        <a class="navbar-brand" href="/notes?filter=quotes">Quotes</a>
        <a class="navbar-brand" href="/notes?filter=code">Code</a>
        <a class="navbar-brand" href="/notes?filter=sites">Websites</a>
    </div>
</div>
<g:layoutBody/>
</body>
</html>