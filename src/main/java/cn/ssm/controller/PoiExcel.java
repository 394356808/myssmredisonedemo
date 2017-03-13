
package cn.ssm.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/smapp/imsi")
public class PoiExcel
{
    // ����excel����
    @RequestMapping("exportExcel")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response)
    {
        HttpSession session = request.getSession();
        session.setAttribute("state", null);
        // ������ʾ��Ϣ��
        response.setContentType("application/vnd.ms-excel");
        String codedFileName = null;
        OutputStream fOut = null;
        try
        {
            // ����ת�룬ʹ��֧�������ļ���
            codedFileName = java.net.URLEncoder.encode("����", "UTF-8");
            response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xls");
            // response.addHeader("Content-Disposition", "attachment;   filename=" + codedFileName + ".xls");
            // ��������������
            HSSFWorkbook workbook = new HSSFWorkbook();
            //�������������
            HSSFSheet sheet = workbook.createSheet();
            for (int i = 0; i <= 30000; i++)
            {
                HSSFRow row = sheet.createRow((int)i);//����һ��
                HSSFCell cell = row.createCell((int)0);//����һ��
                cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                cell.setCellValue("���Գɹ�" + i);
            }
            fOut = response.getOutputStream();
            workbook.write(fOut);
        }
        catch (UnsupportedEncodingException e1)
        {
            System.out.println(111111111);
        }
        catch (Exception e)
        {
            System.out.println(2222222);
        }
        finally
        {
            try
            {
                fOut.flush();
                System.out.println(333333333);
                fOut.close();
                System.out.println(44444444);
            }
            catch (IOException e)
            {
                System.out.println(55555555);
            }
            session.setAttribute("state", "open");
        }
        System.out.println("�ļ�����...");
    }

    @RequestMapping("check")
    public void check(HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            if ("open".equals(request.getSession().getAttribute("state")))
            {
                request.getSession().setAttribute("state", null);
                response.getWriter().write("true");
                response.getWriter().flush();
            }
            else
            {
                response.getWriter().write("false");
                response.getWriter().flush();
            }
        }
        catch (IOException e)
        {
            System.out.println(666666666);
        }
    }

}
