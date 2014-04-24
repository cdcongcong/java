<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Portal</title>
<!-- <base href="extjs/application/portal/" /> -->

    <link rel="stylesheet" type="text/css" href="portal.css" />

    <!-- GC -->

    <!-- <x-compile> -->

    <!-- <x-bootstrap> -->
    <script type="text/javascript" src="../../application/shared/include-ext.js"></script>
    <script type="text/javascript" src="../../application/shared/options-toolbar.js"></script>
    <!-- </x-bootstrap> -->

    <!-- shared example code -->
    <script type="text/javascript" src="../shared/examples.js"></script>

    <script type="text/javascript">
        Ext.Loader.setPath('Ext.app', 'classes');
    </script>
    <script type="text/javascript" src="portal.js"></script>
    <script type="text/javascript">
        Ext.require([
            'Ext.layout.container.*',
            'Ext.resizer.Splitter',
            'Ext.fx.target.Element',
            'Ext.fx.target.Component',
            'Ext.window.Window',
            'Ext.app.Portlet',
            'Ext.app.PortalColumn',
            'Ext.app.PortalPanel',
            'Ext.app.Portlet',
            'Ext.app.PortalDropZone',
            'Ext.app.GridPortlet',
            'Ext.app.ChartPortlet'
        ]);

        Ext.onReady(function(){
            Ext.create('Ext.app.Portal');
        });
    </script>
    <!-- </x-compile> -->
</head>
<body>
    <span id="app-msg" style="display:none;"></span>
</body>
</html>
