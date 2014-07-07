<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includeJsp.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<base href="<%=basePath%>" />
<link rel="stylesheet" type="text/css"
	href="jsp/jquery-easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="jsp/jquery-easyui/themes/icon.css" />
<!-- <link rel="stylesheet" type="text/css" href="../demo.css" />-->
<!-- <script type="text/javascript" src="jsp/jquery-easyui/json2.js"></script>-->
<script type="text/javascript" src="jsp/jquery-easyui/jquery.min.js"></script>
<script type="text/javascript" src="jsp/jquery-easyui/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript"
	src="jsp/jquery-easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jsp/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>

<title>列表编辑</title>
</head>
<body>

	<form id="fm" action="user.json" method="post" novalidate>
		<div class="fitem">
			<label>success:</label> <input name="success"
				class="easyui-validatebox" required="true">
		</div>
		<div class="fitem">
			<label>total:</label> <input name="total" class="easyui-validatebox">
		</div>

		<table id="dg" class="easyui-datagrid" title="Row Editing in DataGrid"
			style="width: 700px; height: auto"
			data-options="
                iconCls: 'icon-edit',
                singleSelect: true,
                pagination:true,
                toolbar: '#tb',
                rownumbers:true,
              <!--   url: 'user/list.json', -->
                method: 'get',
                onClickRow: onClickRow
            ">
			<thead>
				<tr>
					<th data-options="field:'userid',width:80">userid</th>
					<th data-options="field:'orderno',width:80,editor:'text'">orderno</th>
					<th data-options="field:'userno',width:80,editor:'text'">userno</th>
					<th data-options="field:'username',width:250,editor:'text'">username</th>
					<th data-options="field:'remark',width:60,editor:'text'">remark</th>
				</tr>
			</thead>
		</table>


		<div id="tb" style="height: auto">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-add',plain:true" onclick="append()">新增</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-remove',plain:true" onclick="removeit()">删除</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-save',plain:true" onclick="accept()">保存</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-undo',plain:true" onclick="reject()">恢复</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-search',plain:true"
				onclick="getChanges()">GetChanges</a>
		</div>
		<div>
			<input type="submit" value="Submit"></input>
		</div>
	</form>



	<script type="text/javascript">
	

	$(function(){     
		
		            $.ajax({  
			                type: "GET",  
			                dataType: "json",  
			                url: "user.json",  
			                data: {},  
			                success: function (data) { 
                                //$.messager.alert("消息", $.uuid(), "info");  
                                //$.messager.alert("消息", JSON.stringify(data), "info");  
			                    $('#fm').form('load',data);   
			                    $('#dg').datagrid('loadData', data);
			                                },  
			                error: function (XMLHttpRequest, textStatus, errorThrown) {  
                                //$.messager.alert("消息", xhr.status, "info");  
                                //$.messager.alert("消息", xhr.readyState, "info");  
			                    //$.messager.alert("消息", xhr.responseText, "info");  
                                $.messager.alert("消息", errorThrown, "info");  
                                //$.messager.alert("消息", $.uuid(), "info");  
                                
			                }  
			            });  
		
	            
        	$('#fm').form({
        		success:function(data){
        			$.messager.alert('Info', data, 'info');
        			map = $.parseJSON(data);  

        			$('#dg').datagrid('loadData', {"total" : map.total,"rows" : map.rows});
        			}
        	});
        	});
	
/*	$('#dg').datagrid({  
		    url:'user.json'  
		});  
*/	

	

		var editIndex = undefined;
		function endEditing() {
			if (editIndex == undefined) {
				return true
			}
			if ($('#dg').datagrid('validateRow', editIndex)) {
				var ed = $('#dg').datagrid('getEditor', {
					index : editIndex,
					field : 'productid'
				});
				$('#dg').datagrid('endEdit', editIndex);
				editIndex = undefined;
				return true;
			} else {
				return false;
			}
		}
		function onClickRow(index) {
			if (editIndex != index) {
				if (endEditing()) {
					$('#dg').datagrid('selectRow', index).datagrid('beginEdit',
							index);
					editIndex = index;
				} else {
					$('#dg').datagrid('selectRow', editIndex);
				}
			}
		}
		function append() {
			if (endEditing()) {
				$('#dg').datagrid('appendRow', {
					status : 'P'
				});
				editIndex = $('#dg').datagrid('getRows').length - 1;
				$('#dg').datagrid('selectRow', editIndex).datagrid('beginEdit',
						editIndex);
			}
		}
		function removeit() {
			if (editIndex == undefined) {
				return
			}
			$('#dg').datagrid('cancelEdit', editIndex).datagrid('deleteRow',
					editIndex);
			editIndex = undefined;
		}
		function accept() {
			if (endEditing()) {
				$('#dg').datagrid('acceptChanges');
			}
		}
		function reject() {
			$('#dg').datagrid('rejectChanges');
			editIndex = undefined;
		}
		function getChanges() {
			var rows = $('#dg').datagrid('getChanges');
			alert(rows.length + ' rows are changed!');
		}
	</script>
</body>
</html>