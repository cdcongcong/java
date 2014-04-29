Ext.define('Application.index.view.LoginForm', {
	extend : 'Ext.FormPanel',

	requires : [ 'Ext.JSON' ],

	initComponent : function() {
		Ext.apply(this, {
			title : lang.string.index.login.title,
			renderTo : Ext.getBody(),
			width : 350,
			autoHeight : true,
			id : 'login-form',
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

			items : [
					// 用户
					{
						xtype : 'textfield',
						name: 'userName',
						fieldLabel : lang.string.index.login.username,
						blankText : Ext.util.Format.format(
								lang.string.required,
								lang.string.index.login.username)
					},
					// 密码
					{
						xtype : 'textfield',
						inputType: 'password',
						name : 'password',
						fieldLabel : lang.string.index.login.password,
						blankText : Ext.util.Format.format(
								lang.string.required,
								lang.string.index.login.password)
					} ],

			// toolbar
			dockedItems : [ {
				xtype : 'toolbar',
				dock : 'bottom',
				ui : 'footer',
				// 登录
				items : [ '->', {
					text : lang.string.index.login.submit,
					type : 'submit',
					handler : this.loginAction
				} ]
			} ]

		});
		this.callParent(arguments);
	},

	//登录按钮处理函数
	loginAction : function() {
//        Ext.MessageBox.alert("提示",
//        "Application.index.view.LoginForm.loginAction");

		var form = this.up('form');

		if (form.getForm().isValid()) {
//			form.mask();
			form.getForm().submit(
					{
						url : 'user/submit.json',
						method : "GET",
						params : {}, // 传递的参数
						success : function(form, action) {
							
//							var responseArray = Ext.JSON
//									.decode(action.response.responseText);
//							Ext.MessageBox.alert("success",
//									responseArray);
							window.location.href="index.jsp";
														
//							form.reset();
//							this.hide();

//							Ext.create('Application.index.view.Index');
//							form.unmask();
						},
						failure : function(form, action) {
							
//							var responseArray = Ext.JSON
//									.decode(action.response.responseText);
//							Ext.MessageBox.alert("failure",
//									responseArray);
//							
//							window.location.href="index.jsp";
							
//							form.reset();
//							form.getEl().unmask();

						}
					});
		}

	}
});