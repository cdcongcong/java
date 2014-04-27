Ext.define('Application.index.view.LoginForm', {
	extend : 'Ext.FormPanel',

	initComponent : function() {
		Ext.apply(this, {
			title : 'StatusBar with Integrated Form Validation',
			renderTo : Ext.getBody(),
			width : 350,
			autoHeight : true,
			id : 'status-form',
			renderTo : Ext.getBody(),
			labelWidth : 75,
			bodyPadding : 10,
			style : {
				marginRight : 'auto',
				marginLeft : 'auto',
				marginTop : '150px',
				marginButton : 'auto'
			},
			defaults : {
				anchor : '95%',
				allowBlank : false,
				selectOnFocus : true,
				msgTarget : 'side'
			},

			items : [{
						xtype : 'textfield',
						fieldLabel : 'Name',
						blankText : 'Name is required'
					}, {
						xtype : 'datefield',
						fieldLabel : 'Birthdate',
						blankText : 'Birthdate is required'
					}],

			dockedItems : [{
				xtype : 'toolbar',
				dock : 'bottom',
				ui : 'footer',
				items : ['->', {
							text : 'Save',
							handler : function() {
								if (fp.getForm().isValid()) {
									fp.getEl().mask();
									fp.getForm().submit({
												url : 'fake.php',
												success : function() {
													sb.setStatus({
																text : 'Form saved!',
																iconCls : '',
																clear : true
															});
													fp.getEl().unmask();
												}
											});
								}
							}
						}]
			}]

		})
	}

});