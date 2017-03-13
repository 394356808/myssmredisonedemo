   /***********µº≥ˆstart************/
	var excel_flag = 0;
	var win_check;
    var exportExcelBtn = new Ext.Button({
        renderTo:'exportExcelBtn',
        text:"<span class='marL10'>"+'µº≥ˆ'+"</span>",
        height:24,
        iconCls:'findnew',
        width:110,
        bodyStyle:'padding:5px',
        handler: function()
        {
            excel_flag = 0;
            //Ω˚”√∞¥≈•
        	exportExcelBtn.disable();
        	location.href = "exportExcel";
        	//√ø∏Ù“ª√ÎœÚ∫ÛÃ®∑¢ÀÕ«Î«Û
        	win_check = window.setInterval(check, 1000);  
        }
    });
    
    /**
     * ”√”⁄∑¿÷π÷ÿ∏¥Ã·Ωª
     */
    function check()
    {
    	excel_flag ++;
    	if(excel_flag > 30)
    	{
    		//«Âø’∂® ±∆˜
    		window.clearInterval(win_check);
    		//∆Ù”√∞¥≈•
    		exportExcelBtn.enable();
    	}
    	Ext.Ajax.request(
        	{
            	url : 'check',
            	success : function (response, result)
            	{
            		if(response.responseText=="true")
            		{
            			//«Âø’∂® ±∆˜
            			window.clearInterval(win_check);
            			//∆Ù”√∞¥≈•
            			exportExcelBtn.enable();
            		}
            	}
        	})
    }
    /***********µº≥ˆend*****************/