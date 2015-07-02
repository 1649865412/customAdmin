<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ include file="/common/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<TITLE>双乾e支付网关配置</TITLE>
</head>
<body id="mine">
<content tag="buttons">
<cartmatic:cartmaticBtn btnType="save" onclick="$j('#configForm').submit();return false;" />
<cartmatic:cartmaticBtn btnType="cancel" onclick="location.href='${ctxPath}/system/paymentMethod.html';" />
</content>
<body>
<form class="mainForm" id="configForm" name="configForm" method="post" action="paymentMethod.html">
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="table-content">
	<tr>
		<th colspan="2">
			95ePay双乾e支付网关配置
	  		<input type="hidden" name="paymentMethodId" value="${paymentMethod.paymentMethodId}"/>
			<input type="hidden" name="doAction" value="saveConfigAction"/>
		</th>
	</tr>
	<tr>
		<td class="FieldLabel">
			商户ID
		</td>
		<td>
			<INPUT class="form-inputbox" size="40" name="merNo" value="${paymentMethod.configData.merNo}"/>
		</td>
   	</tr>
   	<tr>
		<td class="FieldLabel">
			MD5key值
		</td>
		<td>
			<INPUT class="form-inputbox" size="40" name="md5key" value="${paymentMethod.configData.md5key}"/>
		</td>
   	</tr>
   	<tr>
		<td class="FieldLabel">
			POST URL
		</td>
		<td>
			<INPUT class="form-inputbox" size="40" name="postUrl" value="${paymentMethod.configData.postUrl}"/>
			<br/>
			https://security.ssltrustpay.com/sslpayment
			<br/>
			https://www.95gateway.com/sslpayment
		</td>
   	</tr>
</table>
</form>
</body>
</html>