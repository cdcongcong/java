
Ext.define('Application.index.Index', {
			extend : 'Ext.container.Viewport',
			layout : "border",
			items : [{
						title : "North Pannel",
						html : "上",
						region : "north",
						height : 100
					}, {
						title : "West Pannel",
						html : "左",
						region : "west",
						width : 150
					}, {
						title : "Main Pannel",
						html : "中",
						region : "center"
					}]
		});}
