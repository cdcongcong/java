Ext.define('Application.index.view.Index', {
	extend : 'Ext.container.Viewport',

	// layout : "border",
	border : false,

	initComponent : function() {
		Ext.apply(this, {
			id : 'index-viewport',
			layout : {
				type : 'border',
				padding : '0 1 1 1' // pad the layout from the window
				// edges
			},
			items : [
					// title
					{
				id : 'index-header',
				xtype : 'box',
				region : 'north',
				height : 80,
				html : lang.string.index.title,
				border : false
			},
					// end title
					// 下部整体区域
					{
						xtype : 'container',
						region : 'center',
						layout : 'border',
						items : [
								// 左边功能树
								{
							id : 'index-function-tree',
							title : lang.string.index.functree.title,
							region : 'west',
							animCollapse : true,
							width : 200,
							minWidth : 150,
							maxWidth : 400,
							split : true,
							collapsible : true,
							border : false,
							layout : {
								type : 'accordion',
								animate : true
							},
							items : [
									// 系统功能
									{
								html : "",
								title : lang.string.index.functree.applicationfunc,
								autoScroll : true,
								border : true,
								iconCls : 'nav'
							},
									// 我的功能
									{
										title : lang.string.index.functree.myfunc,
										html : "",
										border : true,
										autoScroll : true,
										iconCls : 'settings'
									}]
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
									border : false,
									height : 40,
									autoScroll : true,
									resizeTabs : true,
									split : true,
									defaults : {
										autoScroll : true,
										bodyPadding : 1
									},


									plugins : Ext
											.create('Application.index.TabCloseMenu'),

									items : [
											// portal
											{
										iconCls : 'icon-activity',
										title : '平台首页',
										xtype : 'portalpanel',
										border : true,
										layout : 'column'
									},
											// end portal
											{
												iconCls : 'icon-activity',
												title : 'XX功能',
												border : true,
												closable : true
											},
                                            {
                                                iconCls : 'icon-activity',
                                                title : 'XX功能',
                                                border : false,
                                                closable : true
                                            },
                                            {
                                                iconCls : 'icon-activity',
                                                title : 'XX功能',
                                                border : false,
                                                closable : true
                                            },
                                            {
                                                iconCls : 'icon-activity',
                                                title : 'XX功能',
                                                border : false,
                                                closable : true
                                            }
                                            
                                            ]
								}]
					}]
		});

		this.callParent(arguments);
	}
	,

});