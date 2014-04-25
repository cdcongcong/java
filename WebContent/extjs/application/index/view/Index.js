Ext.define('Application.index.view.Index', {
	extend : 'Ext.container.Viewport',

	layout : "border",

	initComponent : function() {
		Ext.apply(this, {
			id : 'index-viewport',
			layout : {
				type : 'border',
				padding : '0 5 5 5' // pad the layout from the window
			// edges
			},
			items : [
			// title
			{
				id : 'index-header',
				xtype : 'box',
				region : 'north',
				height : 80,
				html : lang.string.index.title
			},
			// end title
			// 下部整体区域
			{
                xtype: 'container',
                region: 'center',
                layout: 'border',
				items : [
				// 左边功能树
				{
					id : 'index-function-tree',
					title : lang.string.index.functree.title,
					region : 'west',
                    animCollapse: true,
                    width: 200,
                    minWidth: 150,
                    maxWidth: 400,
                    split: true,
                    collapsible: true,
                    border: false,
                    layout:{
                        type: 'accordion',
                        animate: true
                    },
					items : [
					// 系统功能
					{
						html : "",
						title : lang.string.index.functree.applicationfunc,
						autoScroll : true,
						border : false,
						iconCls : 'nav'
					},
					// 我的功能
					{
						title : lang.string.index.functree.myfunc,
						html : "",
						border : false,
						autoScroll : true,
						iconCls : 'settings'
					} ]
				},
				// end 左边功能树
				// 工作区域
				{
					id : 'index-workarea',
					xtype : 'tabpanel',
					region : 'center',
					activeTab : 0,
					enableTabScroll : true,
					animScroll : true,
					border : true,
					autoScroll : true,
					resizeTabs: true,
					split : true,
			        defaults: {
			            autoScroll: true,
			            bodyPadding: 10
			        },
		            plugins: [{
		                ptype: 'tabscrollermenu',
		                maxText  : 15,
		                pageSize : 5
		            }],

		            plugins: Ext.create('Application.index.TabCloseMenu'),		            
		            
					items : [
					// portal
					{
						iconCls : 'icon-activity',
						title : '平台首页',
						xtype : 'portalpanel',
						layout : 'column'
					},
					// end portal
					{
						iconCls : 'icon-activity',
						title : 'XX功能',
						closable: true
					}					
					]
				} ]
			} ]
		});

		this.callParent(arguments);
	},

});