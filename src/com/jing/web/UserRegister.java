package com.jing.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegister extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.write("<html>");
		out.write("	<head>");
		out.write("		<title>达内电子商务门户</title>");
		out.write("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		out.write("		<meta name=\"description\" content=\"达内电子商务门户\">");
		out.write("		<link href=\"css/tarena.css\" rel=stylesheet>");
		out.write("		<script language=\"javascript\" src=\"uservalidate.js\">");
		out.write("	       </script>");
		out.write("	</head>");
		out.write("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out.write("");
		out.write("<!-- Header Start -->");
		out.write("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out.write("			<tr>");
		out.write("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out.write("				<td width=\"62%\" background=\"images/top_bg.gif\">　</td>");
		out.write("				<td width=\"31%\" background=\"images/top_bg.gif\" align=\"right\"><img src=\"images/top_r.gif\" width=\"352\" height=\"58\" border=\"0\"></td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		out.write("");
		out.write("			<tr>");
		out.write("				<td background=\"images/dh_bg.gif\" align=\"left\" height=\"12\">");
		out.write("					<table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.write("						<tr>");
		out.write("							<td width=\"5%\"></td>");
		out.write("							");
		out.write("							<td width=\"10%\"><a href=\"../product/productList.html\"><img name=\"Image1\" border=\"0\" src=\"images/index.gif\" width=\"90\" height=\"36\"></a></td>");
		out.write("							");
		out.write("							<td width=\"10%\"><a href=\"../user/userManage.html\"><img name=\"Image2\" border=\"0\" src=\"images/reg.gif\" width=\"92\" height=\"36\"></a></td>");
		out.write("");
		out.write("							<td width=\"10%\"><a href=\"../shoppingCart/shoppingCart.html\"><img name=\"Image4\" border=\"0\" src=\"images/cart.gif\" width=\"92\" height=\"36\"></a></td>");
		out.write("");
		out.write("							<td width=\"10%\"><a href=\"../order/orderList.html\"><img name=\"Image5\" border=\"0\" src=\"images/order.gif\" width=\"92\" height=\"36\"></a></td>");
		out.write("");
		out.write("							<td width=\"10%\"><a href=\"../product/productList.html\"><img name=\"Image6\" border=\"0\" src=\"images/exit.gif\" width=\"92\" height=\"36\"></a></td>");
		out.write("						</tr>");
		out.write("					</table>");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out.write("");
		out.write("			<tr>");
		out.write("				<td width=\"65%\"><br>");
		out.write("					>> 欢迎访问 <b>达内电子商务门户</b>");
		out.write("				</td>");
		out.write("				<td width=\"35%\" align=\"right\">");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("");
		out.write("<!-- Header End -->");
		out.write("<!-- Body Start -->");
		out.write("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder2\">");
		out.write("			<tr>");
		out.write("				<td height=\"25\" valign=\"middle\">");
		out.write("					<img src=\"images/Forum_nav.gif\" align=\"absmiddle\">");
		out.write("					<a href=index.jsp>达内电子商务门户</a> → 用户注册");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("");
		out.write("		</table>");
		out.write("		<br>");
		out.write("		<form method=\"post\" name=\"reg\" onsubmit=\"return validate(this)\" action=\"../product/productList.html\">");
		out.write("			<table class=\"tableborder1\" id=\"table1\" align=\"center\" cellpadding=\"3\" cellspacing=\"1\">");
		out.write("			<tbody>");
		out.write("			<tr>");
		out.write("				<td colspan=\"2\" align=\"center\" background=\"images/bg2.gif\" height=\"25\" valign=\"middle\">");
		out.write("				<font color=\"#ffffff\"><b>新用户注册</b></font></td>");
		out.write("");
		out.write("			</tr>");
		out.write("");
		out.write("			<tr>");
		out.write("				<td class=\"tablebody1\" width=\"40%\"><b>用户名</b>:<br>");
		out.write("				英文字母或数字,最大长度8位</td>");
		out.write("				<td class=\"tablebody1\" width=\"60%\">");
		out.write("				<input maxlength=\"12\" size=\"32\" name=\"userid\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.write("				<font color=\"#ff0000\">*</font></td>");
		out.write("");
		out.write("			</tr>");
		out.write("			");
		out.write("			<tr>");
		out.write("				<td class=\"tablebody1\" width=\"40%\"><b>密码</b>:<br>");
		out.write("				数字,6到8位");
		out.write("				</td>");
		out.write("				<td class=\"tablebody1\" width=\"60%\">");
		out.write("				<input maxlength=\"12\" size=\"32\" name=\"password\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"password\">");
		out.write("				<font color=\"#ff0000\">*</font></td>");
		out.write("");
		out.write("			</tr>");
		out.write("			");
		out.write("			<tr>");
		out.write("				<td class=\"tablebody1\" width=\"40%\"><b>确认密码</b>:<br>");
		out.write("				数字,6到8位");
		out.write("				</td>");
		out.write("				<td class=\"tablebody1\">");
		out.write("				<input maxlength=\"12\" size=\"32\" name=\"password2\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"password\">");
		out.write("				<font color=\"#ff0000\">*</font></td>");
		out.write("");
		out.write("			</tr>");
		out.write("			");
		out.write("			<tr>");
		out.write("				<td class=\"tablebody1\"><b>所在地区</b>：</td>");
		out.write("				<td class=\"tablebody1\"> ");
		out.write("  			");
		out.write("				<select name=\"country\" onchange=\"javascript:initProvince(this.value)\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\">");
		out.write("					<option value=\"-1\">-----请选择(国家)-----</option>");
		out.write("					<option value=\"1\">中国</option>");
		out.write("");
		out.write("					<option value=\"2\">中国香港</option>");
		out.write("					<option value=\"3\">中国台湾</option>");
		out.write("				</select>");
		out.write("				<select name=\"province\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\">");
		out.write("					<option value=\"-1\">-----请选择(省)-----</option>");
		out.write("					<option value=\"1\">安徽</option>");
		out.write("					<option value=\"2\">北京</option>");
		out.write("");
		out.write("					<option value=\"3\">重庆</option>");
		out.write("					<option value=\"4\">福建</option>");
		out.write("					<option value=\"5\">广东</option>");
		out.write("					<option value=\"6\">甘肃</option>");
		out.write("					<option value=\"7\">广西</option>");
		out.write("					<option value=\"8\">贵州</option>");
		out.write("");
		out.write("					<option value=\"9\">河南</option>");
		out.write("					<option value=\"10\">湖北</option>");
		out.write("					<option value=\"11\">河北</option>");
		out.write("					<option value=\"12\">海南</option>");
		out.write("					<option value=\"13\">香港</option>");
		out.write("					<option value=\"14\">黑龙江</option>");
		out.write("");
		out.write("					<option value=\"15\">湖南</option>");
		out.write("					<option value=\"16\">吉林</option>");
		out.write("					<option value=\"17\">江苏</option>");
		out.write("					<option value=\"18\">江西</option>");
		out.write("					<option value=\"19\">辽宁</option>");
		out.write("					<option value=\"20\">澳门</option>");
		out.write("");
		out.write("					<option value=\"21\">内蒙古</option>");
		out.write("					<option value=\"22\">宁夏</option>");
		out.write("					<option value=\"23\">青海</option>");
		out.write("					<option value=\"24\">四川</option>");
		out.write("					<option value=\"25\">山东</option>");
		out.write("					<option value=\"26\">上海</option>");
		out.write("");
		out.write("					<option value=\"27\">陕西</option>");
		out.write("					<option value=\"28\">山西</option>");
		out.write("					<option value=\"29\">天津</option>");
		out.write("					<option value=\"30\">台湾</option>");
		out.write("					<option value=\"31\">新疆</option>");
		out.write("					<option value=\"32\">西藏</option>");
		out.write("");
		out.write("					<option value=\"33\">云南</option>");
		out.write("					<option value=\"34\">浙江</option>");
		out.write("					<option value=\"35\">其它</option>");
		out.write("				</select>");
		out.write("				<input size=\"8\" name=\"city\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">市/区/县</td>");
		out.write("			</tr>");
		out.write("			");
		out.write("			<tr>");
		out.write("");
		out.write("				<td class=\"tablebody1\"><b>联系地址1</b>:</td>");
		out.write("				<td class=\"tablebody1\">");
		out.write("				<input size=\"64\" maxlength=\"32\" name=\"street1\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("			");
		out.write("			<tr>");
		out.write("				<td class=\"tablebody1\"><b>联系地址2</b>:</td>");
		out.write("");
		out.write("				<td class=\"tablebody1\">");
		out.write("				<input size=\"64\" maxlength=\"32\" name=\"street2\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("			");
		out.write("			<tr>");
		out.write("				<td class=\"tablebody1\"><b>邮编</b>:</td>");
		out.write("				<td class=\"tablebody1\">");
		out.write("				<input size=\"32\" maxlength=\"8\" name=\"zip\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.write("");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("");
		out.write("			<tr>");
		out.write("				<td class=\"tablebody1\"><b>家庭电话</b>:</td>");
		out.write("				<td class=\"tablebody1\">");
		out.write("				<input size=\"32\" maxlength=\"16\" name=\"homephone\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.write("				</td>");
		out.write("");
		out.write("			</tr>");
		out.write("			");
		out.write("			<tr>");
		out.write("				<td class=\"tablebody1\"><b>办公室电话</b>:</td>");
		out.write("				<td class=\"tablebody1\">");
		out.write("				<input size=\"32\" maxlength=\"16\" name=\"officephone\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("			");
		out.write("			<tr>");
		out.write("");
		out.write("				<td class=\"tablebody1\"><b>手机</b>:</td>");
		out.write("				<td class=\"tablebody1\">");
		out.write("				<input size=\"32\" maxlength=\"16\" name=\"cellphone\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("			");
		out.write("			<tr>");
		out.write("				<td class=\"tablebody1\"><b>Email地址</b>:<br>");
		out.write("");
		out.write("				请输入有效的邮件地址</td>");
		out.write("				<td class=\"tablebody1\">");
		out.write("				<input size=\"32\" maxlength=\"50\" name=\"email\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\"></td>");
		out.write("			</tr>");
		out.write("			");
		out.write("			<tr>");
		out.write("				<td class=\"tablebody2\" colspan=\"2\" align=\"center\" valign=\"middle\">");
		out.write("				<input value=\"注 册\" type=\"submit\" onclick=\"../product/productList.html\">&nbsp;&nbsp;");
		out.write("				<input value=\"清 除\" type=\"reset\"></td>");
		out.write("");
		out.write("			</tr>");
		out.write("			</tbody>");
		out.write("			</table>");
		out.write("		</form>");
		out.write("<!-- Body End -->");
		out.write("<!-- Footer Start -->");
		out.write("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" height=\"28\">");
		out.write("			<tr>");
		out.write("				<td height=\"17\" background=\"images/bot_bg.gif\">");
		out.write("				</td>");
		out.write("");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.write("			<tr>");
		out.write("				<td bgcolor=\"#f1f1f6\" height=\"53\" valign=\"center\">");
		out.write("					<p align=\"center\">");
		out.write("						Copyright &copy;2004 - 2005 <a href=\"http://www.tarena.com.cn\"><b>Tarena</b><font color=\"red\">.com.cn</font></a>");
		out.write("");
		out.write("					</p>");
		out.write("				</td>");
		out.write("			</tr>");
		out.write("		</table>");
		out.write("<!-- Footer End -->");
		out.write("	</body>");
		out.write("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
