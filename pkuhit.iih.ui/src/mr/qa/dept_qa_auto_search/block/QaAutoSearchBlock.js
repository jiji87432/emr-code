Ext.define('iih.mr.qa.dept_qa_auto_search.block.QaAutoSearchBlock',{
	extend : 'Xap.ej.block.FormBlock',
	
	requires: [],

	alias:'widget.qaautosearchblock',
	
	border: 0,

	items: [{
//		title: '自动质控工作查询',
		xtype: 'xapform',
	layout: {
		type: 'table',
		columns: 3,
		tableAttrs: {
            border: 0,
            cellpadding: 0,
            cellspacing: 1,
            width: '100%',
            height:86
        },
        tdAttrs: {
            valign: 'left'
        }
	},
	items:[{
			xtype:'comboxgrid',
//			margin:'10 0 10 0',
			name:'curDeptNm',
			method:'curDeptNm',
			url: 'organization/keyword',//科室查询的url
			fieldLabel:'科室',
			labelAlign : 'right',
			labelWidth : 50,
			listWidth:230,    //gird的宽度
			width:210,        //combo的宽度
			valueField : 'code',//科室编码的字段名
			displayField: 'name',//科室名称的字段名
			columns: [{              //grid的column配置
			   text: '科室编码',
			   dataIndex: 'code',
			   width:80
			},{
			   text: '科室',
			   flex:1,
			   dataIndex: 'name'
			}],
			callback:function(newValue,oldValue,record){  //在grid选择记录后的回调函数
				var view = this.up('qaautosearchview');
				var initChain = view.getActionChain('search');
				initChain.execute({
					curDeptNm:newValue
				});
			}
		},{
	        xtype:'comboxgrid',
	        name:'currentManageDoctorName',
//	        margin:'0 100 10 150',
	        fieldLabel:'主管医师',
	        url: 'employee',
	        labelAlign : 'right',
			labelWidth : 60,
			listWidth:230,    //gird的宽度
			width:210, 
	        valueField : 'id',
	        displayField: 'name',
	        searchParam: {'deptCd': IMER_GLOBAL.department.code},
	        columns: [{
	           text: '人员id',
	           dataIndex: 'id',
	           width:70
	        },{
	           text: '医师姓名',
	           flex:1,
	           dataIndex: 'name'
	        }],
			callback:function(newValue,oldValue,record){  //在grid选择记录后的回调函数
				var view = this.up('qaautosearchview');
				var initChain = view.getActionChain('search');
				initChain.execute({
					currentManageDoctorName:newValue
				});
			  }
	    },{
			xtype: 'xapradiogroup',
			border: 1,
			style: {
	    		borderStyle: 'dashed'
			},
			method:'inOrOut',
			margin:'0 0 0 15',
			items: [
				{boxLabel: '在院患者', name: 'enStaCd',width:85, inputValue: '1',checked: true},
				{boxLabel: '出院未完成', name: 'enStaCd', width:85,inputValue: '2'}
			]		   	
	    }]
	}]
})